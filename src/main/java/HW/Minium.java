package HW;

public class Minium {
   /*
   Create a method to find the minimum of two numbers.
   Method will be passed two parameters and will return
   the minimum number. Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5
    */
    public static int min(int a,int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    public static double min(double a,double b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(10,5));
        System.out.println(min(2.5,3.5));
    }
}
