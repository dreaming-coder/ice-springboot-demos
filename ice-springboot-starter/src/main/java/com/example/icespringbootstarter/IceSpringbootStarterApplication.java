package com.example.icespringbootstarter;

import com.ice.module.DemoModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IceSpringbootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(IceSpringbootStarterApplication.class, args);
    }

    @Autowired
    private DemoModule demoModule;

    @GetMapping("/starter")
    public String demo() {
        return demoModule.exeModuleMethod();
    }
}
