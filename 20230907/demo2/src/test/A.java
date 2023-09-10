package test;

import java.sql.SQLOutput;

public class A {
    static int m1;
    int age;
    void f1(int age){
        m1 = 5;
        age = 23;
    }
    static void e(){
        System.out.println(".....");
        m1 = 23;
    }
    //每当产生对象时，就会执行初始化块
    {
        System.out.println("hello");
    }
    //静态块，在类加载时，才会执行
    static{
        System.out.println("hi");
    }
}
