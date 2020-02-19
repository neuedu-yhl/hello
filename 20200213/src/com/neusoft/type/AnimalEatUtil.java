package com.neusoft.type;

public class AnimalEatUtil {

	public static void autoEat(Animal animal) {
		animal.eat();
	}

	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		autoEat(cat);
	}
	
}
