import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int num = sc.nextInt();
		for(int i = 0; i < 10; i++) {
			System.out.println(num + " * " + (10 - i) + " = " + num * (10 - i));
		}
	}
}
//output=Enter num : 2
2 * 10 = 20
2 * 9 = 18
2 * 8 = 16
2 * 7 = 14
2 * 6 = 12
2 * 5 = 10
2 * 4 = 8
2 * 3 = 6
2 * 2 = 4
2 * 1 = 2