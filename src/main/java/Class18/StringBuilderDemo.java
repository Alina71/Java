package Class18;

public class StringBuilderDemo {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str.concat(" And Welcome"));
StringBuilder sb=new StringBuilder("Hello");
sb.append(" And Welcome");
        System.out.println(sb);

        String s="";
        for(int i=0;i<1000;i++){
            s=s+i;
        }
        System.out.println(s);
    }
}
