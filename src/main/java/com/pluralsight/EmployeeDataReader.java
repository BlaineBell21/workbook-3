package com.pluralsight;
import java.io.*;


public class EmployeeDataReader {

    public static EmployeeData fileReaderAndBuffer(String file){
        try{

            FileReader fileReader = new FileReader(file);//scans the csv file
            BufferedReader buffReader = new BufferedReader(fileReader);//goes through each line of csv file
            FileWriter fileName = FileExporter.fileToWriteTo();
            BufferedWriter writer = new BufferedWriter(fileName);
            String input;

            while ((input = buffReader.readLine()) != null){
                if (input.trim().isEmpty()) {//if there is no input or the line is empty, code continues
                    continue;
                }
                String[] tokens = input.split("\\|");//splits each section at the |

                int employeeId = Integer.parseInt(stringCleaner((tokens[0])));
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(stringCleaner(tokens[2]));
                double payRate = Double.parseDouble(stringCleaner(tokens[3]));

                EmployeeData employee = new EmployeeData(employeeId, name, hoursWorked, payRate);//calls constructor to display employee data formatted
                payRate = employee.getPayRate() * employee.getHoursWorked();
                System.out.println("Writing: " + employee.getName());

                if(file.endsWith(".csv")){
                    writer.write(employee.getEmployeeId() + "|" + employee.getName() + "|" + payRate);
                } else {
                    writer.write("{ "+"\"id\": " + employee.getEmployeeId()+ ", "+"\"name\" : " + "\""+employee.getName()+"\","+
                                      "\"grossPay\" : " +  payRate+
                            " }");
                }
                writer.newLine();
            }
            writer.close();
            buffReader.close();

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static String fileToProcess(){
        System.out.println("Enter in the name of the file you'd like to process: ");
        String file = UserInput.userStringInput();
        return file;
    }
    public static String stringCleaner(String value){
        return value.replace("\"","").trim(); //removes extra/unnecessary quotes and trims empty space from strings
    }
}
