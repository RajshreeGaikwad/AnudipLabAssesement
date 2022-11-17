/*
 Program: Create hashmap whose key are 1 to 15 and its value square of keys
 Author: Rajshree Gaikwad
 Date:17 Nov 2022
 */


package LabAssessment6;


//importing packages
import java.util.HashMap;
import java.util.Map.Entry;


//declaring class
public class HashMapDemo1 {

	//calling main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> SquareofValue=new HashMap<>(); // create HashMap method
		SquareofValue.put( 1,1);  //keys and square of value
		SquareofValue.put( 2,4);
		SquareofValue.put( 3,19);
		SquareofValue.put( 4,16);
		SquareofValue.put( 5,25);
		SquareofValue.put(6,36);
		SquareofValue.put( 7,49);
		SquareofValue.put( 8,64);
		SquareofValue.put( 9,81);
		SquareofValue.put( 10,100);
		SquareofValue.put( 11,121);
		SquareofValue.put( 12,144);
		SquareofValue.put( 13,169);
		SquareofValue.put( 14,196);
		SquareofValue.put( 15,225);
		
		 for (Entry<Integer, Integer> e : SquareofValue.entrySet())
		 {
	            System.out.println("Key: " + e.getKey() + " SquareofValue: " + e.getValue());
		 }
		
		
	}  //end of main method

} // end of main class 

