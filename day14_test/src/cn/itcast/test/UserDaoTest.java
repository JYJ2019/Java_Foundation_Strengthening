package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.Test;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2021/1/8 18:21
 * @Version 1.0
 */
public class UserDaoTest {
    @Test
    public void testLogin() {
        User loginuser = new User();
        loginuser.setUsername("baby");
        loginuser.setPassword("123123");

        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
