package MedicalInsuaranceScheme.com.cg.eis.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = insuranceScheme;
    }

    private String assignInsuranceScheme(double salary, String designation) {
        if (salary > 5000 && salary < 20000) {
            return "System Associate Scheme C";
        } else if (salary >= 20000 && salary < 40000) {
            return "Programmer Scheme B";
        } else if (salary >= 40000) {
            return "Manager Scheme A";
        } else {
            return "Clerk No Scheme";
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setInsuranceScheme(String insuranceScheme) {
        this.insuranceScheme = insuranceScheme;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary +
                ", Designation: " + designation + ", Insurance Scheme: " + insuranceScheme;
    }
}
