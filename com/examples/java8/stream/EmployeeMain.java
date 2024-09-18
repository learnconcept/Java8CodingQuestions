package com.examples.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 31, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 28, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 21, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 25, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 28, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 40, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 36, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 32, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 27, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 34, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.println("How many male and female employees are there in the organization");
        Map<String, Long> mapEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(mapEmployee);
        System.out.println("Print the name of all departments in the organization");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println("What is the average age of male and female employees");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)))
                .entrySet().stream().forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
        System.out.println("Get the details of highest paid employee in the organization");
        double highestSal = employeeList.stream().map(a->a.getSalary()).max(Comparator.naturalOrder()).get();
        Employee highestSalEmpDetails = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
        System.out.println(highestSalEmpDetails);
        System.out.println("Get the names of all employees who have joined after 2015");
        employeeList.stream().filter(i->i.getYearOfJoining()>2015)
                .map(Employee::getName).forEach(System.out::println);
        System.out.println("Count the number of employees in each department");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
        System.out.println("What is the average salary of each department");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
        System.out.println("Get the details of youngest male employee in the product development department");
        Employee youngestEmp = employeeList.stream().filter(i->i.getDepartment().equals("Product Development"))
                .min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(youngestEmp);
        System.out.println("Who has the most working experience in the organization");
        Employee mostWorking = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
        System.out.println(mostWorking);
        System.out.println("How many male and female employees are there in the sales and marketing team");
        employeeList.stream().filter(i->(i.getDepartment().equals("Sales And Marketing")))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .entrySet().stream().forEach(s->System.out.println(s.getKey()+" "+s.getValue()));

    }
}
