package com.pluralsight;

import java.util.Scanner;

public class UserInput {
    public static String userStringInput(){
        Scanner read = new Scanner(System.in);
        String file = read.nextLine();
        return file;
    }
}
