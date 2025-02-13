package com.cg.eis.service;

import com.cg.eis.bean.Employee;

import java.util.Scanner;

public class EmployeeService {
    public Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Employee Designation: ");
        String designation = scanner.nextLine();

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setSalary(salary);
        employee.setDesignation(designation);

        return employee;
    }

    public void findInsuranceScheme(Employee employee) {
        if (employee.getSalary() > 50000) {
            employee.setInsuaranceScheme("Premium Insurance");
        } else if (employee.getSalary() > 30000) {
            employee.setInsuaranceScheme("Standard Insurance");
        } else {
            employee.setInsuaranceScheme("Basic Insurance");
        }
    }

    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee);
    }
}
