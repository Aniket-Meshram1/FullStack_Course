package com.inheritance;

public class AccessVissibility {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.disp());
		

	}

}
// Child class overridden method always have same access specifier or high visibility Access Specifier .
//if child class have lower visibility then it is not allowed

class Visibility {
	protected void disp() {
		System.out.println("Parent Method");
	}
}
class Visibility1 extends Visibility{
	protected void disp() {
		System.out.println("Child Method");
	}
}
class Visibiity2 extends Visibility{
	
//	the return type of child overridden method should be same as parent method 
//	public int disp() {
//		System.out.println("Child1 Method");
//		return 0;
//	}
}



// we can keep the return type different of overridden method of child from parent but both the retrun type should be in the is-a relationship
class Parent{
	Animal disp() {
		Animal a = new Animal();
		return a;
	}
}
class child extends Parent{
	Dog disp() {
		Dog d = new Dog();
		return d;
	}
	
}
class Animal{
	int b;
}
class Dog extends Animal{
	int a;
}