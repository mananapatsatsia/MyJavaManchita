import java.util.Scanner;

public class tasc1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your score");
		int score=sc.nextInt();
		
		if( score>=90) { System.out.println("Your grade is A");}
		else if(score>=70 && score<90) {System.out.println("Your grade is B");}
		else if(score>=50  && score<70) {System.out.println(" Your grade is C");}
		else if( score <50) {System.out.println("Your grade is F");}
		else {System.out.println("Your grade is 0");}
		
		
		

	}

}
