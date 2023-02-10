package javasessions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemDupFrAr {

	

	public static void main(String[] args) {
//		int OrgAr[]= {7,3,4,3,5,8,5,4,6,7,9,6,10,11};//Array literal
//		Set<Integer> set=new HashSet<Integer>();
//		for(int i=0;i<OrgAr.length;i++) {
//			set.add(OrgAr[i]);
//		}
//         Integer  NewAr[]=set.toArray(new Integer[set.size()]); 
//         System.out.println(Arrays.toString(NewAr));
		//int OrgArr[]= {3,3,4,5,5,6,6,7,8,9,9};
		
		
//	System.out.println("=====Finding duplicate element========");	
//	
//		String OrgArr[]= {"Nidhi","Priya","Nidhi","Tiya","Tiya","Riya"};
//		
//		HashSet<String> hset=new HashSet<String>();
//		for(int i=0;i<OrgArr.length-1;i++) {
//			if(hset.add(OrgArr[i])==false) {
//				System.out.println(OrgArr[i]+"is duplicated in the array at"+":"+i);
//				
//			}
//		}
//		
		System.out.println("======Find count of digits in a number=========");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an digit no:");
		int digits=sc.nextInt();
		sc.close();
		int count=0;
		
		while(digits>0) {
			digits=digits/10;
			count++;
		}
		System.out.println("No of digits in the given number are:"+" "+count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
