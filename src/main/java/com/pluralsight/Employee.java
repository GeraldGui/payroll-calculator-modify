package com.pluralsight;

public class Employee {
    private int employeeId;
    private double hoursWorked;
    private double payRate;

    private String name;

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
