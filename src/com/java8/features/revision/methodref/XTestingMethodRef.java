package com.java8.features.revision.methodref;

public class XTestingMethodRef {
	public String showMsg(String msg) {
		String s = msg.toLowerCase();
		return s;
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Instance Method Reference");
		XTestingMethodRef xref = new XTestingMethodRef();
		Thread.sleep(1500);
		X1 v = xref:: showMsg;
		String res = v.printMsg("HELLO SUDEEP BANERJEE");
		System.out.println(res);
	}
}
