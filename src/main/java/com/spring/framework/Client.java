package com.spring.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee = context.getBean("employeeBean", Employee.class);
        System.out.println("The employee object is created by spring is:"+employee);
        employee.test();
        context.close();

    }
}
