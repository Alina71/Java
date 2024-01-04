package Class22;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] arr={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver t:arr){
            t.openBrowser();
            t.closeBrowser();
            t.maximizeWindow();
            t.findElement();
            System.out.println("**************");
        }
    }
}
