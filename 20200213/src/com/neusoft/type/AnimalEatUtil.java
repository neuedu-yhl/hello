package com.neusoft.type;

public class AnimalEatUtil {

	public static void autoEat(Object object) {
		if(object instanceof Animal2) {
			Animal2 an = (Animal2)object;
			an.eat();
		}
	}
	public static void main(String[] args) {
//		Animal an = new Animal();
//		autoEat(an);
	}
}
