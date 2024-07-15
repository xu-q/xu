package com.demo.MyAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class MyannotationInterceptor {


    @Pointcut("@annotation(com.demo.MyAnnotation.Myannotation)")
    private void logPointCut() {
    }

    @Around("logPointCut()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        Method method = methodSignature.getMethod();
        Myannotation myannotation = method.getAnnotation(Myannotation.class);
        int level = myannotation.level();
        System.out.println("方法名：" + methodName);
        System.out.println("入参:" + Arrays.toString(proceedingJoinPoint.getArgs()));

        switch (String.valueOf(level)) {
            case "1":
                System.out.println("等级最低");
                break;
            case "2":
                System.out.println("等级最高");
                break;
            default:
                System.out.println("无等级");
        }

        System.out.println(methodName + "方法执行前........");

        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("参返回值：" + proceed);
        System.out.println(methodName + "方法执行后........");
        return proceed;
    }

    ;
}
