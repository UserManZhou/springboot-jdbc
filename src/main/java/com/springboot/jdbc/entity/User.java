package com.springboot.jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private int id;
    private String username;
    private String password;
    private Timestamp createDate;
    private Timestamp updateDate;
    private String accementNum;
}
