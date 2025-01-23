package com.demo;

public class Test {

	int x=10;
	int y=20;
	
	public int sum() {
		int c=x+y;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		int x=t.sum();
		System.out.println(x);
	}
}
