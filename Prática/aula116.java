//Escreva um programa que calcule a despesa m´edia di´aria que um turista despendeu numa
//viagem de quatro dias a Portugal, sabendo que cada dia gastou mais 20% do que no dia
//anterior.

import java.util.*;
public class aula116 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		int dia=1;
		double d,soma=0;
		System.out.println("Despesa do primeiro dia:");
		d=sc.nextInt();
		while(dia<=4){
		d=d+0.2*d;
		soma=soma+d;
		dia++;
	}
		System.out.printf("Despesa media diaria:%.3f", soma/4);
	}	
}
