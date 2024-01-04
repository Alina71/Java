package Class19;
class Browser{
    void get(String url){
        System.out.println("Loading...."+url+"in browser");
    }
    void performTest(){
        System.out.println("Checking if website is working properly in browser");

    }
    void CloseBroweser() {
        System.out.println("Closing the Google Chrome Browser");
    }
}
public class Chrome extends Browser{
    void get(String url){
        System.out.println("Loading...."+url);
    }
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");

    }
    void CloseBroweser() {
        System.out.println("Closing the Google Chrome Browser");
    }
    }
    class FireFox extends Browser{
        void get(String url){
            System.out.println("Loading...."+url);
        }
        void performTest(){
            System.out.println("Checking if website is working properly in chrome");

        }
        void CloseBroweser(){
            System.out.println("Closing the Google Chrome Browser");

        }
}
class Edge extends Browser{
    void get(String url){
        System.out.println("Loading...."+url);
    }
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");

    }
    void CloseBroweser() {
        System.out.println("Closing the Google Chrome Browser");
    }
    }
    class Safari extends Browser {
        void get(String url) {
            System.out.println("Loading...." + url);
        }

        void performTest() {
            System.out.println("Checking if website is working properly in chrome");

        }

        void CloseBroweser() {
            System.out.println("Closing the Google Chrome Browser");

        }
    }