package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestClass {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        User user = (User) context.getBean("user");
        User user = (User) context.getBean("user");
//        User user = context.getBean("user", User.class);
        System.out.println("PerDay Cost of "+user.getCar().getName() +" is "+ user.getCar().getPerdayCost());
    }
}
