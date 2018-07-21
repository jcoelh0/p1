import java.util.*;
public class ex46_retangulo {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		int a,l,i,n=0;
		System.out.print("Altura desejado de 1 a 7:");
		a=sc.nextInt();
		System.out.print("Largura desejada de 1 a 7:");
		l=sc.nextInt();
		//System.out.print("Largura desejada:");
		char lol = '*';
		do{
			for(i=0;i<l;i++){
			System.out.print(lol);	
			}
			System.out.println();
			n++;
		}while(n!=a);
	}
}


