import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which month you were born?");
		String month=scan.nextLine();
		String season;
		
		if ((month .equals("January"))|| (month.equals("February")) || (month.equals("December"))) {
			season="Winter";}
		else if ((month.equals("March"))|| (month.equals("April"))|| (month.equals("May"))) {
			season="Spring";}
		else if ((month.equals("June"))|| (month.equals("July"))||(month.equals("August"))) {
			season="Summer";}
		else{ season="Fall";}
		System.out.println("The season that you were born is "+ season);
		
		
		
	
		
		

	}

}
