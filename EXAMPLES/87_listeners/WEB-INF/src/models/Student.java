package models;

import javax.servlet.http.*;

public class Student implements HttpSessionBindingListener{
	private String name;
	private int age;

	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" ~ "+age;
	}
	

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void valueBound(HttpSessionBindingEvent ev){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(ev.getName()+" ~ "+ev.getValue());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public void valueUnbound(HttpSessionBindingEvent ev){
		System.out.println("~~~~~~~~~~~####~~~~~~~~~~~");
		System.out.println(ev.getName()+" ~ "+ev.getValue());
		System.out.println("~~~~~~~~~~~#####~~~~~~~~~~~");
	}
}