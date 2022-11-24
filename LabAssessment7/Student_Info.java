/*
 Program: define student class with id, name, age,math's mark and print students mark 
          and print marks of student between 60 to 80(stream api)
 Author: Rajshree Gaikwad
 Date 24 Nov 2022
 */
package LabAssessment7;


import java.util.ArrayList;
import java.util.List;


// declaring class
class Student2
{
	//declaring varriables
	int id;
	String name;
	int age;
	double maths_mark;
	// using getter setter method & creating constructor
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(int id, String name, int age, double maths_mark) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.maths_mark = maths_mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMaths_mark() {
		return maths_mark;
	}
	public void setMaths_mark(double maths_mark) {
		this.maths_mark = maths_mark;
	}
	
} //end class of Student



//declaring public class

public class Student_Info {
	
	//calling main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating ArrayList
		List<Student2> students=new ArrayList <>();
		students.add(new Student2(101,"Rajshree",16,60));
		students.add(new Student2(102,"Rakhee",18,70));
		students.add(new Student2(103,"Sonal",20,80));
		students.add(new Student2(104,"Aboli",21,89));
		students.add(new Student2(105,"Minal",19,92));
		
		//method for printing marks 
		students.stream().filter(st->st.getMaths_mark()>60 && st.getMaths_mark()<80).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getMaths_mark()));

	}// end of main method
	
} // end o public class of Student_Info
