
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author naoal
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String principal(Model model) {
        //model.addAttribute("attribute", "value");
        return "index";
    }
    @RequestMapping("/informacion")
    public String contacto(Model model) {
        //model.addAttribute("attribute", "value");
        return "contacto";
    }
}
