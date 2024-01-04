package Class14;

import static Class14.Students.numOfStudent;

public class StudentsTester{
    public static void main(String[] args){
    Students st1 = new Students();
st1.name="Misha";
st1.name="Gicu";
numOfStudent++;

Students st2= new Students();
st2.name="Masha";
st2.name="Liza";
numOfStudent++;

Students st3=new Students();
st3.name="Colea";
st3.name="Rita";
numOfStudent++;

        System.out.println("Number student is "+numOfStudent);
    }
}
