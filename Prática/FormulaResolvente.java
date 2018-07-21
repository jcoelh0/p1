//Pretende-se escrever um programa para calcular as ra´ızes de uma equa¸c˜ao de 2o grau do
//tipo Ax2 + Bx + C = 0, sendo os valores de A, B e C introduzidos pelo teclado. Tenha em
//aten¸c˜ao a possibilidade das solu¸c˜oes serem reais ou imagin´arias.

import java.util.*;
public class FormulaResolvente {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	{
		int a,b,c,d;
		double r,R,i;
		System.out.println("Ax2 + Bx + C = 0");
		System.out.print("A:");
		a=sc.nextInt();
		System.out.print("B:");
		b=sc.nextInt();
		System.out.print("C:");
		c=sc.nextInt();
		//i = Math.sqrt(-1);
		d=b*b-4*a*c;
		//Math.pow(i , 2)=-1;
		r = (-b+Math.sqrt(d))/2*a;
		R = (-b-Math.sqrt(d))/2*a;

		if( d<0){
			r = ((-b+Math.sqrt(-d))/2*a);
			R = (-b-Math.sqrt(-d))/2*a;
			System.out.printf("x:%.3fi ou x:%.3fi\n",r, R);
		}
		else {
		System.out.printf("x:%.3f ou x:%.3f\n",r, R);
		}
	}
	}
}
