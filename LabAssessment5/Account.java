/*
  program:Create an Account class with private account,name,balance. and generate simple banking application of
           withdraw amount and display on screen
  @author:Rajshree Gaikwad
  @Date: 10 Nov 2022
 */
package LabAssignment5;


import java.io.Serializable;

//declaring class
public class Account implements Serializable {

	
		private String name;  // private variable
		private Double Balance;
		public Account()   // constructor
		{
			super();
		}
		public String getName()   // getter method
		{
			return name;
		}
		public void setName(String name)  // setter method
		{
			this.name = name;
		}
		public Double getBalance()  // getter method
		{
			return Balance;
		}
		public void setBalance(Double balance) // setter method
		{
			Balance = balance;
		}
		public void withdraw() //method
		{
			double withdrawamt=3000;
			if(Balance<withdrawamt)  // if else statement
			{
			System.out.println("Insufficeint amount");
			}
			else 
			{
				System.out.println("withdraw easily");
			}
			
			Balance=Balance-withdrawamt;
			System.out.println("After withdraw :"+Balance);
		}
		
		public void deposite() //methiod
		{
			double depositeamt=67;
			Balance=Balance+depositeamt;
			System.out.println("After deposite :"+Balance);
		
		
	
	}

}
 //end of main class