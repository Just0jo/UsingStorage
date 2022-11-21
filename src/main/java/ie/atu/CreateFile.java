package ie.atu;

//import jdk.swing.interop.SwingInterOpUtils;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        System.out.println("Enter file name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        File myFile = new File(name);
        System.out.println("My file is located at " + myFile.getAbsolutePath());


            try {


                FileWriter myWrite = new FileWriter(myFile, true);
                PrintWriter myPrint = new PrintWriter(myWrite);
                myPrint.println("This is my fourth line");
                myPrint.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scanner inputFile = null;
            try {
                inputFile = new Scanner(new File("myFile.txt"));
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            while (inputFile.hasNext())
            {
                String str = inputFile.nextLine();
                System.out.println(str);
            }

    }
}

