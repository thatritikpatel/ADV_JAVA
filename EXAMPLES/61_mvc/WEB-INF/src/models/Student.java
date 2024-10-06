package models;

public class Student{
	private String name;
	private int age;
	private String college;
	private String degree;

	public void registerStudent(){
		//----
		System.out.println(name);
		System.out.println(age);
		System.out.println(college);
		System.out.println(degree);
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