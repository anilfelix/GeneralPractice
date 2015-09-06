package com.anil.prac3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by This1 on 29/08/2015.
 */
public class CopyingFilePrac2 {
    public static void main(String[] args) {
        String sourcefile = "files/abc.txt";
        String targetfile = "files/target.txt";

        try (FileReader fReader = new FileReader(sourcefile);
             BufferedReader bReader = new BufferedReader(fReader);
             FileWriter writer = new FileWriter(targetfile);
        ) {
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                }else
                    writer.write(line + "\n");
            }
            System.out.println("File Copied!!");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
