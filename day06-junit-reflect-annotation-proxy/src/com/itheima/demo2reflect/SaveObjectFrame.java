package com.itheima.demo2reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrame {

    //保存任意对象的静态方法
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("day06-junit-reflect-annotation-proxy/src/obj.txt",true));
        //只有反射可以知道对象有多少字段
        //1.获取Class对象
        Class<?> c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("========" + simpleName + "===========");
        //2、获取Class对象所有字段
        Field[] fields = c.getDeclaredFields();
        //3、遍历字段
        for (Field field : fields) {
            String fieldName = field.getName();
            field.setAccessible(true);//暴力反射
            Object fieldValue = field.get(obj);//获取字段的值
            ps.println(fieldName + "=" + fieldValue);
        }
        ps.close();
    }
}
