/*
  program: Create Shape class and it has two child class Circle and Square. 
          both class have getArea() method to display area of that shape.
  author: Rajshree Gaikwad
  Date: 3 Nov 2022
 */
package basic;


//declaring parent class
class Shape
{
	void display() //insert method
	{
		System.out.println("Shape...");
	} 	
} //end of parent class

//declaring child class
class Circle extends Shape
{
	void getarea( ) //insert method
		{
		double p = 3.14;
		int r = 4;
		double a = p*r*r;
		System.out.println("Area of Circle= "+a+" sq.m");
		}
	
} //end of child class


//declaring child class
class Square extends Shape
{
	void getarea( ) //insert a method
	{
		int h = 8;
		int b = 4;
		double a = h*b/2;
		System.out.println("Area of Square= " +a +"sq.m");
	}
	} //end of child class


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.display();
		c.getarea();
		Square x = new Square();
		x.display();
		x.getarea();
		
	} //end of main method

} //end of class Area


	

