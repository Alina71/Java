package Class4;

public class E1NestedIfConditions {
    public static void main(String[] args) {
        boolean isMainDoorOpened = false;
        boolean isRoom10Opened = false;
        boolean isRoom20Opened = true;


        if (isMainDoorOpened) {
            if (isRoom10Opened) {
                System.out.println("We are in room1");
            } else {
                System.out.println("Room 1 is closed");
            }
            if (isRoom20Opened) {
                System.out.println("We are in the room 2.");

            }else{
                System.out.println("Room 2 is closed");
            }
        } else {
            System.out.println("Can't open the house main door is closed");
        }



    }
}
