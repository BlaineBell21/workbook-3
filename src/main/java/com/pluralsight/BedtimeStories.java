package com.pluralsight;
import java.io.*;
import java.util.Scanner;


public class BedtimeStories {
    public static void main(String[] args){
    Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the Bedtime Story reader.");
        System.out.println("Choose from a list of our bedtime stories by entering in the number: ");
        System.out.println("1. Alice's in Wonderland");
        System.out.println("2. The Tale of Peter Rabbit.");
        System.out.println("3. Winnie the Pooh.");
        int userInput = read.nextInt();

        if (userInput == 1){
            fileReader("src/aliceInWonderland.txt");
        } else if(userInput == 2){
            fileReader("src/theTaleOfPeterRabbit.txt");
        } else if(userInput == 3){
            fileReader("src/winnieThePooh.txt");
        }
    }

    public static void fileReader(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader((fileReader));

            String input;

            while ((input = buffReader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
