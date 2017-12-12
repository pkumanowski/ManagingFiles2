package com.example.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {

        Path sourceFile = Paths.get("C:\\Users\\pawel.kumanowski\\Documents\\newRepo\\ManagingFiles2\\11_02\\NewIO\\files\\", "loremipsum.txt");
        Path targetFile = Paths.get("C:\\Users\\pawel.kumanowski\\Documents\\newRepo\\ManagingFiles2\\11_02\\NewIO\\files\\", "target.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
