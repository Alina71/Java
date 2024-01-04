package org.example;

public class Main {
        String name;
        String lastName;
        int employeeId;
        String startDate;
        int salary;
        void printInfo(){
            System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
        }
 public Main(int employeeId,int salary){
            this.employeeId=0;
            this.salary=0;
        }
 public Main(String name,String lastName,int employeeId,String startDate,int salary){
            this.name=name;
            this.lastName=lastName;
            this.employeeId=employeeId;
            this.startDate=startDate;
            this.salary=salary;
        }
        public static void main(String[]args){
            Main m1=new Main(0,0);
            m1.printInfo();
            Main m2=new Main("Joe","Smith",12345,"01/01/1970",35000);
            m2.printInfo();
        }
    }
