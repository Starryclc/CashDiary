package util;

import org.junit.Test;

import java.util.Date;

public class DataUtilTest {
    @Test
    public void test(){
        System.out.println(DateUtil.today());
        System.out.println(DateUtil.monthBegin());
        System.out.println(DateUtil.monthEnd());
        System.out.println(DateUtil.thisMonthLeftDay());
        System.out.println(DateUtil.thisMonthTotalDay());
    }
}
