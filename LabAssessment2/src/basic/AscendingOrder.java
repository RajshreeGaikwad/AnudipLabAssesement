/*
program: Arrange String in length wise ascending order  /eg- this is easiest example
@author:Rajshree Gaikwad
@Date:20 Oct 2022
*/

package basic;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str= "is,this,easiest,example";
		 String[]result=str.split(",");
		 for(String i:result)
		 {
			 System.out.print(i+" ");
		 }

		 
		 
		 System.out.println(str.substring(3,7));
		 System.out.println(str.substring(0,2));
		 System.out.println(str.substring(8,15));
		 System.out.println(str.substring(16,23));
		 
		 
		


		 
	}
	
}