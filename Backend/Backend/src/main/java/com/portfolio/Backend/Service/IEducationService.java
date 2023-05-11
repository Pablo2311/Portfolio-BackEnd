package com.portfolio.Backend.Service;

import com.portfolio.Backend.Model.Education;
import java.util.List;


public interface IEducationService {
    
    public List<Education> getEducation ();
    
    public void saveEducation (Education edu);
    
    public void deleteEducation (Long id);
    
    public Education findEducation(Long id);
}
