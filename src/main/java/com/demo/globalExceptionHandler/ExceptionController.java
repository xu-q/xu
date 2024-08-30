package com.demo.globalExceptionHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("exception")
@RestController
public class ExceptionController {

    @GetMapping()
    public String demo(int num) {
        if (num == 1) {
            throw new BusinessException(1, "业务异常");
        } else if (num == 2) {
            throw new SystenException(2, "系统异常");
        }

        int a = 1 / 0;
        return "hello";
    }

    public static void demo1() throws Exception {
        System.out.println("demo1");
        throw new Exception();
    }

    public static void demo2() {
        System.out.println("demo2");
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch住了");
        }
        System.out.println("demo2 结束");
    }

    public static void demo3() {
        System.out.println("demo3");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        ExceptionController.demo3();
    }
}
