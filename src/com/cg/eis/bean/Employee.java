package com.cg.eis.bean;

public class Employee {
    int id;
    String name;
    double salary;
    String designation;
    String insuranceScheme;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getInsuaranceScheme() {
        return insuranceScheme;
    }

    public void setInsuaranceScheme(String insuranceScheme) {
        this.insuranceScheme = insuranceScheme;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + ", Designation=" + designation
                + ", Insurance Scheme=" + insuranceScheme + "]";
    }
}
