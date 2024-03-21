package Class26;

import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class HW1 {
    public static void main(String[] args) throws IOException {
        String url= ConfigReader.read("Url");
        String userName=ConfigReader.read("UserName");
        String password= ConfigReader.read("Password");

        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        WebElement userNameWE = webDriver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
        WebElement passwordWE = webDriver.findElement(By.xpath("//input[@type='password']"));
        WebElement enterBtn = webDriver.findElement(By.xpath("//button[@name='login']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        enterBtn.click();


    }
}
