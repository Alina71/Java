package Class18;

public class Animal {
   private String name;
    private String color;
    private int age;
   private double weight;

   public Animal(String name,String color,int age,double weight){
this.name=name;
this.color=color;
this.age=age;
this.weight=weight;
   }
   void sleep(){
       System.out.println("ZZZZZZZzzzzz");
   }
   void speak(){
       System.out.println("Animal specking");
   }
   void printInfo(){
       System.out.println(name+" "+color+" "+age+" "+weight);
   }
}
 class Dog extends Animal{
Dog(String a,String b,int c,double d){
    super(a,b,c,d);
}
public void speak(){
    System.out.println("Wuff Wuff....");
}

}
