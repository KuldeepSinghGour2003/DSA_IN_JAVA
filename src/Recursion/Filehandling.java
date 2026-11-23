package Recursion;

import java.io.FileReader;
import java.io.IOException;

public class Filehandling {
    static void readfile() throws IOException
    {
        FileReader file = new FileReader("test.txt");
    }
    public static void main(String[]args){
        try{
            readfile();
        }catch (IOException e){
            System.out.println("File not found");
        }
    }

}
