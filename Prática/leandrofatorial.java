import java.util.Scanner; 
public class leandrofatorial {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int fact=1;
		for (int i=1; i<=10; i++){
			fact = fact * i;
			System.out.printf("%d! = %d \n", i, fact);
		}
	}
}
