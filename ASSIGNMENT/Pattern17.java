 public class Pattern17{
 
    public static void main(String[] args) {
        int n=5;
        int Number=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(Number+" ");
                Number++;
            }
            System.out.println();
        }
    }
 }