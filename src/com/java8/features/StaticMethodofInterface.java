package com.java8.features;

interface I3{
	void m1();
	int m2();
	public static String m3(String yourname) {
		//m3();
		System.out.println(yourname);
		return yourname;
	}
	public default  String m3() {
		I3.m3("Pradeep");
		I4.m3("Subhash");
		return "Mahadev";
	}
	public static String m4(String yourname) {
		I3.m3("Kavita");
		System.out.println(yourname);
		return yourname;
	}
}

interface I4{
	public static String m3(String yourname) {
		I3.m3("Reshma");
		System.out.println(yourname);
		return yourname;
	}
}

interface I5{
	public static String m3(String yourname) {
		System.out.println(yourname);
		return yourname;
	}
}
public class StaticMethodofInterface implements I3, I4 ,I5{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int m2() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String m3(String cls) {
		System.out.println("This is mt class : ");
		return cls;
	}
	
	public static void main(String[] args) {
		StaticMethodofInterface sm = new StaticMethodofInterface();
		sm.m3("two");
		I3.m3("Sudeep");
		I3 i = new StaticMethodofInterface();
		i.m3();
		I3.m3("Pooja");
	}
}
