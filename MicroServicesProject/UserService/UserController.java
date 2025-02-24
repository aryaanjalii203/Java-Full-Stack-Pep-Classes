package com.MicroServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    RestTemplate rt;
    @Autowired
    private UserServicesImplements User; 

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) { 
       User user=this.User.getUserbyId(id);
       List contacts=(List<User>) this.rt.getForObject("http://ContactService:9092/contact/user/"+user.getUsrId(),List.class);
    		   user.setContacts(contacts);
    	return user;
    }
}