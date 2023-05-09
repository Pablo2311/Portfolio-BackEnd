package com.portfolio.Backend.Service;

import com.portfolio.Backend.Model.Experience;
import java.util.List;

public interface IExperienceService {
    
    public List<Experience> getExperience ();
    
    public void saveExperience (Experience exp);
    
    public void deleteExperience (Long id);
    
    public Experience findExperience(Long id);
}
