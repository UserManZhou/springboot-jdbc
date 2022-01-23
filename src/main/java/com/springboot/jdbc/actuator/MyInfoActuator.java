package com.springboot.jdbc.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
//@ConditionalOnBean(com.springboot.jdbc.entity.Info.class)
public class MyInfoActuator implements InfoContributor {

    @Autowired
    private com.springboot.jdbc.entity.Info info;

    @Override
    public void contribute(Info.Builder builder) {
        System.out.println("info.getName() = " + info.getName());
        builder.withDetail("info", Collections.singletonMap("name", info.getName()));
    }
}
