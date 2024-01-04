package HW;

public class User {
    /*
    Write program: User that has a constructor that initializes
    instance variable name and mobile number. Create a subclass/child
    class  userInfo that will have user address variable and it also
    being initialized through constructor call. Print users name, mobile number
    and address in userDetails method. Test your code.
     */

    private String name;
    private int mobileNumber;
    private String userAddress;

    public User(String name, int mobileNumber, String userAddress) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.userAddress = userAddress;
    }
    public void userDetails(){
    System.out.println(name);
        System.out.println(mobileNumber);
        System.out.println(userAddress);

}

    static class userInfo extends User {
        userInfo(String name, int mobileNumber, String userAddress) {
            super(name, mobileNumber, userAddress);
        }

        public static void main(String[] args) {
            User u = new User("Ulian", 654893214, "4785 Rose str");
            u.userDetails();
        }
    }
}
