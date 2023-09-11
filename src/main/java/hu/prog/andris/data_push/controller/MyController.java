package hu.prog.andris.data_push.controller;

import hu.prog.andris.data_push.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    List<User> users = new ArrayList<>();
    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/reg")
    public String getRegPage(){
        return "reg";
    }

    @GetMapping("/show")
    public String getShowPage(Model model){
        model.addAttribute("users", users);
        return "show";
    }

    @PostMapping("/regist")
    public String register(User user){
        users.add(user);
        System.out.println(user);
        return "redirect:/home";
    }
}
