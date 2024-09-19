package com.java8.features.revision.functionalinterface;

public class ShowMsg implements Sayable{

	public static void main(String[] args) {
		//First way :-
		Sayable say = new ShowMsg();
		String msg = say.showMsg("Hello, I am a functional interface");
		System.out.println(msg);
		
		System.out.println("---------------------------");
		//Second way :-
		ShowMsg  show = new ShowMsg();
		System.out.println(show.showMsg("Hello, I am a functional interface"));
	}

	@Override
	public String showMsg(String msg) {
//		String str = msg.toUpperCase();
		return msg;
	}

}
