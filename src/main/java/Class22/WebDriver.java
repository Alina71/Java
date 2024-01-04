package Class22;

public interface WebDriver {
    void openBrowser();

void closeBrowser();
void maximizeWindow();
void findElement();
    }
 class ChromeDriver implements WebDriver{

     @Override
     public void openBrowser() {
         System.out.println("Open browser in Chrome");
     }

     @Override
     public void closeBrowser() {
         System.out.println("Close the browser in Chrome");
     }

     @Override
     public void maximizeWindow() {
         System.out.println("Maximize the browser in Chrome");
     }

     @Override
     public void findElement() {
         System.out.println("Find browser in Chrome");
     }
     }
     class  FirefoxDriver implements WebDriver{
         @Override
         public void openBrowser() {
             System.out.println("Open browser in Firefox");
         }

         @Override
         public void closeBrowser() {
             System.out.println("Close browser in Firefox");
         }

         @Override
         public void maximizeWindow() {
             System.out.println("Maximize browser in Firefox");
         }

         @Override
         public void findElement() {
             System.out.println("Find browser in Firefox");
         }
     }
