package lihong.x.service;

import lihong.x.pojo.User;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
public interface UserService {

    /**
     * 注册用户
     *
     * @param user 用户实体
     */
    void addUser(User user);

    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    User userLogin(String username, String password);
}
