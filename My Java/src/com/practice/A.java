package com.practice;

public class A {
	static int i=10;
	int j=11;
	{
		int i=100;
		System.out.println("from NSIB of A");
	}
	static {
		System.out.println("From SIB of A");
	}
	A(){
		System.out.println("From Constructor of A");
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		A a=new A();
		System.out.println(a.i);
		System.out.println(A.i);
		System.out.println(a.i);
		A b=new A();
		System.out.println("End"); 
	}

}
