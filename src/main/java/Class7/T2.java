package Class7;

public class T2 {
    public static void main(String[] args) {
        int [] numbers={10,20,30,45,69,55,69,78,15,20};
        //Search for number 55 if present print found
        for(int i=0; i<numbers.length;i++){
            if (numbers[i]==20){
                System.out.println("Found");
                break;
            }
        }
    }
}
