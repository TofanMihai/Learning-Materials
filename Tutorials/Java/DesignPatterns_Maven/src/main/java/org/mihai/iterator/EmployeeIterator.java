package org.mihai.iterator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
@NoArgsConstructor
public class EmployeeIterator implements Iterator<Employee> {
    private int currentIndex;
    private List<Employee> employeeList;


    public EmployeeIterator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < employeeList.size();
    }

    @Override
    public Employee getNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.employeeList.get(currentIndex++);
    }
    
}
