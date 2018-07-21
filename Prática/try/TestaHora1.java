import java.util.*;
public class TestaHora1  {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 05;
    
    System.out.print("Começou às ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print("Fim: ");
    printHora(fim);
  }
  
  static class Hora {
	  int h;
	  int m;
	  int s;
	  
  }
  public static Hora lerHora()
  {
	  Scanner sc = new Scanner(System.in);
	  Hora HO = new Hora();
	  System.out.print("Horas: ");
	  HO.h = sc.nextInt();
	  System.out.print("Minutos: ");
	  HO.m = sc.nextInt();
	  System.out.print("Segndos: ");
	  HO.s = sc.nextInt();
	  return HO;
  }
  public static void printHora(Hora HH)
  {
	  System.out.printf(" %2d:%2d:%2d",HH.h,HH.m,HH.s);
  }
  
}
/*
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
*/
