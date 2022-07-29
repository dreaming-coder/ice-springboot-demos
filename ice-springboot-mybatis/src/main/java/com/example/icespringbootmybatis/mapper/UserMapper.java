package com.example.icespringbootmybatis.mapper;

import com.example.icespringbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUsers();
}
