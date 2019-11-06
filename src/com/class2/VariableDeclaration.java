package com.class2;

public class VariableDeclaration {
	public static void main(String[] args) {
		//1.declaring variable num1 will hold value of int and
		//assigning/initializing value of 123 to it
		int num1=123;
		int num2=6767;
		long num3=1416435184;
		char num4='A';
		
		//2. declare variable first and then assign value
		int n1;
		int n2;
		int n3;
		n1=5;
		n2=7676;
		n3=155;
		
		//3.declare all variable together and then assign value
		int number1, number2, number3;
		number1=12;
		number2=135;number3=282;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(num3);
		System.out.println(num4);
		
		number1=number2;
		System.out.println(number1);
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain; 
		System.out.println(isSnow);
		
		isSnow=true;
		System.out.println(isSnow);
		
		
				
	}

}
