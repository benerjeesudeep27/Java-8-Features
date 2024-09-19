package com.java8.features;

interface Sayable {
	void say();
}

interface Runnable{
	int start(int a);
}

interface A{
	public boolean checkSingleDigit(int x);
}

class Digit{
	public static boolean isSingleDigit(int x) {
		return x >- 10 && x < 10;
	}
}
class TestStaticMethodReference{
	public static void main(String[] args) {
		//Using Lambda expression
		A a1 = (x)->{
			return x > -10 && x <10;
		};
		System.out.println(a1.checkSingleDigit(10));
		
		//Using Method Reference
		A a2 = Digit::isSingleDigit;
		System.out.println(a2.checkSingleDigit(9));
	}
}
public class MethodReference {
	public static void saySomething() {
		System.out.println("Hello this is static method.");		
	}
	public static void main(String[] args) {
		Sayable sayable = MethodReference::saySomething;
		sayable.say();
	}
}
class Test{
	public static int startProcess(int time) {
		System.out.println("It will take "+time+" minutes.");
		return time;
	}
}
class MethodReference2{
	
	public static void main(String[] args) {
//		Runnable run = Test::startProcess;
//		run.start(90);
		Runnable run = (a)->{
			return 90;	
		};
		int x = run.start(90);
		System.out.println("It will take "+x+" minutes.");
	}
}

//Reference to a Static Method :-
interface B{
	String name(String fName);
}
class WriteName{
	public static String myName(String name) {
		System.out.println("MY NAME IS "+name);
		return name;
	}
	public static void main(String[] args) {
		B b = (name)->{
			return name;
		};
		String fname =b.name("Sudeep");
		System.out.println("My name is "+fname);
		
		B b1 = WriteName::myName;
		b1.name("Sudeep");
	}
}


interface C{
	int marks(int no);
}
class TellYourMarks{
	public static int mymarks(int m) {
		System.out.println("I GOT "+m+" NO IN ENGLISH");
		return m;
	}
	public static void main(String[] args) {
		//Using lambda Expression:-
		C c = (maths)->{
			System.out.println("I got "+maths+" no in english");
			return maths;
		};
		c.marks(95);
		
		//Using static Method Reference:-
		C c1 = TellYourMarks::mymarks;
		c1.marks(96);
	}
}
interface Coding{
	String java(String code);
}
class Test1{
	public static String coding(String b) { //same datatype as abstract method
		System.out.println("Do i know java language ? : "+b );
		return b;
	}
}
class MethodRef{
	public static void main(String[] args) {
		//Using static method reference:-
		Coding code = Test1::coding;
		code.java("Python");
		code.java("Php");
		
		//Using lambda expression:-
		Coding cod = (java)->{
			return java;
		};
		cod.java("Java");
	}
}

//Reference to an Instance Method:-
interface X{
	String str(String a);
}
class InstanceMethodReference{
	public String strString(String s) {
		System.out.println(s+", Say Somthing about yourself");
		return s;
	}
	public static void main(String[] args) {
		InstanceMethodReference imr = new InstanceMethodReference();
		X x = imr::strString;
		x.str("Sudeep");
		X x1 = imr::strString;
		x1.str("Pooja");
	}
}


//Reference to a Constructor:-
interface Messageable{
	Message getMessage(String msg);
}
class Message{
	Message(String mg){
		System.out.println(mg);
	}
	public static void main(String[] args) {
		Messageable mesage = Message::new;
		mesage.getMessage("Hello, I Love You");
		
		//Using Lambda Expression:-
		Messageable m = (Msg)->{
			return new Message("Hello How are you "+Msg);
		};
		m.getMessage("Sudeep");
		m.getMessage("Pooja");
		
	}
}


//Usage of lambda expression and method reference:-
interface II{
	String str(String name, int age );
//	void m1();
//	int sum();
}
class Student{
	public static void main(String[] args) {
		//Using lambda expression:-
		II i = (fullName, age)->{
			System.out.println("My name is "+fullName+". My age is "+age);
			return fullName;
		};
		i.str("Sudeep Banerjee", 28);
		
		//Using method reference:-
		Student s1 = new Student();
		II i1 = s1::details;
		i1.str("Pooja Mahato", 26);
	}
	public String details(String name, int age) {
		System.out.println("My name is "+name+". My age is "+age);
		return name;
	}

}


interface Intra{
	Company com(String name);
}
class Company{
	Company(String name){
		System.out.println("The name of the company is "+name);
	}
	public static void main(String[] args) {
		//Using Method Reference:-
		Intra in = Company::new;
		in.com("Wipro");
		
		//Using Lambda Expression:-
		Intra in1 = (ComName)->{
//			System.out.println("THE NAME OF THE COMPANY IS "+ComName);
			return new Company("TCS");
			
		};
	in1.com("HCL");
	}
}











