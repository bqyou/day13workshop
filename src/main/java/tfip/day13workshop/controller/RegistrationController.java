package tfip.day13workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import tfip.day13workshop.models.Person;

@Controller
@RequestMapping(path = "/register")
public class RegistrationController {

    @GetMapping
    public String getRegForm(Model model) {
        model.addAttribute("registration", new Person()); // use same variable name for registration
        return "register";
    }

    @PostMapping
    public String postReg(@Valid @ModelAttribute("registration") Person p,
            BindingResult bResult, Model model) {
        if (bResult.hasErrors()) {
            model.addAttribute("registration", p);
            return "register";
        }
        return "thankyou";
    }
}
