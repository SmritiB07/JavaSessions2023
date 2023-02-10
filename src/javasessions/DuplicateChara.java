package javasessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChara {  //Duplicate chara and their count  

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter a english statement");//my name is smriti
       String str = sc.nextLine();
       sc.close();
       char[] ch = str.toCharArray(); // for investigation we need characters so convert 
       
       Map<Character,Integer> m=new HashMap<Character,Integer>();
       
       for(Character c: ch) {
    	   if (m.containsKey(c)){
    		   m.put(c, m.get(c)+1);
    	   }
    	   else {
    		   m.put(c, 1);
    	   }
       }
       
       for(Character c:m.keySet()) {
    	  if(m.get(c)>1) {
    		  System.out.println("Character"+" "+ c+ " " +"is repeated"+" "+ m.get(c)+" " +"times");
    	  } 
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
