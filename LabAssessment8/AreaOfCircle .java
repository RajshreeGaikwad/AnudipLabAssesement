/*
 Program: Write a program to print the area of two circles having radius 4 and 20 respectively
 			by creating a class named 'Circle' with a method named 'Area' which returns the area and radius
 			passed as parameter to its constructor
 Author: Rajshree Gaikwad
 Date: 1 Dec 2022
 			*/
package LabAssessment8;


//declaring class
	public class AreaOfCircle 
	{
		//instance variable
	
		  	double Area;
			double pi=3.14;
		    int r;
		    		
		    // Parameterized Constructor of AreaOfCircle class
		    AreaOfCircle(int radius)
		    	{
		    		this.r=radius;
		    	} 
		    		
		    	// method to find area of first circle
		    	public double areaOffirstCircle()
		    		{
		    			return Area=pi*r;
		    			
		    		} //end method of find area of first circle
		    		
		    		// method to find area of second circle
		    		public double areaOfsecondCircle()
		    		{
		    			return Area=pi*r;
		    			
		    		} ///end method of find area of second circle

		    		//calling main method
		    		public static void main(String[] args) {
		    			// TODO Auto-generated method stub
		    			
		    			//create object of class AreaOfCircle 
		    			AreaOfCircle obj1=new AreaOfCircle(4);   
		    			AreaOfCircle obj2=new AreaOfCircle(20);
		    			
		    			//for printing area of first circle 
		    			System.out.println("Area of first circle:"+obj1.areaOffirstCircle());
		    			//for printing area of second circle
		    			System.out.println("Area of first circle:"+obj2.areaOfsecondCircle());
		    			
		    		}  //end of main method

		   } //end of class AreaOfCircle

	


