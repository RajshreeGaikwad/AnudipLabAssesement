/*
  program:Try to create functional interface of Adder(add 2 numbers) , UpperString(convert string in to uppercase) 
        and print them using lambda expression.
  author: Rajshree Gaikwad
  Date: 3 Nov 2022
 */
 package basic;


//declaring interface adder

interface Adder
{
	int add(int a,int b);
}

//declaring public class

public class LamdaExpression {
	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder d=(x,y)->   //insert lamda
		{
			return x+y;
		};
		System.out.println(d.add(23, 34)); // printing addition of 2 numbers
		
		
	} //end of main method
	
	
	}//end of class LamdaExpression
	


