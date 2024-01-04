package HW;
/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make
 fields private and define printInfo methods as well create
 the object of each class and call the method
 */

public class Bird {
   private String name;
    private String color;
     private double weight;
     private double height;
     public Bird(){

     }
    public void printInfo(){
        System.out.println(name+" "+color+" "+weight+" "+height);
    }
     public Bird(String name,String color,double weight,double height) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }
}
 class Parrot extends Bird {
    Parrot(String name,String color,double weight,double height){
        super(name,color, weight,height);
    }
}
class Sparrow extends Bird {
    Sparrow(String name, String color, double weight, double height) {
        super(name, color, weight, height);
    }

    public static void main(String[] args) {
        Parrot p=new Parrot("Tia","Yellow",300,15);
        p.printInfo();
        Sparrow s=new Sparrow("Luna","Black",450,28);
        s.printInfo();
    }
}