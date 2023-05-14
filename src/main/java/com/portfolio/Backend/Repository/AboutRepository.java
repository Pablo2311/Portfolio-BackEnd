package com.portfolio.Backend.Repository;

import com.portfolio.Backend.Model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository <About, Long> {
    
}
