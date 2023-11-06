package com.demo.controller;

import com.demo.dao.UserDao;
import com.demo.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.demo.dao.UserDao.login;
import static com.demo.dao.UserDao.register;

public class AuthController {
    private static UserDao userDao;

    public AuthController() {
        userDao = new UserDao();
    }

    @RequestMapping("/login")
    public String processLogin(@ModelAttribute("user") User user) {
        if (login(user)) {
            return "index";
        }
        return "login";
    }

    @RequestMapping("/register")
    public String processRegistration(@ModelAttribute("user") User user) {
        if (register(user)) {
            return "index";
        }
        return "processRegister";
    }
}
