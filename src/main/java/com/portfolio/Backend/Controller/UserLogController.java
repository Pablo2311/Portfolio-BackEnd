package com.portfolio.Backend.Controller;

import com.portfolio.Backend.Model.UserLog;
import com.portfolio.Backend.Service.IUserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin ("https://portfolio-angular-8c6ad.web.app/")
public class UserLogController {
    
    @Autowired
    private IUserLogService interUser;
    
    @GetMapping ("/login/{id}")
    public UserLog getUser (@PathVariable Long id) {
        return interUser.findUser(id);
    }
    
    
    @PostMapping ("/login/crear")
    public String crearUser(@RequestBody UserLog user) {
        interUser.saveUser(user);
        return "Usuario creado";
    }
    
    @PutMapping ("/login/autenticar/{id}")
    public Boolean authUser (@RequestBody UserLog user, @PathVariable Long id){
        
        boolean token = false;
        UserLog userActual = interUser.findUser(id);
        
        if(userActual.email.equals(user.email) && userActual.password.equals(user.password)) {
            token = true;
        } else {}
        
        return token;
    }
}
