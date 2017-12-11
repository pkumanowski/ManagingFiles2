package com.example.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "C:\\Users\\Paweł\\Desktop\\Ex_Files_JavaEssT_Q32015\\Exercise Files\\Ch11\\11_01\\CopyFile\\files\\loremipsum.txt";
        String targetFile = "C:\\Users\\Paweł\\Desktop\\Ex_Files_JavaEssT_Q32015\\Exercise Files\\Ch11\\11_01\\CopyFile\\files\\/target.txt";

        try(
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile)
                ){

            while (true){
                String line = bReader.readLine();
                if (line == null){
                    break;
                }else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("File copied!");
        } catch (Exception e){
            e.printStackTrace();

        }

    }

}
