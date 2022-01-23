package com.springboot.jdbc.profile;

import com.springboot.jdbc.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyprofileConfig {

    @Bean
    @Profile("prod")
    public User user(){
        User user = new User();
        user.setId(12);
        return user;
    }

    @Bean
    @Profile("ppd")
    public User user2(){
        User user = new User();
        user.setId(123);
        return user;
    }

}
