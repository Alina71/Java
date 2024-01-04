package Review8;

import Review8_1.Orthodontist;

public class EmergencyRoom {
    public static void main(String[] args) {
      Doctor []doc={new Surgeon("John","Doe","Surgeon",20,"Fairfax,VA"),
      new Surgeon("Michael","Doe","Surgeon",20,"Fairfax,VA"),
              new Orthodontist("Josh","Doe","Surgeon",20)
      };
//doc[0].checkVitals();
//doc[0].checkVitals("Jane");
//doc[0].prescribeMedication("George");

for(int i=0;i<doc.length;i++){
    doc[i].checkVitals();
    doc[i].checkVitals("Jane");
    doc[i].prescribeMedication("Pills");
    System.out.println("*****************");

}
        System.out.println("*********Enhanced for LOOP**********");
for(Doctor doctor:doc){
    doctor.checkVitals();
    doctor.checkVitals("Jack");
    doctor.prescribeMedication("Pain killers");
    System.out.println("********************");

        }
    }
}
