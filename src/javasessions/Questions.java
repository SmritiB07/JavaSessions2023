package javasessions;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number: ");
//		double number = sc.nextDouble();
//		System.out.println("enter power for number: ");
//		int power = sc.nextInt();
//		
//	
//		double PowerNumber=1;
//		// logic for finding the power of a number
//		for (int i = 1; i <= power; i++) {
//			PowerNumber = number*PowerNumber;
//
//		}
//
//		System.out.println(
//				"the no. is" +"  "+number +"  "+"after power is raised to" +" "+ power+" "+
//				"Number becomes" +" "+PowerNumber);
//	sc.close();
	
//	//Table of a no
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter number: ");
//	int n=sc.nextInt();
//	//table multiplication logic
//	for (int i=1;i<=10;i++) {
//		int table=n*i;
//		System.out.println(n+"X"+i+"="+table);
//	}
//	sc.close();
	
	//sum of digits of a no
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
	      sc.close();
		int sum=0;
		
		while(number!=0) {
			sum=sum+number%10;
			number=number/10;
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	
	
	}
	

}
