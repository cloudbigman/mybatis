import java.sql.*;

public class DbUitls {
    //JDBC与数据库连接参数
    private static String DRIVERCLASSNAME = "org.gjt.mm.mysql.Driver";
    private static String URL = "jdbc:mysql:///mybatisdemo";
    private static String USERNAME = "root";
    private static String PASSWORD = "hjx@xzit.edu.cn";

    //（1）加载驱动程序--放在静态块中
    static{
        try {
            Class.forName(DRIVERCLASSNAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //（2）定义一个创建Connection对象的方法
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }

    //（3）定义关闭ResultSet、Statement、Connection对象
    public static void close(ResultSet rs, Statement stmt,Connection conn){
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if(stmt!=null){
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Statement stmt,Connection conn){
        try {
            if(stmt!=null){
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
