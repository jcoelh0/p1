import java.util.*;
public class ex64 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		System.out.print("Introduza as suas notas dos testes(introduza um numero negativo para parar):\n");
		int a[] = new int[50];
		for(int i=0;i<=a.length;i++){
			a[i]=(int)sc.nextInt();
			if(a[i]<0) break;
			if(a[i]<0 || a[i]>20){
				System.out.print("Introduziu um valor errado!\n");
				break;
			}
		}
		
		System.out.print("  Histograma de notas\n");
		System.out.println("-------------------------------------------------------");
		
		char lol = '*';
		
			for(int b=20;b>=0;b--){
				System.out.print(b + " | ");
				for(int i=0;a[i]>0;i++){
					if(a[i] == b){
					System.out.print(lol);
					
					}
				}
				System.out.printf("\n");
				if(b<11 && b>0){
					System.out.print("0");
				}	
			}			
	}
}
