/*
 * Program: 1
 @author:Rajshree Gaikwad
 @Date: 13 Oct 2022
 */

package basic;

import java.util.Scanner;

public class SplitDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("please Enter the number");
		int x=obj.nextInt();
		if(x%4==1)
		{
			System.out.println("Sapphire");
		}
		else if(x%4==2)
		{
			System.out.println("Perl");
			
		}
		else if(x%4==3)
		{
			System.out.println("Ruby");
		
		}
		else if(x%4==0)
		{
			System.out.println("Emerald");
		}
	}
	

}
