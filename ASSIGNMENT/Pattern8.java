import java.util.*;
class Pattern8{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			//spaces
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=n;j>=n-2*i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}