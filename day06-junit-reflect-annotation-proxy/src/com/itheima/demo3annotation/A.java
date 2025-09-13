package com.itheima.demo3annotation;

public @interface A {
    //只有一个value属性其它属性有默认值的注解，value名称可以不写
    String value();
    String hobby() default "打篮球";
}
