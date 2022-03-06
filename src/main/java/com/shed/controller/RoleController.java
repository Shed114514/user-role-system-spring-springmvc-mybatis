package com.shed.controller;

import com.shed.domain.Role;
import com.shed.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/addUI")
    public String addUI() {
        return "role-add";
    }

    @RequestMapping(value = "/add")
    public String addRole(Role role) {
        roleService.add(role);
        return "redirect:/role/list";
    }

    @RequestMapping(value = "/delete/{roleId}")
    public String deleteRole(@PathVariable("roleId") Integer roleId) {
        roleService.removeByRid(roleId);
        return "redirect:/role/list";
    }

    @RequestMapping(value = "/list")
    public String roleList(Model model) {
        List<Role> roleList = roleService.findAll();
        model.addAttribute("roleList",roleList);
        return "role-list";
    }
}
