package org.fedster.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String loginPage() {
        return "loginpage";
    }

    @RequestMapping("/access")
    public String loadFromPage(@RequestParam("login") String login, String password, Model model) {
        model.addAttribute("loginval", login);
        model.addAttribute("password", password);
        if (password.equals("12345678"))
            return "confirm";
        else
            return "error";
    }
}
