package com.java8.features.revision.methodref;

public class VTestingMethodRef {
	public static String printMsg(String msg) {
		String s = msg.toUpperCase();
		return s;
	}
	public static void main(String[] args) {
		U1 u =VTestingMethodRef::printMsg;
		String msg = u.showMsg("Hello Method Reference");
		System.out.println(msg);
	}
}
