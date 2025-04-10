package org.mihai.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {
        Employee e1 = new Employee("Mihai", 20);
        Employee e2 = new Employee("Cristina", 10);
        Employee e3 = new Employee("Romina", 30);
        Employee e4 = new Employee("Adela", 50);

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));

        Company company = new Company(employeeList);
        Iterator<Employee> employeeIterator = company.createIterator();

        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.getNext());
        }


    }
}
