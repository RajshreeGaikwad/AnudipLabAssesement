/*
 Program: Calculate electricity bill if units are upto 100 charges=1.20rs per unit
 			100 to 300  charges=2rs per unit,  otherwise 3rs per unit
 Author: Rajshree Gaikwad
 Date: 1 Dec 2022
 			*/

package LabAssessment8;

//importing package
import java.util.Scanner;


//declaring class
public class ElectricityBill {
	
	
		//calling main method
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Unit:");
			int unit=sc.nextInt();   //for give unit from user
			
			double paybill;
			
			//for checking electricity bill if unit is upto 100
			if(unit<=100)
			{
				
				//for calculate the electricity bill
				paybill=unit*1.2;
				System.out.println("Electricity bill upto 100 unit is a:"+paybill);
			}
			
			//for checking electricity bill if unit is 100 to 300
			else if( unit<=300)
			{
				paybill=100*1.2+(unit-100)*2;
				System.out.println("Electricitybill if unit 100 to 300 :"+paybill);
			}
			
			//for printing electricity bill if unit is other than above both condition
			else
			{
				paybill=(100*1.2)+(200*2)+(unit-300)*3;
				System.out.println("Electricity bill:"+paybill);
			}

		} //end main method

} // end of class ElectricityBill
