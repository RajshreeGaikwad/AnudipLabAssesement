/*
 Program:define Agent class with name ,Name, id,Area and sort it Area wise use Comparable interface
 Author: Rajshree Gaikwad
 Date:17 Nov 2022
 */
package LabAssessment6;

//importing Arraylist
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//declaring class
public class Main {

	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Agent>adata=new ArrayList<>(); //create new ArrayList
	adata.add(new Agent(103,"Rajshree","pune"));
	adata.add(new Agent(104,"Pakhee","Mumbai"));
	adata.add(new Agent(101,"Sonal","Banglore"));
	adata.add(new Agent(102,"Minal","Nashik"));
	Collections.sort(adata);
	for(Agent a:adata) //for loop
	{
		System.out.println("id:"+a.getId()+" "+"name:"+a.getName()+" "+"area:"+a.getArea()); //printing output
	} //end of loop
	

	} //end of main method

} //end of main class


class Agent implements Comparable<Agent> //comparable interface method
{
	
	 public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}



	String name;
	public Agent( int id,String name, String area) {
		super();
		this.name = name;
		this.id = id;
		this.area = area;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	int id;
	String area;



	@Override
	public int compareTo(Agent o) {
		// TODO Auto-generated method stub
		
		return this.area.compareToIgnoreCase(o.area);
	}



	
	}
	
