package Review3;

public class SwitchAgain {
    public static void main(String[] args) {

        char choice='y';

        switch(choice){
            case 'y':
                System.out.println("Means Yes");
                break;
            case 'n':
                System.out.println("Means no");
                break;
            case 'm':
                System.out.println("Means maybe");
                break;
            default:
                System.out.println("I do not understand");
        }
    }
}
