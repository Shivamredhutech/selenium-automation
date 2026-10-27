package com.selenium.introduc;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {
	public static void main(String[] args) {
	
	int[] arr = {1,2,4,5,6,7,8,9,10,122};
	
	
	// Check if array has multiple of 2.
	for(int i=0; i<arr.length; i++)
	{
		if (arr[i] % 2 == 0)
		{
			System.out.println(arr[i]);
			break;
		}
		else {
			System.out.println(arr[i]+ " is not multiple by 2");
		}
	}
	ArrayList<String> a = new ArrayList<String>();
	a.add("Aman");
	a.add("Mohit");
	a.add("Radhe");
	a.add("Prakhar");
	System.out.println(a.get(0));
	System.out.println(a.get(2));
	
	for (int i = 0; i<a.size(); i++)
	{
		System.out.println(a.get(i));
	}
	System.out.println("***********");
	System.out.println("___________________________");
	
	for (String val : a) {
		System.out.println(val);
	}
	
	// Create object of the class - object.method

}
}
