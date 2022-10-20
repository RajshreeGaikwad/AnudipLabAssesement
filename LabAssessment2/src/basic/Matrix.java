/*
program: Write a program to transpose of matrix{{1,2},{4,5},{8,9}} and multiplication of all members in java .
@author:Rajshree Gaikwad
@Date:20 Oct 2022
*/

package basic;

//declaring class
public class Matrix {

	
		//calling main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a matrix  
		int a[][]= {{1,2},{4,5},{8,9}}; //array elements
		
		//creating another matrix to store the matrix
		
		 int c[][]=new int[2][3]; // 2 rows and 3 column
		 
		 for(int i=0;i<2;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 c[i][j]=a[j][i];
			 }
		 } // end of for  loop
		 
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
		
	} // end of loop
			
	        int mul=1;
	       for(int num[]:a)
	       {
	           for(int y:num)
	           {
	               mul=mul*y; //for multiplication of all numbers
	           }
	       }
	        System.out.println("mul ="+mul);
			
			
	
	} //end of main method
	
} //end of class Matrix


