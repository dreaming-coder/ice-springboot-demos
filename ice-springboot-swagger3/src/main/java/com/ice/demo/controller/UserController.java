package com.ice.demo.controller;


import com.ice.demo.entity.AddressVo;
import com.ice.demo.entity.UserParam;
import com.ice.demo.entity.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Api
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * http://localhost:8080/user/add .
     *
     * @param userParam user param
     * @return user
     */
    @ApiOperation("Add User")
    @PostMapping("add")
    @ApiImplicitParam(name = "userParam", type = "body", dataTypeClass = UserParam.class, required = true)
    public ResponseEntity<String> add(@RequestBody UserParam userParam) {
        return ResponseEntity.ok("success");
    }

    /**
     * http://localhost:8080/user/list .
     *
     * @return user list
     */
    @ApiOperation("Query User List")
    @GetMapping("list")
    public ResponseEntity<List<UserVo>> list() {
        List<UserVo> userVoList = Collections.singletonList(UserVo.builder().name("lei").age(18)
                .address(AddressVo.builder().city("NJ").zipcode("10086").build()).build());
        return ResponseEntity.ok(userVoList);
    }
}
