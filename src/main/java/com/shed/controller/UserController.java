package com.shed.controller;

import com.shed.domain.Role;
import com.shed.domain.User;
import com.shed.service.RoleService;
import com.shed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/home")
    public String userHome() {
        return "home";
    }

    @RequestMapping(value = "/list")
    public String userList(Model model) {
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "user-list";
    }

    @RequestMapping(value = "/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId) {
        userService.removeByUid(userId);
        return "redirect:/user/list";
    }

    @RequestMapping(value = "/role/add/{userId}")
    public String addRoleUI(@PathVariable("userId") Integer userId, Model model) {
        List<Role> roleList = roleService.findAll();
        model.addAttribute("userId",userId);
        model.addAttribute("roleList",roleList);
        return "user-role-add" ;
    }

    @RequestMapping(value = "/role/add")
    public String addRoleToUser(Integer uid, Integer[] rids) {
        userService.addRoleToUser(uid,rids);
        return "redirect:/user/list";
    }

}
