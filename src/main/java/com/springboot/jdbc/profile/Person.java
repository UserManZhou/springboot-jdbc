package com.springboot.jdbc.profile;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
public interface Person {

    String getName();

    Integer getAge();
}

