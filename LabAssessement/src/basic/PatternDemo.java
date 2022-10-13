/*
 * Program: 2
 @author:Rajshree Gaikwad
 @Date: 13 Oct 2022
 */
package basic;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("please Enter the number");
		int x=obj.nextInt();
		if(x%4==1)
		{
			System.out.println("Emrald");
		}
		else if(x%4==2)
		{
			System.out.println("Ruby");
			
		}
		else if(x%4==3)
		{
			System.out.println("Pearl");
		
		}
		else if(x%4==4)
		{
			System.out.println("Saphire");
		}
	}

}
