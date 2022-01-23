package com.springboot.jdbc.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring-info")
@Data
@ToString
//@Component
public class Info {

    private String name;
    private String description;
    private String version;
    private String encoding;

}
