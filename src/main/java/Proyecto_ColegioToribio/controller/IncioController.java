package Proyecto_ColegioToribio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncioController {
    
    @GetMapping ("/")
    public String inicio(Model model) {
        
        model.addAttribute(
            "colegio",
            "Toribio Rodriguez de Mendoza"
            
        );

        return "pages/1";
    }
}
