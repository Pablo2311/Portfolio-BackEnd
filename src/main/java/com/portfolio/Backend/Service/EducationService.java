package com.portfolio.Backend.Service;

import com.portfolio.Backend.Model.Education;
import com.portfolio.Backend.Repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService {
    
    @Autowired
    private EducationRepository EduRepo;

    @Override
    public List<Education> getEducation() {
        List<Education> listaEdu = EduRepo.findAll();
        return listaEdu;
    }

    @Override
    public void saveEducation(Education edu) {
        EduRepo.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        EduRepo.deleteById(id);
    }

    @Override
    public Education findEducation(Long id) {
        Education edu = EduRepo.findById(id).orElse(null);
        return edu;
    }
}
