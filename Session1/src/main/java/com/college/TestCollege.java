package com.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollege {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collegecontext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.getStudentName().toString()+" with "+ student.getId()+" stay in "+student.getHostelName().toString());
    }
}
