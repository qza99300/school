package com.school.controller;

import com.school.entity.User;
import com.school.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public String getHello(Model model) {
        User newUser = new User();
        newUser.setName(System.currentTimeMillis()+"");
        userService.save(newUser);
        User user = userService.getById(1);
        List<User> all = userService.findAll();

        model.addAttribute("user",user);
        model.addAttribute("all",all);

        return "index";
    }
}
