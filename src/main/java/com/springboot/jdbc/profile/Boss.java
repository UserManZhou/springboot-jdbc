package com.springboot.jdbc.profile;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Profile("prod")
@Component
@ConfigurationProperties(prefix = "person")
public class Boss implements Person{

    private String name;
    private Integer age;

}
