import java.util.Scanner;

public class A {

	
	
	public static void calculator(){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number : ");		
		int num1=input.nextInt();
		System.out.println("enter the second number :");
		int num2=input.nextInt();
		
		System.out.println("the result is : "+Main.add(num1, num2));
		
		
		
	}
}
