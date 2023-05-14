package com.portfolio.Backend.Service;

import com.portfolio.Backend.Model.About;
import java.util.List;

public interface IAboutService {
    
    public List<About> getAbout ();
    
    public void saveAbout (About sobre);
    
    public void deleteAbout (Long id);
    
    public About findAbout (Long id);
}
