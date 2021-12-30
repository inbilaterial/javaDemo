package lihong.x.dao;

import lihong.x.pojo.Rpm2;
import lihong.x.pojo.User;

import javax.annotation.Resource;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
@Resource
public interface UserDao {
    /**
     * 注册
     * @param user  user
     */
    void addUser(User user);

    /**
     * 登陆
     * @param user
     * @return
     */
    User userLogin(Rpm2 user);
}
