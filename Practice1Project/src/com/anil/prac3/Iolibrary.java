package com.anil.prac3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by This1 on 29/08/2015.
 */
public class Iolibrary {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("files", "abc.txt");
        Path targetFile = Paths.get("files", "target.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Files copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
