package com.ngomdev.niit.sn.test_jenkins;

import org.springframework.boot.SpringApplication;

public class TestTestJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.from(TestJenkinsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
