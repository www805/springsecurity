package com.zhuang.controller;

import com.zhuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index(){

        ArrayList<User> users = new ArrayList<User>();
        User user = new User(1, "zs", "北京");
        User user1 = new User(2, "ls", "上海");
        User user2 = new User(3, "ww", "广州");
        User user3 = new User(4, "zl", "深圳");

        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        view.addObject("key", "我爱你");
        view.addObject("users", users);
        return view;
    }

}
