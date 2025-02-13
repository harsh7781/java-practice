package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee employee = employeeService.getEmployeeDetails();
        employeeService.findInsuranceScheme(employee);
        System.out.println("\nEmployee Details:");
        employeeService.displayEmployeeDetails(employee);
    }
}