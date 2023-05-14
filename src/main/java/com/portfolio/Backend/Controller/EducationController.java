package com.portfolio.Backend.Controller;

import com.portfolio.Backend.Model.Education;
import com.portfolio.Backend.Service.IEducationService;
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
public class EducationController {
    
    @Autowired
    private IEducationService interEdu;
    
    @GetMapping ("/educacion")
    public List<Education> getExperience () {
        return interEdu.getEducation();
    }
    
    @GetMapping ("/educacion/{id}")
    public Education getUnaEducation (@PathVariable Long id) {
        return interEdu.findEducation(id);
    }
    
    
    @PostMapping ("/educacion/crear")
    public String crearEducation(@RequestBody Education edu) {
        interEdu.saveEducation(edu);
        return "Educación creada correctamente";
    }
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public String borrarEducation (@PathVariable Long id) {
        interEdu.deleteEducation(id);
        return "Educación eliminada correctamente";
    }
    
    @PutMapping ("/educacion/editar/{id}")
    public String editarEducation (@RequestBody Education edu, @PathVariable Long id){
        
        Education eduActual = interEdu.findEducation(id);
        
        eduActual.setInstitucion(edu.getInstitucion());
        eduActual.setDesde(edu.getDesde());
        eduActual.setHasta(edu.getHasta());
        eduActual.setDescripcion(edu.getDescripcion());
        
        interEdu.saveEducation(edu);
        
        
        return "Educación editada correctamente";
    }
}
