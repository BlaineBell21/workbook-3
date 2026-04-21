package com.pluralsight;

public class EmployeeData {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public EmployeeData(int _employeeId, String _name, double _hoursWorked, double _payRate) {
        this.employeeId = _employeeId;
        this.name = _name;
        this.hoursWorked = _hoursWorked;
        this.payRate = _payRate;
    }
    public void displayEmployeeDate() {
        String employeeData;
        employeeData = this.employeeId + "|" + this.name + "|" + this.hoursWorked + "|" + this.payRate;
        System.out.println(employeeData);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
