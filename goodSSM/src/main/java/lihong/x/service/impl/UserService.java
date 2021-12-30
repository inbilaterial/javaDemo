package lihong.x.service.impl;

import lihong.x.dao.UserDao;
import lihong.x.pojo.Rpm2;
import lihong.x.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
@Service
public class UserService implements lihong.x.service.UserService {
    @Resource
    private UserDao userDao;


    public void addUser(User user) {
        userDao.addUser(user);
    }

    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    public User userLogin(String username, String password) {
        Rpm2 rpm2 = new Rpm2(username, password);
        return userDao.userLogin(rpm2);
    }
}
