package Class18;

public  class Parent {
   void marry(){
        System.out.println("Mary the girl that we selected for you");
    }
    void sleep(){
        System.out.println("Sleep 8 hours");
    }
}
class Karimi extends Parent{
void marry(){
    System.out.println("I want to marry Scarlett Johansson");
}
}class Tester{
    public static void main(String[] args) {
        Karimi k=new Karimi();
        k.marry();
        k.sleep();
    }
}