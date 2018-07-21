import java.util.*;
public class tabuadaDoQueQuisermos {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		
		int x,i;
		System.out.println("Quero a tabuada de: (escolha de 1 a 99)");
		x = sc.nextInt();
		if(x>99 || x<1){
			System.out.println("Introduziu um valor errado. Quero a tabuada de: (escolha de 1 a 99");
		}
		System.out.println("Tabuada de "+x);
		for(i=1;i<11;i++){
			System.out.println(x +" x " +i+ " = "+x*i);
		}
			
	}
}
