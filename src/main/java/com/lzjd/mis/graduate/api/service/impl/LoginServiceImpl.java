package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.base.config.UrlConfig;
import com.lzjd.mis.graduate.api.base.enumtype.EncodingRuleType;
import com.lzjd.mis.graduate.api.dao.mapper.CustomerMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EmployeeMapper;
import com.lzjd.mis.graduate.api.dao.mapper.EncodingRuleDao;
import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import com.lzjd.mis.graduate.api.domain.pojo.Employee;
import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import com.lzjd.mis.graduate.api.domain.pojo.User;
import com.lzjd.mis.graduate.api.service.LoginService;
import com.lzjd.mis.graduate.api.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import sun.net.www.http.HttpClient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Classname: LoginServiceImpl
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/19
 * @Version 1.0
 * @Since 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private EncodingRuleDao encodingRuleDao;

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public HttpResponse login(User user, Byte type) {
        try{

            //如果type等于0则说明是客户登陆
            if (type==0){
                // 通过用户名查询用户
                //验证密码是否通过
                Customer customer =customerMapper.selectByName(user.getUserName());
                if(customer.equals(null)){
                    return HttpResponse.failure("用户不存在");
                }else if(!user.getPassword().equals(customer.getCustomerPassword())){
                    return HttpResponse.failure("密码错误");
                }else {
                    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                    HttpSession session = request.getSession();
                    session.setAttribute("username",user.getUserName());
                    session.setAttribute("code",customer.getCustomerCode());
                    return HttpResponse.success("登录成功");
                }

            }else {
                //如果是用户登陆
                // 通过用户名查询用户
                Employee employee = employeeMapper.selectByName(user.getUserName());
                // 验证用户是否可以登录
                if(employee.equals(null)){
                    return HttpResponse.failure("用户不存在");

                }else if(employee.getStatusCode().equals(0)) {
                   return HttpResponse.failure("你已离职无法登录");
                }else if(!user.getPassword().equals(employee.getName())){
                   // 验证密码是否相等
                   return HttpResponse.failure("密码错误");
               }else {

                    if("admin".equals(employee.getName())){
                        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                        HttpSession session = request.getSession();

                        session.setAttribute("username",employee.getName());
                        session.setAttribute("code",employee.getCode());
                       return HttpResponse.success("admin");
                    }else {
                        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                        HttpSession session = request.getSession();

                        session.setAttribute("username",employee.getName());
                        session.setAttribute("code",employee.getCode());
                        return HttpResponse.success("employee");
                    }
               }
            }

        }catch ( Exception e){
            return HttpResponse.failure("登陆失败");
        }





    }

    /**
     * 退出登录用户信息
     * @param request
     * @return
     */
    @Override
    public HttpResponse logout(HttpServletRequest request) {
        try {
            /**
             * 获取session
             */
            HttpSession session = request.getSession();
            /**
             * 用户退销毁session
             */
            session.invalidate();

            return HttpResponse.success();

        }catch (Exception e){
            return HttpResponse.failure();
        }

    }

    /**
     *
     * @param customer
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)//开启事务，一旦注册失败，所有对数据库的操作都撤销
    public HttpResponse checkIn(Customer customer) {
        try {
            //验证名字是否重复
            Integer integer=customerMapper.checkName(customer.getCustomerName(),null);
            if(integer>0){
                return HttpResponse.failure("名字重复无法添加");
            }
            // 获取客户编码
            EncodingRule encodingRule = encodingRuleDao.getNumberingType(EncodingRuleType.CUSTOMER_CODE);
            //给客户设置编码
            customer.setCustomerCode("KH"+encodingRule.getNumberingValue());

            //更新编码尺度
            encodingRuleDao.updateNumberValue(encodingRule.getNumberingValue(),encodingRule.getId());

            //插入客户
            int i = customerMapper.insertSelective(customer);

            return HttpResponse.success(i);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpResponse.failure("注册失败");
        }
    }



    @Override
    public String Upload(MultipartFile file) {
        if(!file.isEmpty()) {
            // 获取文件名称,包含后缀
            String fileName = file.getOriginalFilename();

            // 存放在这个路径下：该路径是该工程目录下的static文件下：(注：该文件可能需要自己创建)
            // 放在static下的原因是，存放的是静态文件资源，即通过浏览器输入本地服务器地址，加文件名时是可以访问到的
//            String path = "D://temp-rainy//";
            String  path =System.getProperty("user.dir")+"/";

            try {
                // 该方法是对文件写入的封装，在util类中，导入该包即可使用，后面会给出方法
                FileUtil.fileupload(file.getBytes(), path, fileName);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }

            // 接着创建对应的实体类，将以下路径进行添加，然后通过数据库操作方法写入
           String url;
            String addr = null;
            try {
                addr = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            try {
                System.out.println(InetAddress.getLocalHost());
                url =  "http://"+InetAddress.getLocalHost().getHostAddress()+":9021/temp-rainy/"+fileName;
            } catch (UnknownHostException e) {
                e.printStackTrace();
                return null;
            }
            return url;

        }
        return null;
    }
}
