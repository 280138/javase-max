package com.itheima.demo3annotation;

@MyBook(name = "林辉煌",age = 66, address = {"北京","上海"})
//@A(value = "delete")
@A("delete")//只有一个value属性其它属性有默认值的注解，value名称可以不写
public class AnnotationDemo1 {
    @MyBook(name = "林芊语",age = 18, address = {"北京","香港"})
    public static void main(String[] args) {
        //自定义注解
    }
}
