/*
  program: Make arraylist of 5 numbers and isolate even odd numbers using lambda expression.
  author: Rajshree Gaikwad
  Date: 3 Nov 2022
 */
package basic;

import java.util.ArrayList;
import java.util.List;

//declaring class

public class EvenOddNumber {
	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> number=new ArrayList<Integer>();
		
		number.add(25);
		number.add(44);
		number.add(17);
		number.add(56);
		number.add(90);
		
		number.forEach((m)->   //lamda insert
		{
			if(m%2==0)       
				{
				System.out.println("This is even number"+" "+m); //for printing even number from ArrayList
				}
				
			else 
			{
				System.out.println("This is Odd number:"+" "+m); //for printing odd number
			}
			
	});


	} //end of main method

} //end of class EvenOddNumber
