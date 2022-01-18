package com.example.web.controllerHello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/greeting")
    public String helloWorldController(@RequestParam(name = "name", required = false, defaultValue = "ТОМ") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
