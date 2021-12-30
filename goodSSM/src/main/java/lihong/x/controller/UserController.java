package lihong.x.controller;

import lihong.x.pojo.User;
import lihong.x.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:http://localhost:8080/goodSSM/login.html";
    }

    /**
     * 登录
     *
     * @param username
     * @param password
     * @param checkCode
     * @param request
     * @return
     */
    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("checkCode") String checkCode, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String code = session.getAttribute("checkCode").toString();
        if (code.equals(checkCode)) {
            User user = userService.userLogin(username, password);
            System.out.println(user);
            if (user != null) {
                session.setAttribute("user", user);
                //request.getRequestDispatcher("/goodSSM/index.html");
                return "success";
            } else {
                return "error";
            }
        } else {
            return "error";
        }
    }

    /**
     * 生成验证码
     *
     * @param request
     * @return
     */
    @RequestMapping("/code")
    @ResponseBody
    public Integer getCode(HttpServletRequest request) {
        // 生成1000 到 9999 的随机数
        /// Math.random会生成大于等于0小于1的小数
        Integer i = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
        String code = i.toString();
        HttpSession session = request.getSession();
        session.setAttribute("checkCode", code);
        return Integer.parseInt(code);
    }
}
