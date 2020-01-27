package com.neiloyv.controller;

import com.neiloyv.model.User;
import com.neiloyv.service.SecurityService;
import com.neiloyv.service.UserService;
import com.neiloyv.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {

        userValidator.validate(userForm, bindingResult);

        if(bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);
        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
    public String login(Model model, String errors, String logout) {
        if (errors != null) {
            model.addAttribute("error", "Имя пользователя или пароль неправильные");
        }

        if (logout != null) {
            model.addAttribute("message", "Логирование прошло успешно");
        }

        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"},
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
    public String welcome(Model model) {
        return "welcome";
    }

    @RequestMapping(value = "/admin",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
    public String admin(Model model) {
        return "admin";
    }




}
