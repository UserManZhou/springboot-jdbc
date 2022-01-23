package com.springboot.jdbc.controller;

import com.springboot.jdbc.entity.User;
import com.springboot.jdbc.mapper.UserMapper;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DataController {
    public static Counter counter;

    public DataController(MeterRegistry meterRegistry) {
        counter = meterRegistry.counter("DataController.data");
    }


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    /**
     *  String sql = "SELECT * FROM `user`";
     *         List<Object> objects = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Object>(Object.class));
     *         objects.forEach(user -> {
     *             System.out.println(user.toString());
     *         });
     * @return
     */

    @GetMapping("/data")
    @ResponseBody
    public String data(){
        counter.increment();
//        User user = userMapper.findUser(19);
//        System.out.println(user.toString());
        return "ssadaw";
    }
}
