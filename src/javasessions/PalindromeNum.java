package javasessions;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any no:");
	int num= sc.nextInt();
	sc.close();
	int originalnum=num;
	int remainder=0;
	int dicing=0;
    while(num!=0) {
    	remainder=num%10;
    	dicing=(dicing*10)+remainder;
    	num=num/10;
    	
    }
	if(originalnum==dicing) {
		System.out.println("Yes, Input no. is Palindrome");		
	}
	else {
		System.out.println("No,Input is not palindrome");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
