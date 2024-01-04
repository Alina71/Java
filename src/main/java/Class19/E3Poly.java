package Class19;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E3Poly {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.amazon.com");
        Thread.sleep(2000);
        System.out.println(chromeDriver.navigate());
        chromeDriver.close();
        FirefoxDriver f=new FirefoxDriver();
        f.get("https://www.amazon.com");
        f.close();
    }
}
