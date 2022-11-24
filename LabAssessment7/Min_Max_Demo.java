/*
 Program: find maximum and minimum marks using max() and
          min() method in above example
 Author:Rajshree Gaikwad
 Date: 24 Nov 2022
 */
package LabAssessment7;
 //importing packages
import java.util.ArrayList;
import java.util.List;


 //declaring class
class Student
 {
	//declaring variables
	int id;
	String name;
	int age;
	double marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//use getter setter method , creating constructor 
	public Student(int id, String name, int age, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
 } //end of class Student


//declaring public class
public class Min_Max_Demo {

	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arrayList
		List<Student> students=new ArrayList <>();
		students.add(new Student(101,"Rajshree",16,60));
		students.add(new Student(102,"Rakhee",18,70));
		students.add(new Student(103,"Sonal",20,80));
		students.add(new Student(104,"Aboli",21,89));
		students.add(new Student(105,"Minal",19,92));
		
		Student st=students.stream().max((students1,students2)-> students1.getMarks()>students2.getMarks()?1:-1).get(); // for finding maximum number 
		System.out.println(st.getId()+" "+st.getName()+" "+st.getAge()+" "+st.getMarks()); //for printing output of maximum number
		
		Student st1=students.stream().min((students1,students2)-> students1.getMarks()>students2.getMarks()?1:-1).get(); //for finding minimum number
		System.out.println(st1.getId()+" "+st1.getName()+" "+st1.getAge()+" "+st1.getMarks());

	}  //end of main method

} //end  public class of Min_Max_Demo 
