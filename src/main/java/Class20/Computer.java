package Class20;
//abstract means something is incomplete
//we can not create an object of the object class
//every abstract class must participate
public abstract class Computer {
   // OPTIONAL             OPTIONAL             MUST
    //ACCESS MODIFIER   NON ACCESS MODIFIER    data type name
   public static String type;
    public String name;
   public int memory;
    public String color;
   public Computer(String name,int memory,String color){
        this.name=name;
        this.memory=memory;
        this.color=color;
    }
    /*
OPTIONAL                     OPTIONAL                          MUST           MUST
    ( Access Modifier          NON-access modifier             Return Type      Name(){}
     Public,private,         (Static-Final-Abstract)
     protected,default)
     */
static void playMusic(){
    System.out.println("I can play music on my ");
}
protected  void printInfo(){
    System.out.println("I have "+name+" computer with "+memory+" memory");
}
public abstract void executeCode();
public abstract void readEmail();
}
 class Apple extends Computer{
    public Apple(String name,int memory,String color){
        super(name, memory, color);
    }
    /*when we provide implementation to the abstract classes we MUST
     follow rules of Overriding
     # same method name and parameter MUST be same-method signature MUST be the same
     # return type MUST be same
     # access modifier MUST be the same or wider
     */
    public void executeCode(){
        System.out.println("Executing the code on "+type+" "+name);
    }
    public void readEmail(){
        System.out.println(name+" can read my emails");
    }
 }