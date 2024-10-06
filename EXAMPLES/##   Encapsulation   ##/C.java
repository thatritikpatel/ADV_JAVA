class Student{
	private String name;
	private int age;

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
}

class C{
	public static void main(String[] args){
		Student s = new Student();

		//s.name = "m@han";
		s.setName("m@han");
		//s.age = 100;
		s.setAge(200);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}
}