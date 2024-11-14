import java.util.*;

class Demo {

	public static void main(String[] args){
	
		Scanner sc  = new Scanner(System.in);

		System.out.print("Enter Row: ");
		int row = sc.nextInt();

		for(int olc = 0;olc < row;olc++) {
		
			for(int ilc = 0;ilc <= olc;ilc++) {
			
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
//output:Enter Row: 4
 *
 *  *
 *  *  *
 *  *  *  *
//