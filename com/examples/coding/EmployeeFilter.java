package com.examples.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeFilter {



    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", Arrays.asList("123-456-7890", "987-654-3210"));
        Employee emp2 = new Employee("Jane Smith", Arrays.asList("111-222-3333", "444-555-6666"));
        Employee emp3 = new Employee("Michael Brown", Arrays.asList("777-888-9999", "333-444-5555"));
        Employee emp4 = new Employee("Lisa Johnson", Arrays.asList("222-333-4444", "555-666-7777"));
        Employee emp5 = new Employee("David Wilson", Arrays.asList("888-999-0000", "111-222-1111"));

        List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        // Write a program to get atleast 1 phonenumber and phoneNumber starts with 9 digit
        List<Employee> resEmp = employeeList.stream().filter(employee -> employee.getPhoneNumber().stream().anyMatch(e->e.startsWith("9")))
                .collect(Collectors.toList());

        resEmp.forEach(System.out::println);

    }
}
