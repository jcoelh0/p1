/*Pretende-se escrever um programa que leia do teclado uma sequencia de n´umeros inteiros
positivos e que permita detetar um conjunto de caracter´ısticas acerca da sequˆencia. A cada
opera¸c˜ao dever´a corresponder uma fun¸c˜ao. A leitura da sequˆencia termina quando aparecer
o n´umero zero como indicador de paragem ou quando tiverem sido lidos 50 n´umeros. A
intera¸c˜ao com o programa dever´a ser feita atrav´es de um menu, tal como apresentado de
seguida:
An´alise de uma sequ^encia de n´umeros inteiros
1 - Ler a sequ^encia
2 - Escrever a sequ^encia
3 - Calcular o m´aximo da sequ^encia
4 - Calcular o m´ınimo da sequ^encia
5 - Calcular a m´edia da sequ^encia
6 - Detetar se ´e uma sequ^encia s´o constitu´ıda por n´umeros pares
10 - Terminar o programa
Op¸c~ao -> */ 

import java.util.*;
public class ex63 {
	static Scanner sc = new Scanner(System.in);
	

	
	
	static int arr[] = new int[50]; 

	public static void main(String args[]) {
		int n=-1;
		//inic(arr);
		int z;
		do{
		System.out.println("--------------------------------------");
		System.out.println("1 - Ler a sequencia");
		System.out.println("2 - Escrever a sequencia");
		System.out.println("3 - Calcular o maximo da sequencia");
		System.out.println("4 - Calcular o minimo da sequencia");
		System.out.println("5 - Calcular a media da sequencia");
		System.out.println("6 - Detetar se e uma sequencia so constituida por numeros pares");
		System.out.println("10 - Terminar o programa");
		System.out.print("Escolha uma opcao:");
		
		z=sc.nextInt();
		switch(z)
		{
			case 1:
				n = inic(arr);
				break;
			case 2:
				lerseq(arr,n);
				break;
			case 3:
				max(arr,n);
				break;
			case 4:
				min(arr,n);
				break;
			case 5:
				media(arr,n);
				break;
			case 6:
				pares(arr,n);
				break;
			case 10:
				System.out.println("Ate a proxima ;)");
				System.exit(1);
			default:
				System.out.println("Erro. Introduza outra opcao.");
				break;
		}
		}while(z != 10);
	}

	 public static int inic(int[] arr){
		
		System.out.println("Introduza uma sequencia de numeros(0 para parar):");
		int n,x=1;
		for(n=0;n<51;n++)
			if(x !=0){
				x = sc.nextInt();
				arr[n] = x;
			}
			else{break;}
		return n-1;
	}

	public static void lerseq(int[] arr,int n) {
		for(int i=0; i < n ;i++)
			System.out.println("[" + i + "]=" + arr[i]);
	}
	
	
	public static void max(int[] arr,int n){
		int max=0;
		max=arr[0];
		for(int i=0; i < n ;i++){
			if(max < arr[i]){
				max=arr[i];
			}
		}
		System.out.println("O maximo e " + max);
	}

	public static void min(int[] arr,int n){
		int min=0;
		min=arr[0];
		for(int i=0;i < n;i++){
			if(arr[i] < min){
				min=arr[i];
			}
		}
		System.out.println("O minimo e " + min);
	}

	public static void media(int[] arr,int n){
		double med=0;
		for(int i=0;i < n;i++){
			med = med + arr[i];
		}
		double media = med/n;
		
		System.out.println("A media e " + media);
	}

	public static void pares(int[] arr,int n){
		int lol=0;
		for(int i=0;i < n;i++){
			if(arr[i] % 2 == 0){
				lol++;
			}
		}
		if(lol==n){
			System.out.println("A sequencia e constituida apenas por numeros pares");
		}
		else{
			System.out.println("A sequencia nao e constituida apenas por numeros pares");
		}
	}
}

