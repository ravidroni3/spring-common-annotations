package com.spring.framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.framework.Employee")
public class EmployeeConfig {

    @Bean
    public Role developerBean() {
        return new Developer();
    }

    @Bean
    public Manager managerBean() {
        return new Manager();
    }

    @Bean
    public Employee employeeBean() // employeeBean -bean id
    {
        Employee employee = new Employee();
        employee.setManager(managerBean());
        employee.setRole(developerBean());
        return employee;
    }
}
