package MedicalInsuaranceScheme.com.cg.eis.service;

import MedicalInsuaranceScheme.com.cg.eis.bean.Employee;
import java.util.Map;

public class EmployeeService {
    public void addEmployee(Map<Integer, Employee> employeeMap, Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    public void deleteEmployee(Map<Integer, Employee> employeeMap, int employeeId) {
        employeeMap.remove(employeeId);
    }

    public void displayEmployeeDetailsByInsuranceScheme(Map<Integer, Employee> employeeMap, String scheme) {
        for (Employee employee : employeeMap.values()) {
            if (employee.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                System.out.println(employee);
            }
        }
    }
}
