package com.pluralsight;

/*
Create a Java application named format-dates.
The application will get the current date and time and display that information in the following formats -

Remember: When creating a new Java project, create a new git repository and commit your changes often! Don’t forget to push to github.com. Always share your IntelliJ project to GitHub!
04/22/2026
2026-04-22
Wednesday 22, 2026
Wednesday, Apr 22, 2026 10:02  display in GMT time
CHALLENGE
5:02 on 22-Apr-2026  display in your local time zone
 */


import java.time.LocalDateTime;

import java.time.format.*;

public class FormatDates {
    public static void main(String[] args){
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" EEEE e, yyyy ");
        String formattedDate = today.format(formatter);
        System.out.println("Today is: " + formattedDate);
    }
}
