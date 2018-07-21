import java.util.*;
public class ex62 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		
		int a[]= new int[100];
		System.out.println("Introduza valores inteiros positivos (para se introduzir 0):");
		
		for(int i=0;i<=a.length;i++){
			a[i] = sc.nextInt();
			if(a[i]<=0) break;
		}
		System.out.println("Agora diga o numero que quer saber quantas vezes apareceu");
		int x =sc.nextInt();
		int n=0;
		for(int i=0;a[i]!=0;i++){
			if(a[i] == x){
				n++;
			}
			
		}
		System.out.println("Introduziu o numero " + x + " " + n + " vezes");
	
	}
}
