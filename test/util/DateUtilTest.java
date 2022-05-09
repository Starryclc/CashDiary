package util;

import org.junit.Test;

public class DateUtilTest {
    @Test
    public void test(){
        System.out.println(DateUtil.util2sql(DateUtil.today()));
        System.out.println(DateUtil.monthBegin());
        System.out.println(DateUtil.monthEnd());
        System.out.println(DateUtil.thisMonthLeftDay());
        System.out.println(DateUtil.thisMonthTotalDay());
    }
}
