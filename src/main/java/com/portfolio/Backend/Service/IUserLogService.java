package com.portfolio.Backend.Service;

import com.portfolio.Backend.Model.UserLog;

public interface IUserLogService {
        
    public void saveUser (UserLog user);
    
    public UserLog findUser (Long id);
}
