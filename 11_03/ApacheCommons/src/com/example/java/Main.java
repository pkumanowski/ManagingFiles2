package com.example.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File sourceFile = new File("C:\\Users\\pawel.kumanowski\\Documents\\newRepo\\ManagingFiles2\\11_03\\ApacheCommons\\files/loremipsum.txt");
        File targetFile = new File("C:\\Users\\pawel.kumanowski\\Documents\\newRepo\\ManagingFiles2\\11_03\\ApacheCommons\\files/target.txt");

        try {
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("file copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
