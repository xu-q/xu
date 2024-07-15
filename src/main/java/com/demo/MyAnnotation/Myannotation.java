package com.demo.MyAnnotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Myannotation {

    String value() default "";

    int level() default 0;
}
