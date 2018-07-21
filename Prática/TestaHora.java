import java.util.*;
public class TestaHora {
			static final Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
	Hora inicio;		Hora fim;
	inicio = lerHora();
	System.out.print("Comecou as ");		printHora(inicio);
	System.out.println("Quando termina?");
	fim = lerHora();
	System.out.print("Início:");			printHora(inicio);
	System.out.print("Fim:");				printHora(fim);
	}
	
	public static void printHora(Hora ob){ System.out.printf("\t\t%02d:%02d:%02d.\n",ob.h,ob.m,ob.s); }
	public static Hora lerHora() 
	{ int h,m,s;
		do  {	System.out.print("horas?");
				h = sc.nextInt();
			} while(h<0 || h >=24);
		do {	System.out.print("minutos ? ");
				m = sc.nextInt();
			} while(m<0 || m>=60);
		do {	System.out.print("segundos ?");
				s = sc.nextInt();
			} while(s<0 || s>=60);
		return new Hora(h,m,s);
	}
}
class Hora 
{ 
	Hora(int hh,int mm,int ss){ h=hh;m=mm;s=ss; }
	int h,m,s;
}

