package com.anil.prac3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by This1 on 28/08/2015.
 */
public class CopyingFile {
    public static void main(String[] args) {

        String sourceFile = "files/abc.txt";
        String targetFile = "files/target.txt";


        try (
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile);) {
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writer.write(line + "\n");

                }

                System.out.println("file copied");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        ;


    }
}