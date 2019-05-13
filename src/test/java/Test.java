import com.lzjd.mis.graduate.api.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname: Test
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/13
 * @Version 1.0
 * @Since 1.0
 */
public class Test {
    @org.junit.Test
    public void Hell(){
 String time = DateUtil.formattingDate(DateUtil.DATE_FORMAT_YYYYMMDD,new Date());
        System.out.println(time);
    }
}
