package com.portfolio.Backend.Service;

import com.portfolio.Backend.Model.UserLog;
import com.portfolio.Backend.Repository.UserLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogService implements IUserLogService {
    
    @Autowired
    private UserLogRepository userRepo;

    @Override
    public void saveUser(UserLog user) {
        userRepo.save(user);
    }

    @Override
    public UserLog findUser(Long id) {
        UserLog user = userRepo.findById(id).orElse(null);
        return user;
    }   
}
