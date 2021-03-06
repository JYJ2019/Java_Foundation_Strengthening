package cn.itcast.jdbc;

import java.sql.*;

/**
 * @Description：JDBC_ResultSet基本使用
 * @Author 金宇佳
 * @Date 2020/12/29 10:38
 * @Version 1.0
 */
public class JDBCDemo6 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            //3.定义sql
            String sql = "SELECT * FROM account";
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            resultSet = stmt.executeQuery(sql);
            //6.处理结果
            //6.1让游标向下移动一行
            resultSet.next();
            //6.2获取数据
            int id = resultSet.getInt(1);
            String name = resultSet.getString("NAME");
            String balance = resultSet.getString("balance");
            System.out.println(id + "---" + name + "---" + balance);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
