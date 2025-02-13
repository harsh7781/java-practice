package MedicalInsuaranceScheme.com.cg.eis.pl;

import MedicalInsuaranceScheme.com.cg.eis.service.EmployeeService;
import MedicalInsuaranceScheme.com.cg.eis.bean.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Employee> employeeMap = new HashMap<>();
        EmployeeService employeeService = new EmployeeService();
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Display Employees by Insurance Scheme");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Employee Designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter Employee Insurance Scheme: ");
                    String insuranceScheme = sc.nextLine();

                    Employee employee = new Employee(id, name, salary, designation, insuranceScheme);
                    employeeService.addEmployee(employeeMap, employee);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    employeeService.deleteEmployee(employeeMap, deleteId);
                    System.out.println("Employee deleted successfully!");
                    break;

                case 3:
                    System.out.print("Enter the Insurance Scheme to display: ");
                    String scheme = sc.nextLine();
                    employeeService.displayEmployeeDetailsByInsuranceScheme(employeeMap, scheme);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
