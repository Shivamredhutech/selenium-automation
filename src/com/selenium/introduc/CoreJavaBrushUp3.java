package com.selenium.introduc;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is an Object
//		String s1 = "Shiva";
		String s5 = "hello";
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Shivam Maddheshiya Maddheshiya";
		String [] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2].trim());
		
		for (int i = 0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		

	}

}
