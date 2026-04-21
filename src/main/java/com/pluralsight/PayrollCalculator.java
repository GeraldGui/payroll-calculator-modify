package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        String line;

        Scanner myObj = new Scanner(System.in);

        try {
            System.out.print("Enter the name of the file employee file to process: ");
            String employeeFile = myObj.nextLine();

            FileReader fileReader1 = new FileReader(employeeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader1);

            System.out.print("Enter the name of the payroll file to create: ");
            String payrollFile = myObj.nextLine();

            FileWriter fileReader2 = new FileWriter(payrollFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader2);

            while ((line = bufferedReader.readLine()) != null) {

                String[] tokens = line.split("\\|");

                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                employees.add(new Employee(employeeId, name, hoursWorked, payRate));

            }
            for (Employee makeEmployee : employees) {
                //System.out.printf("Employee ID: " + makeEmployee.getEmployeeId() + " \nName: " + makeEmployee.getName() + "\nPay: " + makeEmployee.getGrossPay() + "\n------------------------\n");

                bufferedWriter.write(makeEmployee.getEmployeeId() + " | " + makeEmployee.getName() + " | $" + makeEmployee.getGrossPay());
                bufferedWriter.newLine();

            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (Exception ex) {
            System.err.println("Wrong Input!");
        }
    }
}
