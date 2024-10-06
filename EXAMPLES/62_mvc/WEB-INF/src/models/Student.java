package models;

import java.util.ArrayList;

public class Student{
	private String name;
	private int age;
	private String college;
	private String degree;

	public Student(){
	
	}

	public Student(String name,int age,String college,String degree){
		this.name = name;
		this.age = age;
		this.college = college;
		this.degree = degree;
	}

	public void registerStudent(){
		//----
		System.out.println(name);
		System.out.println(age);
		System.out.println(college);
		System.out.println(degree);
	}

	public static ArrayList<Student> collectStudents(){
		ArrayList<Student> students = new ArrayList<Student>();

		Student s1 = new Student("Mohan",23,"SRIT","BE");
		Student s2 = new Student("Sohan",21,"GGITS","BTech");
		Student s3 = new Student("Rohan",19,"GLOBAL","MTech");
		Student s4 = new Student("Tohan",20,"JEC","PHd");

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		return students;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setCollege(String college){
		this.college = college;
	}

	public String getCollege(){
		return college;
	}

	public void setDegree(String degree){
		this.degree = degree;
	}

	public String getDegree(){
		return degree;
	}
}