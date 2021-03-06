package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description：操作数据库中User表的类
 * @Author 金宇佳
 * @Date 2021/1/8 16:12
 * @Version 1.0
 */

public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    /**
     * 登录方法
     * @param loginUser 只有用户名和密码
     * @return  user包含用户全部数据,没有查询到,返回null
     */
    public User login(User loginUser) {
        try {
            //1.编写sql
            String sql = "SELECT * FROM user WHERE username = ? AND PASSWORD = ?";
            //2.调用query方法
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());

            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();//记录日志
            return null;
        }
    }
}
