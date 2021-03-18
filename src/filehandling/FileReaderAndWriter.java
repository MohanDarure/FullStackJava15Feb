package filehandling;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader= null;
        try{
            fileWriter = new FileWriter("FHDemo.txt");
            fileWriter.write(" today is wednesday ");
            System.out.println("file write successfully.");
        } catch (IOException e) {
            e.printStackTrace();

            }finally {
                 try{
                fileWriter.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        try{
            fileReader= new FileReader("FHdemo.txt");
            int i = fileReader.read();
            System.out.println(i);
            while (i>0){
                System.out.print((char)i);
                i=fileReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 }
