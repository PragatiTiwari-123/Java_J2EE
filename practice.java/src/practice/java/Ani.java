package practice.java;

// Non- static program(variables)
//public class A { // class helps us to generate  object. class will generate object when it receive a request from new keyword.
//        int x = 100; // we create non static member outside the method but inside the class.
//	public static void main(String[] args) {
//		A a1 = new A();  // without creating object we don't access these variable.
//		A a2 = new A(); //object called instance. without creating object we do not execute the program. using new keyword make the object.
// instance are called object. a java object is a member of java class. each object has an identity a behavior & state.
//		System.out.println(a1.x);//non static variable access with reference variable
//		System.out.println(a2.x);//100
//
//	}
//
//}

//Static program(variables)
//  public class A{ // static variable has global access
//	static int x = 10;//we create static member outside the method but inside the class using static name and belongs to class
//    static boolean x1; // not mandatory to initialize static variable because it gets stored default value.
//    public static void main(String[] args) {
//		System.out.println(A.x); // static member access with class name.
//    	System.out.println(x); // we also access with static variable name.
//		System.out.println(A.x1);// gets stored null value
//		A.x =20; // we can change the value of static variable
//	    System.out.println(A.x);//20
//		
//	}
//}

//Local variable Program
//public  class A{
//	public static void main(String[] args) {
//		int x = 100; // local variable created inside the method and should be used only within created method.
//		int x; // without initializing we cannot use that variable.
//		System.out.println(x); // used here
//		System.out.println(x);//error
//	}
//}

//Reference variable
//public class A{
//	int x = 10000;
//	public static void main(String[] args) {
//		 A a1 = new A();// we create a reference variable with ClassName VariableName like( A a1) A reference variable is one that refers 
//		 //to the address of another variable it represent the name of another variable location or value.
//		 System.out.println(a1.x); //you can access object members using a reference variable using dot syntax.
//	}
//}

//OOPS Concept:- OOPS refers to languages that use objects in programming. they use objects as primary source to implement what is to 
//happen with a code. Object oriented programming aims to implement real world entities like 
//(1)Inheritance      (2)Abstraction           (3)Polymorphism           (4)Encapsulation

//(1) Inheritance:- Here we inherit the member of parent class to child class with intention to reuse that.

//public class A{
//	int x =  10;
//}

//public class A{
//	int x =  10;
//	public void test() {
//		System.out.println(100);
//	}
//}

//Polymorphism example


class Animal{
	public void sound() {
}
public class Ani{
	public static void main(String[] args) {
		Animal genericAnimal = new Animal();
		Animal dogAnimal = new Dog();
		Animal catAnimal = new Cat();
	}
	
}
//Runtime Polymorphism in java 
//class Animal{
//	void makesound() {
//		System.out.println("Genric animal sound");
//	}
//}
//	
//	class Dog extends Animal{
//		@Override
//		void makesound() {
//		System.out.println("Woof");
//		}	
//	}
//	class Cat extends Animal{
//		@Override
//		void makesound() {
//			System.out.println("Meow");
//      }
// }
//
//public class Imp {
//
//	public static void  main(String[] args) {
//		Animal animal1 = new Dog();
//		Animal animal2 = new Cat();
//		
//		animal1.makesound();
//		animal2.makesound();
//
//	}
//
//}

//Method overloading in polymorphism 
//public class Calculator {
//	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		//using the first add method with two integer
//		int sum1 = Calculator.add(10,15);
//		System.out.println("sum of two integers:" +sum1);
//		
//		
//		//using the second add method with three integer
//		int sum2 = Calculator.add(5, 10, 15);
//		System.out.println("Sum of Thrree integers:" +sum2);
//		
//		//using the third add method with two doubles
//		double sum3 = Calculator.add(3.71, 2.34);
//		System.out.println("Sum of two doubles:" +sum3);
//		
//	}
//
//	private static double add(double a, double b) {
//		return a;
//	}
//
//	private static int add(int a, int b, int c) {
//		return a+b+c;
//	}
//
//	private static int add(int a, int b) {
//		return a+b;
//	}
//
//}
















































