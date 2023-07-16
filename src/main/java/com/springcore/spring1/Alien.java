package com.springcore.spring1;

public class Alien {
	
	private int age;
	Laptop laptop;     //BEAN NAME -- Laptop REF-- Laptop and object is laptop.
	
	/*public Alien()
	{
		System.out.println("Alien Object Created.");
	}*/
		
	public Alien(int age, Laptop laptop) {
		System.out.println("Alien Object Created with asked parameters.");
		this.age = age;
		this.laptop = laptop;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//At bean creation it is calling setAge method , it should always match the name given as id otherwise it will give error.
		//we cannot assign it as setAge1 , or we should give id as age1.
		System.out.println("Setter Method is being called by <beans>.");
		this.age = age;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		System.out.println("Laptop Object Setted.");
		this.laptop = laptop;
	}

	public void code () {
		
		System.out.println("Im Coding...");
		laptop.compile();
	}
}
