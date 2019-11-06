
public class NestedLoop {

	public static void main(String[] args) {
		
		/*for(int i=0;i<=5; i++) {
			System.out.println("I am outer loop " +i);
			
			for(int j=0;j<=5;j++) {
				System.out.println("I am inner loop");*/
			
		
		/*for(int i=0;i<=5; i++) {
				
			for(int j=0;j<=5;j++) {
				System.out.println(i+ "  "+j);}*/
		
		for(int h=0;h<24; h++) {
			
			for(int m=0;m<60;m++) {
				if(m==0&& m<10) {
					System.out.println(h+ " : "+m);
				}
				for(int s=0;s<60;s++)
				System.out.println(h+ " : "+m +" :"+s);}
			}

	}

}
