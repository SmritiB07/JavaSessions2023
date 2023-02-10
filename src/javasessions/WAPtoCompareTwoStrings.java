package javasessions;

import java.util.Scanner;

public class WAPtoCompareTwoStrings {

	public static void compare(String s1, String s2) {
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings entered are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter string1 :");
		 String string1=sc.next();
			System.out.println("Enter string2 :");
			String string2=sc.next();
		compare(string1,string2);
		sc.close();
	}

}
