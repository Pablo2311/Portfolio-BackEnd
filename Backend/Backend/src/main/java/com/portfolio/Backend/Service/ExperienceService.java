package com.portfolio.Backend.Service;

import com.portfolio.Backend.Model.Experience;
import com.portfolio.Backend.Repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {
    
    @Autowired
    private ExperienceRepository ExpRepo;

    @Override
    public List<Experience> getExperience() {
        List<Experience> listaExp = ExpRepo.findAll();
        return listaExp;
    }

    @Override
    public void saveExperience(Experience exp) {
        ExpRepo.save(exp);
    }

    @Override
    public void deleteExperience(Long id) {
        ExpRepo.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        Experience exp = ExpRepo.findById(id).orElse(null);
        return exp;
    }
}
