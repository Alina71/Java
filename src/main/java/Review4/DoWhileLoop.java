package Review4;

public class DoWhileLoop {

    public static void main(String[] args) {

        //while-when we do NOT know in advance
        //how many times we want to repeat block of code

        /*
        WHILE vs DO WHILE
        In DO WHILE block of code will be executed at least once
         even when condition is true
         */

        //I want to say hello 4 times
        int n=1;
        do{
            System.out.println("Hello");
            n++;
        }while(n<=4);
        System.out.println(n);


        System.out.println("---------Anither way------");
        int i=2;
        do{
            if(i%2==0){
                System.out.print(i+" ");

            }
            i++;

        }while(i<=10);
    }
}
