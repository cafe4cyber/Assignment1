//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
package patternTest;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int nst=n;
		while(row<=n) {
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
			i++;
			}
			//Preparing for next row
			
			
			System.out.println();
			row++;
		
		}
	}

}
