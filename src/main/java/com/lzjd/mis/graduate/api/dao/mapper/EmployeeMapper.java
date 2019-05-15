package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.Employee;
import com.lzjd.mis.graduate.api.domain.responses.EmployeeHomeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    Employee selectByName(String name);

    /**
     * 验证名字是否重复
     * @param name
     * @param id
     * @return
     */
    Integer checkName(@Param("name")String name, @Param("id")Long id);

    List<Employee> getEmployeelist();



    List<EmployeeHomeVo>getHomeList();


    Employee selectByCode(String code);
}