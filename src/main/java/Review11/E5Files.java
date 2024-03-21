package Review11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E5Files {
    public static void main(String[] args) throws IOException {
        //Location
        String path = "C:\\Users\\merla\\IdeaProjects\\SDETBatch18\\Files\\Config.properties";
        //Bringing the file to the Memory(RAM)
        FileInputStream fis = new FileInputStream(path);

        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("url"));
    }
}