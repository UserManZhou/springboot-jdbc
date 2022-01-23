package com.springboot.jdbc.profile;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@ConfigurationProperties(prefix = "person")
@Data
@Profile("pdd")
@Component
public class Worker implements Person{

    private String name;
    private Integer age;
}
