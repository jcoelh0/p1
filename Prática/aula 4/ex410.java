/*Escreva um programa que leia do teclado um numero inteiro positivo e imprima uma
mensagem que indique se o numero introduzido e um numero perfeito. Um numero natural
e um numero perfeito quando e igual a soma de todos os seus divisores proprios (menores
que o numero). Por exemplo, 6 = 1+2+3 e o primeiro numero perfeito. Tenha em atenc˜ao
a validac˜ao do valor de entrada.*/

import java.util.*;
public class ex410 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int a,i;
	System.out.print("Introduza um numero inteiro positivo:");
	a = sc.nextInt();
	for(i=1;i<a;i++){
	if(a%i==0) {
		a==i
		
		System.out.print(a +"e um numero perfeito!");
	}
	}
	else{ 
		System.out.print("Este numero nao e perfeito!"); 
	}
	
	
	
	}
}
