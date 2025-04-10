package org.mihai.iterator;

import java.util.List;

public class Company implements Aggregate<Employee> {
    private final List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employeeList);
    }
}
