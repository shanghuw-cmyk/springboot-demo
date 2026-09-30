package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Manager {
    @Autowired
    @Qualifier("employee")
    private Employee employee;

//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
