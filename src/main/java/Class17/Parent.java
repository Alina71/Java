package Class17;
//this keyword-this keyword is used to access instance
// variable when local variable has the same name
public class Parent {
    String name="israel";

}
class Child extends Parent{
    String name="Maria";
    void print(){
        String name="Levi";
        System.out.println(name);
    }

    public static void main(String[] args) {

    }
}