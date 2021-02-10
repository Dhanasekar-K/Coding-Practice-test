package dhanasekark;


class Animal//Parent class
{
	void characteristics()
	{
		System.out.println("Animal Shouts");
	}
}

class Dog extends Animal//Sub class
{
	void characteristics()//Overriding
	{
		System.out.println("Dog barks");
	}
}

class Horse extends Animal//Sub class
{
	void characteristics()//Overriding
	{
		System.out.println("Horse Neigh");
	}
}
	class Cat extends Animal//Sub class
	{
		void characteristics()//Overriding
		{
			System.out.println("Cat Meows");
		}
	}




public class TestQn4 {

	public static void main(String[] args) {
		
		Animal a=new Dog();//Object Creation
		a.characteristics();
		
		Animal b=new Horse();//object creation
		b.characteristics();
		
		Animal c=new Cat();//object creation
		c.characteristics();
		
	}

}
