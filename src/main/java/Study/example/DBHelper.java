package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    //    Mysql5.5及以上版本需要在数据库名称test1后面添加?charart---等解释,5.5以下的版本则不用
    public static final String URL="JDBC:mysql://localhost:3306/test1?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
    //    数据库账号
    public static final String USERNAME="root";
    //    账号密码
    public static final String PSW="hipi336699";
    public static Connection Conn;

    public static Connection getConn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Conn = DriverManager.getConnection(URL,USERNAME,PSW);
                String sql = "select * from ";
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Conn;
    }
    //    关闭数据库
    public static void closeconn(Connection conn){
        if (Conn!=null){
            try {
                Conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //若不为空则代表连接成功
    public static void main(String[] args) {
        System.out.println(DBHelper.getConn());
    }
}

