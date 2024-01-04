package HOMEWORK;

public class exem {
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){

                if(a[i][j]%2==0){
                    if(a[j][i]%2==0){
                        int sum=0;
                        sum=sum+a[j][i]+a[i][j];
                        System.out.println(sum);
                    }
                }
            }
        }
    }
}