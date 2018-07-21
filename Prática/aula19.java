import java.util.*;
public class aula19 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		double x;
		double y;
		double a;
		double b;
		System.out.printf("comprimento do retangulo: ");
		x = sc.nextDouble();
		System.out.printf("largura do retangulo: ");
		y = sc.nextDouble();
		a=2*x+2*y;
		b=x*y;
		System.out.printf("O perimetro do retangulo e: %.5f\n", a);
		System.out.printf("A area do retangulo e: %.5f\n", b);
	}	
}
