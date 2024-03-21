package Class25;

import Utils.ConfigReader;

import java.io.IOException;

public class E2FileHandling {
    public static void main(String[] args) throws IOException {

       String value= ConfigReader.read("browser");
        System.out.println(value);
    }
}
