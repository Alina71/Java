package Class26;

import Utils.ConfigReader;
import Utils.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import static Utils.CommonMethods.selectFromDropDown;
public class HW2 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\merla\\IdeaProjects\\SDETBatch18\\Files\\HW.xlsx";
        String sheetName = "Sheet1";
        List<Map<String, String>> testData = ExcelReader.read(path, sheetName);
        System.out.println(testData);

        String url = ConfigReader.read("url");
        String userName = ConfigReader.read("userName");
        String password = ConfigReader.read("password");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        WebElement userNameWE = webDriver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordWE = webDriver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn = webDriver.findElement(By.xpath("//input[@id='btnLogin']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        enterBtn.click();
        testData.forEach(x -> {

            webDriver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            webDriver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
            webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(x.get("FirstName"));
            webDriver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(x.get("MiddleName"));
            webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(x.get("LastName"));
            webDriver.findElement(By.xpath("//input[@id='btnSave']")).click();
            webDriver.findElement(By.xpath("//input[@id='btnSave']")).click();
            webDriver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']")).clear();
            webDriver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']")).sendKeys(x.get("FirstName"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).clear();
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).sendKeys(x.get("MiddleName"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys(x.get("LastName"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).sendKeys(x.get("EmployeeID"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys(x.get("OtherID"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys(x.get("DLN"));
            //webDriver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).sendKeys(x.get("12/31/2024"));
            webDriver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).click();
            WebElement month = webDriver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            selectFromDropDown(month, "Dec");
            WebElement year = webDriver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            selectFromDropDown(year, "2024");
            List<WebElement> date = webDriver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for (WebElement d : date) {
                if (d.getText().equals("31")) {
                    d.click();

                    webDriver.findElement(By.xpath("//input[@id='personal_txtNICNo']")).sendKeys(x.get("SSNNumber"));
                    webDriver.findElement((By.xpath("//input[@id='personal_txtSINNo']"))).sendKeys(x.get("SINNumber"));
                    webDriver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
                    WebElement status = webDriver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
                    selectFromDropDown(status, "Married");
                    WebElement nationality = webDriver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
                    selectFromDropDown(nationality, "American");

                    webDriver.findElement(By.xpath("//input[@id='personal_DOB']")).click();
                    WebElement luna = webDriver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
                    selectFromDropDown(luna, "Dec");
                    WebElement an = webDriver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
                    selectFromDropDown(an, "2003");
                    List<WebElement> data = webDriver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
                    for (WebElement day : data) {
                        if (day.getText().equals("31")) {
                            day.click();
                            webDriver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")).sendKeys(x.get("NickName"));
                            webDriver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys(x.get("MilitaryService"));
                            webDriver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']")).click();


                        }
                    }
                }
            }
        });
    }
}