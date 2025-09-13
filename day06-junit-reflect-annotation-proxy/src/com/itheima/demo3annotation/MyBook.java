package com.itheima.demo3annotation;


//自定义注解
public @interface MyBook {
    //public 属性类型 属性名（） default 默认值;
    //记得加括号
    public String name();
    int age() default 18;
    public String[] address();
}
