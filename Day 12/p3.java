import java.util.*;

class Demo {
        public static void main(String[]args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Input1: ");
		int num1=sc.nextInt();
		
		System.out.println("Input2:");
		int num2=sc.nextInt();
		
		int Sum =(num1*num1*num1)+(num2*num2*num2);
		int Sub=(num1*num1)-(num2*num2);          		
		
		System.out.println("Addition of:"+(num1*num1*num1)+" & " +(num2*num2*num2)+" is:"+Sum);
		System.out.println("Substraction of:"+(num1*num1)+" & "+(num2*num2)+" is:"+Sub );
		}
	}
//output=Input1:
10
Input2:
20
Addition of:1000 & 8000 is:9000
Substraction of:100 & 400 is:-300//