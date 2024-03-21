package Class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E2Exception {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("C:\\Users\\merla\\IdeaProjects\\SDETBatch18\\Files\\Config.properties");

        }catch (FileNotFoundException f){
            System.out.println("Please check the path");
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Somewthing went wrong");
            }
        }

    }
}

