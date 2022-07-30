package com.ice.demo.entity;

import lombok.Builder;
import lombok.Data;

/**
 * user.
 *
 * @author pdai
 */
@Data
@Builder
public class UserVo {

    private String name;

    private int age;

    private AddressVo address;
}