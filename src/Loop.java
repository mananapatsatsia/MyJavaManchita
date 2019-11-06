
public class Loop {

	public static void main(String[] args) {
		/*
		 * int i = 50;
		 * 
		 * while (i>=10) { System.out.println(i+ " "); i--; }
		 * System.out.println("___________________________________"); // print only even
		 * number
		 * 
		 * int a = 0; while (a<=20) { System.out.println(a); a+=2; }
		 * System.out.println("________________________");
		 */
		int b = 51;

		while (b < 101) {
			System.out.print(b + ",");
			b += 2;
		}
		System.out.println("--------------------------------------------");
		
		int y = 100;
		while (y>1) {
			System.out.print(y+",");
			y-=2;
		}
		/*for(int h=0;h<24; h++) {
		
		for(int m=0;m<60;m++) {
			if(m==0&& m<10) {
				System.out.println(h+ " : 0 "+m);
			}
			for(int s=0;s<60;s++)
			System.out.println(h+ " : "+m +" :"+s);}*/
	
/*for(int h=0;h<24; h++) {
		
		for(int m=0;m<60;m++) {
			if( m<10) {
				System.out.println(h+ " : 0 "+m);
			}else {System.out.println(h+ " : "+m);}*/

	}
}

