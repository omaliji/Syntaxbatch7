package com.syntax.class21;

public class AnimalsTest {
	
	public static void main(String[] args) {
		
		// object of parent class has an access to all variable and methods of it's own class ONLY
		Animal a =new Animal();
		a.breed = "Something";
		a.color = "grey";
		a.paws = 4;
		
		a.sleep();
		a.eat();
		
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color = "Yellow";
		dog.paws = 4;
		dog.tail= true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Cat cat = new Cat();
		cat.breed = "Husky";
		cat.color = "Black";
		cat.fur = "pooooo";
		cat.paws = 4;
		cat.tail = true;
		
		cat.purr();
		cat.eat();
		cat.sleep();
		
	}

}
