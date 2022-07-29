package com.example.icespringbootmybatis;

import com.example.icespringbootmybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class IceSpringbootMybatisApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SqlSession session;

    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        System.out.println(aLong);
    }

    @Test
    void testMyBatis(){
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.getUsers().forEach(System.out::println);
    }
}
