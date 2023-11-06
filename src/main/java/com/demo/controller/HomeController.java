package com.demo.controller;

import com.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        return "index";
    }

    @RequestMapping("/login")
    public String showForm() {
        return "login";
    }

    @RequestMapping("/register")
    public String processForm() {
        return "register";
    }

    @RequestMapping("/processRegister")
    public String processForm(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("bloodGroup") String bloodGroup,
            @RequestParam("language") String language,
            @RequestParam("os") String os,
            Model model
    ) {
        name = "Name: " + name;
        email = "Email: " + email;
        password = "Password: " + password;
        bloodGroup = "Blood Group: " + bloodGroup;
        language = "Known Languages: " + language;
        os = "Operating System: " + os;

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setBloodGroup(bloodGroup);
        user.setLanguage(language);
        user.setOs(os);

        model.addAttribute("user", user);

        return "login";
    }

}
