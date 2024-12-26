package org.example.demo03allapi.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.demo03allapi.pojo.User;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    public User findByName(String username);

    @Insert("insert into user(username, password, create_time, update_time) values(#{username}, #{password}, now(), now())")
    public User register(String username, String password);
}
