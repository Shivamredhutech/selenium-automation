package com.selenium.introduc;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int myNum = 5;
		String name = "Shivam";
		char letter = 'S';
		double dec = 102.33;
		boolean myName = true;
		
		System.out.println("The Number is :" + myNum);
		System.out.println(myName);
		System.out.println(name);
		
		
		// Array-
		int [] arr = new int [5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6};
//		System.out.println(arr2[0]);
		
		// For Loop--::
//		for (int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
		for (int i = 0; i<arr2.length; i++){
			System.out.println(arr2[i]);
//			System.out.println(arr2[i]);
		}
		
		
		String[] name1 = {"shivam","shiv","java","kishan"};
//		for(int i=0; i<name1.length; i++) {
//			System.out.println(name1[i]);
//		}
		
		for(String s:name1) {
			System.out.println(s);
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
