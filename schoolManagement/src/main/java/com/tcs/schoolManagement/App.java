package com.tcs.schoolManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.schoolManagement.beans.Student;
import com.tcs.schoolManagement.config.AppConfig;
import com.tcs.schoolManagement.config.AppConfigBackup;

public class App {
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student s1 = (Student) context.getBean("mystudent");
    	System.out.println(s1);
    	
    	
//    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    	Student s1 = (Student) context.getBean("mystudent");
//    	System.out.println(s1);
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//    	Student s1 = (Student) context.getBean("mystudent");
//    	System.out.println(s1.getName());
//    	System.out.println(s1.getRoll());
    	
//    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigBackup.class);
//    	Student s1 = (Student) context.getBean("student1");
//    	System.out.println(s1.getName());
//    	System.out.println(s1.getRoll());
    	
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//    	Student s1 = (Student) context.getBean("student1");
//    	System.out.println(s1.getName());
//    	System.out.println(s1.getRoll());
    	
    	
    }
}
