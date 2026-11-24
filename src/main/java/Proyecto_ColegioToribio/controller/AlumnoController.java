package Proyecto_ColegioToribio.controller;
import  Proyecto_ColegioToribio.model.Alumno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class AlumnoController {
    
    @GetMapping("/alumnos")

    public String listarAlumnos(Model model) {
        
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(1L, "A001", "Juan", "Perez"));
        alumnos.add(new Alumno(2L, "A002", "Maria", "Gonzalez"));
        alumnos.add(new Alumno(3L, "A003", "Pedro", "Lopez"));
        alumnos.add(new Alumno(4L, "A004", "Ana", "Martinez"));


        model.addAttribute("alumnos", alumnos);

        return "alumnos/listar";
    }
    
}
