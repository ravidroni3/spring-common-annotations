package com.spring.framework;


public class Employee {
    private Manager manager;
    private Role role;

    public void setRole(Role role) {
        this.role = role;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Employee() {
    }

    public void test() {
        manager.managerInfo();
        System.out.println("this is test");
    }
}
