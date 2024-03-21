package Class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
   static void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\merla\\IdeaProjects\\SDETBatch18\\Files\\Config.properties");
    }

    public static void main(String[] args) {
        try{
            readFile();
        }catch(FileNotFoundException f){
            System.out.println("Please check the file path");
        }
    }
}
