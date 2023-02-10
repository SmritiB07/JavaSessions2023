package javasessions;

public class ReverseString {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("12345678910");
		for(int i=0;i<=sb.length()/2;i++) {
			//indexing
			int front=i;
			int back=sb.length()-1-i;
			//character
			char frontchar=sb.charAt(front);
			char backchar=sb.charAt(back);
			//swapping
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontchar);
			
		}
        System.out.println(sb);
	}

}
