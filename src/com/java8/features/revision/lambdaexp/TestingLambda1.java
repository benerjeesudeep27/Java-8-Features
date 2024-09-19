package com.java8.features.revision.lambdaexp;

public class TestingLambda1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(1500);
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Executing Runnable Interface");
			}
		});
		th.start();
	}
}


//Writing the above code using Lambda Exp
class LambdaExp{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiting...");
		Thread.sleep(2000);
		Runnable r = ()->{System.out.println("Executing Runnable Interface");};
		r.run();
	}
}