package com.demo.MyAnnotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/annotation")
public class AnnotationController {

    @GetMapping("/level1")
    @Myannotation(level = 1)
    public String level1(String name, int age) {
        System.out.println("level1方法执行中");
        return name + age;
    }


    @GetMapping("/level2")
    @Myannotation(level = 2)
    public String level2(String name, int age) {
        System.out.println("level2方法执行中");
        return name + age;
    }

    @GetMapping("/level")
    @Myannotation()
    public String level(String name, int age) {
        System.out.println("level方法执行中");
        return name + age;
    }
}
