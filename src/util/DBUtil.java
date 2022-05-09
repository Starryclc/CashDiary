package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static String user = "root";
    private static String password = "admin";
    private static String database = "bill";
    private static int port = 3306;
    private static String ip = "127.0.0.1";

    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("数据库启动器启动");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=UTF-8",ip, port,database);
        Connection conn = DriverManager.getConnection(url,user,password);
        //System.out.println("数据库连接成功");
        return conn;
    }


}
