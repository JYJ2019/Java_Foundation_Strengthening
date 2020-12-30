package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Description：c3p0演示
 * @Author 金宇佳
 * @Date 2020/12/30 17:05
 * @Version 1.0
 */
public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        /*//1. 获取DataSource，使用默认配置
        DataSource ds = new ComboPooledDataSource();

        //2.获取连接

        for (int i = 1; i <= 11; i++) {
            Connection coon = ds.getConnection();
            System.out.println(i + ":" + coon);

            if (i == 5) {
                coon.close();//归还连接到连接池中
            }
        }*/

        testNameConfig();
    }

    private static void testNameConfig() throws SQLException {
        // 1.1 获取DataSource，使用指定名称配置
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        //2.获取连接
        for (int i = 1; i <= 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":"+ conn);
        }
    }


}
