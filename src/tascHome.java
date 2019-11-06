import java.util.Scanner;

public class tascHome {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Is there a sale going on? True or False");
		boolean sale=inp.hasNextBoolean();
		double price;
		double discount;
		double finalPrice;
		
		
		if (!sale) {System.out.println("I am not shoping");
		} else {
			System.out.println("What is the actual price?");
			price=inp.nextDouble();}
		
			
			
		}
		

	}


