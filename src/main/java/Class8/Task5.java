package Class8;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers={9,10,15,18,20,22,30,60};
        boolean isSorted=true;
        for (int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println("is loop sorted "+isSorted);
    }
}
