package ie.atu;

import jdk.swing.interop.SwingInterOpUtils;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        {
            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());


            try {


                FileWriter myWrite = new FileWriter(myFile,true);
                myWrite.write("This is my first line");
                myWrite.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
