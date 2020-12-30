package cn.itcast.jdbc;

import java.sql.*;

/**
 * @Description：JDBC_ResultSet遍历结果集
 * @Author 金宇佳
 * @Date 2020/12/29 11:32
 * @Version 1.0
 */
public class JDBCDome7 {
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
            //循环判断游标是否是最后一行末尾。
            while (resultSet.next()) {
                //获取数据
                //6.2获取数据
                int id = resultSet.getInt("id");
                String name = resultSet.getString("NAME");
                String balance = resultSet.getString("balance");
                System.out.println(id + "---" + name + "---" + balance);
            }
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
