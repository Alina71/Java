package Class9;

public class Task6 {
    public static void main(String[] args) {
        //Create 2D array of countries:
        // north america countries, south america countries, europe countries,
        // asian countries, african countries. Then print all values from that
        // array using 2 different loops and calculate
        // how many total countries been stored.
         String[][] country={
                 {"Canada","USA","Mexico"},
                 {"Brazil","Colombia","Ecuador"},
                 {"China","Japan","Indonesia"},
                 {"Ghana","Ethiopia","Nigeria"}
         };

         for(int i=0;i<country.length; i++){
             for(int j=0;j<country[i].length;j++){
                 System.out.print(country[i][j]+" ");
             }
             System.out.println();
         }

        System.out.println("+++++++++++++++++++++++");
         for(String[] names:country){
           for(String countryArray:names){
               System.out.print(countryArray+" ");
           }
             System.out.println();
         }
    }
}
