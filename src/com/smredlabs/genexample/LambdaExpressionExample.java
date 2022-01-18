package com.smredlabs.genexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Sayable {
    public String say();
}

class Employee {
    int empcode;
    String name;

    public Employee(int empcode, String name) {
        this.empcode = empcode;
        this.name = name;
    }
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        Sayable s1 = new Sayable() {
            @Override
            public String say() {
                return "I am saying this (without lambda exp)";
            }
        };
        System.out.println(s1.say());

        Sayable s2 = () -> "I am saying this (with lambda exp)";
        System.out.println(s2.say());

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(593, "Vinod"));
        employeeList.add(new Employee(594, "Akhila"));
        employeeList.add(new Employee(596, "Dayana"));

        Collections.sort(employeeList, (e1, e2) -> e1.name.compareTo(e2.name));

        for (Employee e : employeeList) {
            System.out.println(e.name);
        }

    }
}
