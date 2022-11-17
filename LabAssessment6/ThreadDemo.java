/*
 Program:Create two thread one thread is finding average of first 50 numbers and other thread is printing square of number
          store in array arr{10,15,20,25,30}
 Author: Rajshree Gaikwad
 Date:17 Nov 2022
 */
package LabAssessment6;
import java.util.*;

//declaring class
public class ThreadDemo implements Runnable {
	
	//calling main method
	public static void main(String[] args)
		{
			
		Runnable obj=new Runnable() 
		{
		public void run()
		{
			
		    int sum=0;
		    float avg=0;
			for(int i=1;i<=50;i++) //for loop
			{
				sum+=i;
				
				avg=(sum/50);
				
			}
			System.out.println("Average ="+avg); //for printing average
		 }
		};
		Runnable obj1=()->
		{
		   int array[]= {10,15,20,25,30}; //aarayList
			
			for(int i=0;i<array.length;i++) //for loop
			{
			   int sqr=array[i]*array[i];
				System.out.println("\nSquare of "+array[i]+"="+sqr); //for printing output
			}
			
		};
		
		
		 new Thread(obj).start();
		 Thread t1=new Thread(obj1);
		 t1.start();
		
		}	
		public void run() //thread
		{
			
		
		}

	

}// end of class
