package com.practice;

public class B {
	private int id;
	private String name;
	public B(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	B(){
		
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		B a=new B(1,"B");
		System.out.println(a.getId());
		System.out.println(a.name);
		a.setName("BHUshan");
		System.out.println(a.name);
	}
	
	
}
