package com.springboot.jdbc.profile;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EnvironmentController {

    @Autowired
    private ConfigurableEnvironment environment;

    @GetMapping("/Environment")
    public Map Environment(){
      return   environment.getSystemEnvironment();
    }
}
