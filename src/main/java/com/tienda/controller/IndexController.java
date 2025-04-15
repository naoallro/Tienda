
package com.tienda.controller;

import jakarta.servlet.http.HttpSession;
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
    public String principal(Model model, HttpSession session) {
        //model.addAttribute("attribute", "value");
        Long idUsuario = (Long)session.getAttribute("idUsuario");
        return "index";
    }
//    @RequestMapping("/informacion")
//    public String contacto(Model model) {
//        //model.addAttribute("attribute", "value");
//        return "contacto";
//    }
}
