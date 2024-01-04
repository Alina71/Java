package Class3;

public class T8 {
    public static void main(String[] args) {
        String trafficLight="Yellow";

        if(trafficLight.equals("Red")){
            System.out.println("Stop");

        }else if(trafficLight.equals("Yellow")){
            System.out.println("Cautation");

        }else if(trafficLight.equals("Green")){
            System.out.println("Go");
        }else{
            System.out.println("error");
        }
    }
}
