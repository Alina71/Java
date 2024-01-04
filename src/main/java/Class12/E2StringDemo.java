package Class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="Its Savera's Birthday today. Its Sunday. Today is Java class";
        String [] wordArr= str.split(" ");
        System.out.println(wordArr.length);
        System.out.println(wordArr[6]);
    }
}
