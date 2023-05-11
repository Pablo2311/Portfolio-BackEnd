package com.portfolio.Backend.Repository;

import com.portfolio.Backend.Model.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogRepository extends JpaRepository<UserLog, Long>{
    
    //public UserLog findByUsername(String username);
}
