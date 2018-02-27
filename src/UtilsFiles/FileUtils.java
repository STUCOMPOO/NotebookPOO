/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilsFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author alu2015018
 */
public class FileUtils {

    //string to test
    private final static String FILE_PATH = "C:\\Users\\alu2015018\\OneDrive - Stucom, S.A(1)\\DAM\\POO y LI\\Practicas\\PracticaGrupal\\config.txt";

    //funciton returns string List with all the config information
    public static List<String> readFile(String filePath) {
        BufferedReader bufferedReader = null;
        FileReader fr = null;
        List<String> stringList = new ArrayList<>();

        try {

            fr = new FileReader(filePath);
            bufferedReader = new BufferedReader(fr);

            String currentLine;
            String[] arrayString = null;
            

            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
                arrayString = currentLine.split(" ");
                
                stringList.addAll(Arrays.asList(arrayString)); //System.out.println(arrayString.length);
            }

            for (int i = 0; i < stringList.size(); i++) {
               
                System.out.println(stringList.get(i));
            }

        } catch (Exception e) {
            
        }finally{
            try {
                bufferedReader.close();
            } catch (IOException ignored) {
                
            }
        }
        
        return stringList;

    }
    
  

    public static void main(String[] args) {
        readFile(FILE_PATH);
    }

}
