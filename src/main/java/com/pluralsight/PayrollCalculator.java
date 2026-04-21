package com.pluralsight;
import java.io.*;
import java.util.Scanner;


public class PayrollCalculator {
    public static void main(String[] args){

        try{
            FileReader fileReader = new FileReader("EmployeeData.csv");
            BufferedReader buffReader = new BufferedReader(fileReader);
            String input;

            String delimiter = "";


            while ((input = buffReader.readLine()) != null){
                String[] tokens = delimiter.split("\\|");

            }


        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
