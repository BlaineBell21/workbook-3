package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class FileExporter {
    public static void exportToFile(EmployeeData employee) throws IOException {


        FileWriter write = new FileWriter(fileToWriteTo());
        double grossIncome = employee.getHoursWorked() * employee.getPayRate();
        write.write(employee.getEmployeeId() + "|" + employee.getName() + "|" + grossIncome);

        write.close();
    }

    public static String fileToWriteTo(){
        System.out.println("Now enter in the name of the file you'd like to write to: ");
        return UserInput.userStringInput();
    }


}
