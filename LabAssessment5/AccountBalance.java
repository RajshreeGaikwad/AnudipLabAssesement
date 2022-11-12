/*
  program:Create an Account class with private account,name,balance. and generate simple banking application of
           withdraw amount and display on screen
  @author:Rajshree Gaikwad
  @Date: 10 Nov 2022
 */
package LabAssignment5;

//declaring class
public class AccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		
		ac.setName("Rajshree");  // set value
		ac.setBalance(24000d);	// set value
		
		System.out.println(ac.getName()); // get value
		System.out.println(ac.getBalance());// get value
		
		ac.withdraw(); // method call
		ac.deposite(); // method call

	}

	} //end of class


