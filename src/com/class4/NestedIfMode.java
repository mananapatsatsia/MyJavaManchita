package com.class4;

public class NestedIfMode {

	public static void main(String[] args) {
		/*int age=15;
		if (age<16) {System.out.println("You are too young to drive");
		
		}else {System.out.println("You are eligible to drive");
		if (age>=18) {System.out.println("You can drive alone");}
		else {System.out.println("You need your parents to drive");}
		}*/
		
		boolean quize=false;
		int score=89;
		if(quize) {System.out.println("Good job");
		if (score>=90) {System.out.println("You got an A");
			
		}else if (score>80) {System.out.println("You got a B");
	}else { System.out.println("You should study more");}
		
		}else {System.out.println("Not good");}
		}
	}


