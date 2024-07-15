package com.Controller;

import com.demo.MyAnnotation.Myannotation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/annotation")
public class AnnotationController {

    @RequestMapping("/level1")
    @ResponseBody
    @Myannotation(level = 1)
    public String level1(String name, int age) {
        System.out.println("level1方法执行中");
        return name + age;
    }


    @RequestMapping("/level2")
    @ResponseBody
    @Myannotation(level = 2)
    public String level2(String name, int age) {
        System.out.println("level2方法执行中");
        return name + age;
    }

    @RequestMapping("/level")
    @ResponseBody
    @Myannotation()
    public String level(String name, int age) {
        System.out.println("level方法执行中");
        return name + age;
    }
}
