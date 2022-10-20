/*
program: find HCF of two number, the numbers are 60,36
@author:Rajshree Gaikwad
@Date:20 Oct 2022
*/

package basic;

//declaring class
public class Hcf {
	//calling main method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=60;
		int num2=36;
		int a,hcf=0;
		for(a=1;a<=num1 || a<=num2;a++)
		{
			if(num1%a==0 && num2%a==0 )
				hcf=a;
			
		} //end of for loop
		
		System.out.println(hcf); //printing hcf number

	} // end of main mathod

} //end of class Hcf
