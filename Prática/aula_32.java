import java.util.*;
public class aula_32 {
	static Scanner sc = new Scanner(System.in);	
	public static void main(String[] args)
	{
		double x;
		double p=0;
		
		do
		{
		System.out.print("Introduza um numero real: ");
		x = sc.nextDouble();
		if ((x != 0) && (p == 0)) p = 1;
		if (x != 0) p *= x;
		} while(x != 0);
		if(p == 0) System.out.println(" so um zero");
		else System.out.println(" Produto = " + p);
	}
}
