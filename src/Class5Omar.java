import java.util.Scanner;

public class Class5Omar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int n1=sc.nextInt();
	
	if(n1>=1 && n1<=5) {
		System.out.println(" It is a weekday");}
	else if(n1>5 && n1<=7 ) {
		System.out.println("It is a weekend");}
	else { System.out.println("Invalid day");
	}
		
		
		
		
		

	}

}
