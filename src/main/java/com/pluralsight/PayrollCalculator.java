package com.pluralsight;
import java.io.*;


public class PayrollCalculator {
    public static void main(String[] args){

        try{
            FileReader fileReader = new FileReader("src/EmployeeData.csv");//scans the csv file
            BufferedReader buffReader = new BufferedReader(fileReader);//goes through each line of csv file
            String input;




            while ((input = buffReader.readLine()) != null){
                if (input == null || input.trim().isEmpty()) {//if there is no input or the line is empty, code continues
                    continue;
                }

                String[] tokens = input.split("\\|");//splits each section at the |


                int employeeId = Integer.parseInt(stringCleaner((tokens[0])));
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(stringCleaner(tokens[2]));
                double payRate = Double.parseDouble(stringCleaner(tokens[3]));

                EmployeeData employee = new EmployeeData(employeeId, name, hoursWorked, payRate);
                employee.displayEmployeeDate();//calls constructor to display employee data formatted

            }
            buffReader.close();


        } catch (Exception e){
            e.printStackTrace();
        }


    }
    public static String stringCleaner(String value){
        return value.replace("\"","").trim(); //removes extra/unnecessary quotes and trims empty space from strings
    }
}
