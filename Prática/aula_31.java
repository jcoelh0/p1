import java.util.*;
public class aula_31 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){	
		int x;
		int n = 0;
		//	do
		//	{
		//	System.out.print("Introduza um numero:");
		//	x = sc.nextInt(); n++
		//	} while(x>=0);
		//	
		//	System.out.println("n="+n);
		//	{
		//	System.out.print("Introduza um numero:");
		//	x = sc.nextInt(); n++
		//	}
		//	
		//	System.out.println("n = "+n);
		for(x = 0;x>=0;)
		{
			System.out.print("Introduza um numero: ");
			x = sc.nextInt(); 
			n++;
		}
		System.out.println("numero de numeros introduzidos= "+n);
	}
}
