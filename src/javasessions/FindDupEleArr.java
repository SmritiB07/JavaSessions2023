package javasessions;

public class FindDupEleArr {

	public static void main(String[] args) {
//		int[] OrgArr= {3,4,5,3,6,7,7,1,8};
//		for(int i=0;i<OrgArr.length;i++) {
//			for(int j=i+1;j<OrgArr.length;j++) {
//				if(OrgArr[i]==OrgArr[j]) {
//					System.out.println(OrgArr[i]+"is duplicated in the array");
//				}
//				
//			}
//		}
		
		System.out.println("=======Removing duplicates from sorted array========");
		int[] OrgArr= {3,3,3,4,4,4,5,5,6,6,7,7,9};//sorted array
		int j=0;
		for(int i=0;i<OrgArr.length-1;i++) {
			if(OrgArr[i]!=OrgArr[i+1]) {
				
				OrgArr[j]=OrgArr[i];
				j++;	
			}		
		}
		OrgArr[j]=OrgArr[OrgArr.length-1];
		for(int k=0;k<=j;k++) {
  System.out.println(OrgArr[k]+" ");			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
