package Review4;

public class T1 {
    public static void main(String[] args) {
        for(int a=0;a<=9;a++){
            for(int b=0; b<=9;b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        System.out.println("Odometer:" +a+b+c+d);
                    }
                }
            }
        }
    }
}
