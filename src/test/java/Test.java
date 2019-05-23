import com.lzjd.mis.graduate.api.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        Long year=Long.valueOf(c.get(Calendar.YEAR)) ;
        System.out.println(year);
        Long month = Long.valueOf( c.get(Calendar.MONTH));
        System.out.println(month);

    }
}
