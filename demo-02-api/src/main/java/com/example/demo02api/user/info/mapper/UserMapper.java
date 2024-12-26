package com.example.demo02api.user.info.mapper;


import com.example.demo02api.user.info.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {


    @Select("select * from user where id = #{id}")
    public User findById(Integer id);

    @Insert("insert into user (name, age, gender, phone) values (#{name}, #{age}, #{gender}, #{phone} )")
    public  int addUser(User user);

}
