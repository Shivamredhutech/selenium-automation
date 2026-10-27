package com.selenium.introduc;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = getData();
		System.out.print(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();

	}
	public static String getData()
	{
		System.out.println("hello world");
		return "Shivam Maddheshiya";
	}
	
	public static String getData2()
	{
		System.out.println("Hello");
		return "Shivam";
	}
}
