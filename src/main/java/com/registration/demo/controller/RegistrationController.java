package com.registration.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RestController
public class RegistrationController {

    @RequestMapping("/regform")
    public String register() {
        return "registration";
    }

    @RequestMapping("/userDetail")
    public ModelAndView userInfo(UserRegistration reg) {
        ModelMap model = new ModelMap();
        model.addAttribute("uname", reg.getUName());
        model.addAttribute("email", reg.getEmailId());
        model.addAttribute("gender", reg.getGender());
        model.addAttribute("position", reg.getPosition());

        ModelAndView view = new ModelAndView("user-detail");
        view.addObject("regObj", reg);
        return view;
    }
}