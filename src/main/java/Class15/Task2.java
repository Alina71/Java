package Class15;

public class Task2 {
    private String name;
    private double mathGrade ;
    private double bioGrade;
    private double LanGrade;

    public Task2(String sName,double m1,double m2, double m3){
        name=sName;
        mathGrade=m1;
        bioGrade=m2;
        LanGrade=m3;
    }

        public void calculateAvg(){
        double calculateAvg=(mathGrade+bioGrade+LanGrade)/3;
        System.out.println(name+"'s avg marks are "+calculateAvg);
    }
    }
