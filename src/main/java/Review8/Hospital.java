package Review8;

import Review8_1.Orthodontist;

public class Hospital {
    public static void main(String[] args) {
Doctor.hospital="Inova";
Surgeon surgeon=new Surgeon("John","Doe","Surgeon",20,"Fairfax,VA");
surgeon.checkVitals("Jane Smith");
surgeon.prescribeMedication("Smith");
Doctor.work();//accessing static method in static way from the class where it was defined
Surgeon.work();//accessing static method from parent class in static way using child className

       Orthodontist ortho= new Orthodontist("Josh","Smith","Orthodontist",20);
       Orthodontist.work();//parent
       ortho.checkVitals();//parent
       ortho.prescribeMedication("Pain killers");//child
        ortho.printSpeciality();//child

        System.out.println("******************");
        Doctor ortho1=new Orthodontist("Josh","Smith","Orthodontist",20);
        ortho1.checkVitals();
        ortho1.checkVitals("Michael");
        //we are achieving a runtime play through method overriding
        //during run time Java gives preference to the Object type(in this case it object of child class)
        ortho1.prescribeMedication("Pills");//java executed child class method
        System.out.println("*********************");
       Doctor sur=new Surgeon("John","Doe","Surgeon",20,"Chicago");
       sur.checkVitals();
       sur.checkVitals("Mohammed");
       sur.prescribeMedication("Pills");
    }
}
