package day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {
        try{
            File f=new File("C:\\Users\\DELL\\Desktop\\ACTE Banglore\\Core Project", "config.txt");
            Scanner sc=new Scanner(f);
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error: File not found");
        }
    }
}

