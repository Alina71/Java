package Class19;

public class BrowserTester {
    public static void main(String[] args) {
      /* Chrome chrome=new Chrome();
        chrome.get("https://www.amazon.com");
        chrome.performTest();
        chrome.CloseBroweser();

        FireFox fireFox=new FireFox();
        fireFox.get("https://www.amazon.com");
        fireFox.performTest();
        fireFox.CloseBroweser();


        Safari safari=new Safari();
        safari.get("https://www.amazon.com");
        safari.performTest();
        safari.CloseBroweser();

        Edge edge=new Edge();
        edge.get("https://www.amazon.com");
        edge.performTest();
        edge.CloseBroweser();*/

        System.out.println("***********************");
        //Array that holds the object of all browsers
        Browser[] bArr={new Chrome(),new FireFox(),new Safari(),new Edge()};
        //A loop that picks all of the obj ane by one from array
        //and places it inside the b variable
        for(int i=0;i< bArr.length;i++){
            Browser b=bArr[i];
            b.get("https://www.amazon.com");
            b.performTest();
            b.CloseBroweser();
        }

    }
}
