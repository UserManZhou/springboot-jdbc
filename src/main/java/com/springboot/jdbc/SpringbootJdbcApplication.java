package com.springboot.jdbc;

import com.springboot.jdbc.entity.Info;
import com.springboot.jdbc.profile.Boss;
import com.springboot.jdbc.profile.Person;
import com.springboot.jdbc.profile.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {Info.class, Boss.class, Worker.class})
public class SpringbootJdbcApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcApplication.class, args);
    }

}
