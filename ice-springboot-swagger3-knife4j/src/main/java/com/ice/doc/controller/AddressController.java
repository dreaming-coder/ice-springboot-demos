package com.ice.doc.controller;


import com.ice.doc.entity.AddressParam;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Address controller test demo.
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    /**
     * http://localhost:8080/address/add .
     *
     * @param addressParam param
     * @return address
     */
    @ApiOperation("Add Address")
    @PostMapping("add")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "city", type = "query", dataTypeClass = String.class, required = true),
            @ApiImplicitParam(name = "zipcode", type = "query", dataTypeClass = String.class, required = true)
    })
    public ResponseEntity<String> add(AddressParam addressParam) {
        return ResponseEntity.ok("success");
    }

}