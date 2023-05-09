package com.portfolio.Backend.Controller;

import com.portfolio.Backend.Model.Experience;
import com.portfolio.Backend.Service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin ("http://localhost:4200")
public class ExperienceController {
    
    @Autowired
    private IExperienceService interExp;
    
    @GetMapping ("/experiencia")
    public List<Experience> getExperience () {
        return interExp.getExperience();
    }
    
    @GetMapping ("/experiencia/{id}")
    public Experience getUnaTarea (@PathVariable Long id) {
        return interExp.findExperience(id);
    }
    
    
    @PostMapping ("/experiencia/crear")
    public String crearExperience(@RequestBody Experience exp) {
        interExp.saveExperience(exp);
        return "Experiencia creada correctamente";
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public String borrarExperience (@PathVariable Long id) {
        interExp.deleteExperience(id);
        return "Experiencia eliminada correctamente";
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    public String editarExperience (@RequestBody Experience exp, @PathVariable Long id){
        
        Experience expActual = interExp.findExperience(id);
        
        //expActual.setTitulo(exp.getTitulo());
        expActual.setEmpleador(exp.getEmpleador());
        expActual.setDesde(exp.getDesde());
        expActual.setHasta(exp.getHasta());
        expActual.setPuesto(exp.getPuesto());
        expActual.setDescripcion(exp.getDescripcion());
        
        interExp.saveExperience(exp);
        
        
        return "Experiencia editada correctamente";
    }
}
