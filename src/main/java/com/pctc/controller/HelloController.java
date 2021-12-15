package com.pctc.controller;

import com.pctc.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author H1PPPY
 * @date 2021/10/25 10:59
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("hello")
    public String getError() {
        int a = 100;
        int b = 0;
        int c = a / b;
        return "success";
    }

    @RequestMapping("getStudent")
    public Map<String, Object> getStudent() {
        Student student = new Student();
        student.setId(1);
        student.setAge(22);
        student.setName("熊腾");
        Map<String, Object> map = new HashMap<>();
        map.put("student1", student);
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
