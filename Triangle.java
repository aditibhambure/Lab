
package lab_ex;
import java.util.Scanner;4

public class Triangle {

	public static void main(String[] args) {
		int i,j,n;

        System.out.print("Input number of n : ");
     	Scanner in = new Scanner(System.in);
	    n = in.nextInt();

        for(i=1;i<=n;i++)
        {
        for(j=1;j<=i;j++)
         System.out.print(i);
       System.out.println("");
       }

	}

}
