package cn.itcast.jdbctemplate;

import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description：JdbcTemplate入门
 * @Author 金宇佳
 * @Date 2020/12/31 11:03
 * @Version 1.0
 */
public class jdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "UPDATE account SET balance = 5000 WHERE id = ?";
        int count = template.update(sql, 1);
        System.out.println(count);
    }
}
