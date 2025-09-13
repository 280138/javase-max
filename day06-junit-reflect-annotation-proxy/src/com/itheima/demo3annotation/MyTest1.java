package com.itheima.demo3annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyTest1 {
}
