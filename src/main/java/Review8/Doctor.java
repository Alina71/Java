package Review8;

public class Doctor {
    public static String hospital;
    String firstName, lastName;
    protected String speciality;
    int yearsOfExperience;
    private double salary;
   public Doctor(String firstName, String lastName,String speciality, int yearsOfExperience){
this.firstName=firstName;
this.lastName=lastName;
this.speciality=speciality;
this.yearsOfExperience=yearsOfExperience;
    }
    public static void work(){
        System.out.println("Doctors work at "+hospital);
    }
protected void checkVitals() {
    System.out.println(firstName + " " + lastName + " checks vitals on every patient");
}
    /*
    what is Overloading-in the same class we have method with same name
    how to overload-by changing the num of parameters or dataType or sequence
    In overloading-the method signature MUST be different
    we do not care about return type or access modifiers-meaning by changing those we are not overload
     */
    void checkVitals(String patient){
        System.out.println(firstName+" "+lastName+" checks vitals on " +patient);
        patient.trim();
    }
    void prescribeMedication(String medication){
        System.out.println(firstName+" "+lastName+" prescribed "+medication);
    }
}

class Surgeon extends Doctor {
    String location;

    Surgeon(String firstName, String lastName, String speciality, int yearsOfExperience, String location) {
        super(firstName, lastName, speciality, yearsOfExperience);//call to construction happens first
        this.location = location;
    }

/*
Method overriding-in subclass(child class) and parent class we have method with the same name
How to override-we need inheritance
                MUST keep same name,same parameters and same return type
                Access Modifiers MUST be same or have wider access
In overriding Method Signature MUST be SAME
 */
public void prescribeMedication(String patient){
    System.out.println("Surgeon "+lastName+" prescribed medication to "+patient);
}
}
