package lihong.x;

import lihong.x.controller.UserController;
import lihong.x.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = {"classpath:applicationContext.xml"})
public class TestDemo {
    @Autowired
    private UserController userController;

    @Test
    public void test01() {
        User user = new User();
        user.setUsername("王五");
        user.setPassword("123");
        user.setEmail("ww@123.ww");
        user.setNickname("ww");
        userController.addUser(user);
    }
}
