/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.desdeNB;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author USUARIO
 */
@Controller
public class ControladorInicio {
    @GetMapping ("/")
    public String inicio (Model model) {
        var msg= "Hola desde el controlador";
        var persona = new Persona();
        persona.setNombre("Violeta");
        persona.setApellido("Evergarden");
        persona.setEmail("VioletEver@gmail.com");
        persona.setTelefono("12345");
       
        var persona2= new Persona ();
        persona2.setNombre("Rita");
        persona2.setApellido("Castle");
        persona2.setEmail("RitaCas@gmail.com");
        persona2.setTelefono("78634");
       
        var personas = Arrays.asList(persona,persona2);
        
       
        model.addAttribute("personas",personas);
        model.addAttribute("msg",msg);
        
        return "index";
    }
    @GetMapping("/dirección")
    public String dire () {
        return "Segunda pagina";
    }
}
