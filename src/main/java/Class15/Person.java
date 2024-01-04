package Class15;

public class Person {
   private String name;
   private int age;
    private double weight;
    private double salary;
    private String favPLanguage;

    public Person(String pName, int pAge, double pWeight, double pSalary, String pFavPlan) {
        name = pName;
        age = pAge;
        weight = pWeight;
        salary = pSalary;
        favPLanguage = pFavPlan;
    }
    public Person(String pName, int pAge, double pWeight, double pSalary){
        name = pName;
        age = pAge;
        weight = pWeight;
        salary=pSalary;
    }
    public Person(String pName, int pAge, double pWeight) {
        name = pName;
        age = pAge;
        weight = pWeight;

    }

    void printInfo () {
        System.out.println(name + " " + age + " " + weight);
    }
}
