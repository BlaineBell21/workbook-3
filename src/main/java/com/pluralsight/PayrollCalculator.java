package com.pluralsight;
import java.io.*;


public class PayrollCalculator {
    public static void main(String[] args){

        try{
            FileReader fileReader = new FileReader("src/EmployeeData.csv");
            BufferedReader buffReader = new BufferedReader(fileReader);
            String input;




            while ((input = buffReader.readLine()) != null){
                String[] tokens = input.split("\\|");

                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                EmployeeData employee = new EmployeeData(employeeId, name, hoursWorked, payRate);
                employee.displayEmployeeDate();

            }
            buffReader.close();


        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
