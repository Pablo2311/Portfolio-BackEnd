package com.portfolio.Backend.Controller;

import com.portfolio.Backend.Model.About;
import com.portfolio.Backend.Service.IAboutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin ("https://portfolio-angular-8c6ad.web.app/")
public class Controller {
    
    @Autowired
    private IAboutService interAbout;
    
    @GetMapping ("/sobre-mi")
    //@CrossOrigin ("https://portfolio-angular-8c6ad.web.app/")
    public List<About> getAbout () {
        return interAbout.getAbout();
    }
    
    @PostMapping ("/sobre-mi/crear")
    public String crearAbout(@RequestBody About sobre) {
        interAbout.saveAbout(sobre);
        return "Sobre mí creado correctamente";
    }
    
    @DeleteMapping ("/sobre-mi/borrar/{id}")
    public String borrarAbout (@PathVariable Long id) {
        interAbout.deleteAbout(id);
        return "Sobre mí eliminadado correctamente";
    }
    
    @PutMapping ("/sobre-mi/editar/{id}")
    public String editarAbout (@PathVariable Long id,
                               @RequestParam ("titulo") String nuevoTitulo,
                               @RequestParam ("parrafo") String nuevoParrafo) {
        
        About sobre = interAbout.findAbout(id);
        
        sobre.setTitulo(nuevoTitulo);
        sobre.setParrafo(nuevoParrafo);
        
        interAbout.saveAbout(sobre);
        
        //return sobre;
        return "Sobre mí editado correctamente";
    }
}
