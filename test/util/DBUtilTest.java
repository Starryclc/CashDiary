package util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtilTest {
    @Test
    public void test() throws SQLException {
        Connection conn = DBUtil.getConnection();
    }

}
