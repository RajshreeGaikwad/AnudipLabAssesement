package basic;
/*
  Program: 3
  @author: Rajshree Gaikwad
  @Date: 13 Oct 2022

 */

import java.util.Scanner;
public class TriangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        System.out.println("Enter value of x:");
    	int x = obj.nextInt();
    	System.out.println("Enter value of y:");
    	int y = obj.nextInt();
    	System.out.println("Enter value of z:");
    	int z = obj.nextInt();
        if (x+y+z == 180)
        {
        	if (x<90 && y<90 && z<90 )
             	{
            		System.out.println("Prize 1");

             	}
    }
             		
            	else if (x==90||y==90||z==90)
            	{
            		System.out.println("Prize 2");}
            	else if (x==60||y==60||z==60)
            	{
            		System.out.println("Prize 3");
            	}
            	else 
            	{
            		System.out.println("No Prize");
            	}

	}

}
