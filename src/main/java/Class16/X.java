package Class16;
/*
Write program for multilevel inheritance where class Z inherits
from class Y and Class Y inherits from Class X.
 */

public class X {
    void print(){
        System.out.println("Hahahahah");
    }
}

class Y extends X {
    void print(){
        System.out.println("Lalalala");
    }

    class Z extends Y{
        void print(){
            System.out.println("Wawawa");
        }
    }
}