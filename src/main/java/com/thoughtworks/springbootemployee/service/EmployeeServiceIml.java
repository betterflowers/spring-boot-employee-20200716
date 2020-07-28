package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceIml implements EmployeeService{
    private List<Employee> employees;

    public EmployeeServiceIml() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees (){
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for(Employee employee:employees){
            if(employee.getId()== id){
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);

    }

    public void updateEmployee(Employee employee){
        for (Employee emp : employees) {
            if (employee.getId() == emp.getId()) {
                employees.remove(emp);
                employees.add(employee);
                return ;
            }
        }
    }

    public void deleteEmployee(int id){
        for (Employee employee:employees){
            if(employee.getId()== id){
                employees.remove(employee);
                return;
            }
        }
    }
}
