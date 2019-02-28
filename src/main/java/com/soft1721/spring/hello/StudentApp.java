package com.soft1721.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        //读入xml文件
        ApplicationContext context
                =new ClassPathXmlApplicationContext("/beans.xml");

        //读取配置好的bean
        Student student=(Student) context.getBean("student");
        //helloworld运行
        System.out.println(student);
    }
}
