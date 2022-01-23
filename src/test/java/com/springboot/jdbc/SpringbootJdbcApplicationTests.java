package com.springboot.jdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.jdbc.entity.User;
import com.springboot.jdbc.mapper.UserMapper;
import com.springboot.jdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Timestamp;
import java.util.List;

@SpringBootTest
class SpringbootJdbcApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        String sql = "SELECT * FROM `user`";
        List<Object> objects = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Object>(Object.class));
        objects.forEach(user -> {
            System.out.println(user.toString());
        });
        User user = new User();
//        user.setUsername("nduaighdia");
//        user.setPassword("dwadaw");
//        user.setCreateDate(new Timestamp(System.currentTimeMillis()));
//        user.setAccementNum(":dqwahuidhuiawd");
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select("*");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(x -> {
            System.out.println(x.toString());
        });

        List<User> list1 = userService.list();
        list1.forEach(x -> {
            System.out.println(x.toString());
        });
    }

    @Test
    public void Pages(){
        Page<User> page = userService.page(new Page<User>(1,3), null);
        page.getRecords().forEach(x -> {
            System.out.println(x.toString());
        });
        System.out.println("page.getTotal() = " + page.getTotal());
        System.out.println("page.getPages() = " + page.getPages());
        System.out.println("page.getSize() = " + page.getSize());
    }
}
