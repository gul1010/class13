package com.class13;

public class Dog {
	public String breed;
	public String size;
	public String color;
	public int age;

	
	public void sleep() {
		System.out.println("ZZZZZZZzzzzzz");
	}
	public void bark() {
		for(int i=0; i<5; i++) {
		System.out.println("Ruff ruff ruff");
	}
	}
	public void eat() {
		System.out.println("Omnomnom");
	}
	public void look() {
		System.out.println("Hi am a dog my color is "+color);
	}

	public static void main(String[] args) {
		
		Dog Husky=new Dog();
		
		Husky.breed="Syberian Husky";
		Husky.size="large";
		Husky.color="White";
		Husky.age=1;
		Husky.bark();
		Husky.eat();
		Husky.sleep();
		Husky.look();
		
		Dog beagle=new Dog();
		beagle.age=8;
		beagle.breed="beagle";
		beagle.size="Large";

	}

}
