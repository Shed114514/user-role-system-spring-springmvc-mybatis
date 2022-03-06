package com.shed.controller;

import com.shed.domain.User;
import com.shed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register")
    public String register(User user) {
        userService.add(user);
        return "redirect:/login.jsp";
    }

    @RequestMapping(value = "/login")
    public String login(HttpSession session, Integer uid, String password) {
        User user = userService.loginWithUidAndPassword(uid,password);
        if (user != null) {
            session.setAttribute("user",user);
            return "redirect:/user/home";
        }
        return "redirect:/login.jsp";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login.jsp";
    }
}
