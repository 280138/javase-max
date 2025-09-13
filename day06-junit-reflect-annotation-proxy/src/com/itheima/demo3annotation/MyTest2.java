package com.itheima.demo3annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//注解的保留策略
@Target({ElementType.METHOD,ElementType.TYPE})//注解的作用目标
public @interface MyTest2 {
    String value();
    double price() default 100;
    String[] address();
}
