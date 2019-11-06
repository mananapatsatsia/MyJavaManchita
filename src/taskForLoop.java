
public class taskForLoop {

	public static void main(String[] args) {
		for(int a=5; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
       
		
		for(int c=1; c<=5; c++) {
			for(int f=1; f<=c; f++) {
				System.out.println("* ");
			}
			System.out.println("    ");
		}
		for(int i=5; i>=0; i--) {
			for(int j=1; j<=1; j++) {
				System.out.println("* ");
			}
			System.out.println("  ");
		}
	}

}
