package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class FileExporter {

    public static FileWriter fileToWriteTo() throws IOException {
        System.out.println("Now enter in the name of the file you'd like to write to: ");
        String nameOfNewFile = UserInput.userStringInput();
        FileWriter newFile = new FileWriter(nameOfNewFile);

        return newFile;
    }

}
