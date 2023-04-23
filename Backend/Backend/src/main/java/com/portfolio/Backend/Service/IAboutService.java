package com.portfolio.Backend.Service;

import com.portfolio.Backend.Model.About;

public interface IAboutService {
    
    public void saveAbout (About sobre);
    
    public void deleteAbout (Long id);
    
    public About findAbout (Long id);
}
