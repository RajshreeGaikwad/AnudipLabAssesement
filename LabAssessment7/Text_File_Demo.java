/*
 Program: Read data from text file and print words 
          whose length is greater than 5 character
 Author: Rajshree Gaikwad
 Date:24 Nov 2022*/

package LabAssessment7;


//importing packages
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


//declaring class
public class Text_File_Demo {

		
	//calling main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//declaring varriable
		int ch,i;
		//fileInputStream method from file handeling & file path
		FileInputStream obj=new FileInputStream("E:\\test.txt");
		String s="";
		
		//while loop
		while((ch=obj.read())!=-1) //for read 
		{
			
			s=s+(char)ch; //typecasting
		} //closing while loop
		
		 String str1[]=s.split(" ");
		 
		 //using for loop
		for( i=0; i<str1.length; i++)
		{
			if(str1[i].length()>5) // condition for print words whose length is greater than 5 character
		    {
				System.out.println(str1[i]); // for printing output
			}
	} // closing for loop

		
			
		

	} // closing main method

} //end class of Text_File_Demo
