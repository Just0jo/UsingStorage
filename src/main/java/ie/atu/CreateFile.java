package ie.atu;

import jdk.swing.interop.SwingInterOpUtils;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) {
        {
            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());


            try {


                FileWriter myWrite = new FileWriter(myFile,true);
                PrintWriter myPrint = new PrintWriter(myWrite);
                myPrint.println("This is my fourth line");
                myPrint.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
