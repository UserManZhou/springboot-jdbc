package com.springboot.jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.jdbc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    public User findUser(int id);

//    @Insert("INSERT INTO `user`(username,password,create_date,update_date,accement_num) VALUES(#{username},#{password},#{createDate},#{updateDate},#{accementNum})")
//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    public void insertUser(User user);
}
