/*
 Program:Write a java program to draw pattern
 @author: Rajshree Gaikwad
 @Date: 27 Oct 2022
 
 */

package basic;

import java.util.Scanner;
//declaring class
public class PatternDemo
{
//calling main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int row,r,c,d;
	    Scanner obj=new Scanner(System.in);
	    System.out.println("Enter rows : ");
	    row = obj.nextInt();
	    for (r = 0; r < row ; r++) 
	    {
	        System.out.print("* ");
	        for (c = 0; c <= row; c++)
	        { 
	            if (r == row - 1)
	                System.out.print("* "); //printing *
	            else
	                System.out.print(" "); //printing for space
	        }
	        
	        System.out.print ("\n");
	    }
	} // end of main method
	    
	
	

} //end of class PatternDemo


/*output:- if enter number 5

*
*
*
*
* * * * *
*/







