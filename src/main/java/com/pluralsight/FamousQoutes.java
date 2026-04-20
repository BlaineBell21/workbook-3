package com.pluralsight;

import java.util.Scanner;

public class FamousQoutes {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

    String[] tenFamousQoutes = {"The only thing we have to fear is fear itself.", "I think, therefore I am.", "That’s one small step for man, one giant leap for mankind.",
            "In the middle of difficulty lies opportunity.", "To be, or not to be, that is the question.", "I have a dream", "The unexamined life is not worth living.",
            "Stay hungry, stay foolish.", "It always seems impossible until it’s done.", "Not all those who wander are lost."};
        try {
    System.out.println("Select a number between 1 and 10 to display a famous qoute: ");
    int userQoute = read.nextInt();
    System.out.println(tenFamousQoutes[userQoute]);
    }
    catch (Exception e) {
        System.out.println("Your number is out of range!");
        e.printStackTrace();;
    }
    read.close();

    }
}
