package com.manish.java8;

public class RunnableLamda {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnableLamda = () -> {
			for(int i=1; i<4; i++){
				System.out.println(Thread.currentThread().getName());
				
			}
		};
		
		Thread t = new Thread(runnableLamda);
		t.start();
		t.join();

	}

}
