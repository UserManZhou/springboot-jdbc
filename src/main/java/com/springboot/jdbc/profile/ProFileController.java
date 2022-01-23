package com.springboot.jdbc.profile;

import com.springboot.jdbc.entity.User;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProFileController {

//    @Autowired
////    @Qualifier(value = "Person")
//    private Person person;

    @Autowired
    private User user;

    @GetMapping("/profile")
    public String profile(){
        return user.toString();
    }



}
