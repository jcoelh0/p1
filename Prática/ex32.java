import java.util.*;
public class ex32 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		
		float d=1;
		int x;
		System.out.println("Introduza uma lista de numeros (terminada com 0):");
		do{
			x = sc.nextInt();
			if(x !=0)
			d=d*x;
		}
		while(x != 0);
		System.out.println("Produto: " + d);
		
	}	
}



