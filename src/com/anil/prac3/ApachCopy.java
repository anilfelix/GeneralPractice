package com.anil.prac3;

import org.apache.commons.io.FileUtils;

import java.io.File;
/**
 * ping
 * phdf
 * this is awesome
 */

/**
 * Created by This1 on 29/08/2015.
 */
public class ApachCopy {
    public static void main(String[] args) {
/**
 * @param args - a file name
 */
        File sourceFile = new File("files/abc.txt");
        File targetFile = new File("files/target.txt");

        try {
            FileUtils.copyFile(sourceFile, targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
