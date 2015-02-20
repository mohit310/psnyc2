package com.psnyc.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohit on 2/19/15.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "SPRING");
        return "index";
    }

}
