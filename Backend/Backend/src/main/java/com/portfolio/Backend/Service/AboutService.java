package com.portfolio.Backend.Service;

import com.portfolio.Backend.Repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Backend.Model.About;
import java.util.List;

@Service
public class AboutService implements IAboutService {
    
    @Autowired
    private AboutRepository AboutRepo;

    @Override
    public void saveAbout(About sobre) {
        AboutRepo.save(sobre);
    }

    @Override
    public void deleteAbout(Long id) {
        AboutRepo.deleteById(id);
    }

    @Override
    public About findAbout(Long id) {
        About sobre = AboutRepo.findById(id).orElse(null);
        return sobre;
    }
    
    @Override
    public List<About> getAbout() {
        List<About> listaAbout = AboutRepo.findAll();
        return listaAbout;
    }
}
