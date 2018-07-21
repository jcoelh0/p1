//Pretende-se escrever um programa que dados trˆes n´umeros inteiros introduzidos atrav´es
//do teclado imprime no terminal os n´umeros ordenados por ordem crescente.

import java.util.*;
public class aula28 {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
		if(a<b && b<c)
		System.out.println(a+"<"+b+"<"+c);
		else if(b<a && a<c)
		System.out.println(b+"<"+a+"<"+c);
		else if(c<b && b<a)
		System.out.println(c+"<"+b+"<"+a);
		else if(a<c && c<b)
		System.out.println(a+"<"+c+"<"+b);
		else if(c<a && a<b)
		System.out.println(c+"<"+a+"<"+b);
		else if(b<c && c<a)
		System.out.println(b+"<"+c+"<"+a);
	}
}
