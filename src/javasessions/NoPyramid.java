package javasessions;

import java.util.Scanner;

public class NoPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {//row
			for(int j=1;j<=i;j++) {//print*
				System.out.print(j);
			}
			System.out.println("");//line change
		}

	}

}

//	//System.out.print(i); for same no in a row for pyramid