import java.util.Scanner;

public class TestaHora {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou às ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
  
  public static void printHora(Hora x) {
      System.out.printf("%2d:%2d:%2d \n",x.h, x.m, x.s);
  }
  
  public static Hora lerHora() {
      Hora resultado;
      resultado = new Hora();
      
      int horas;
      do {
          System.out.println("horas: ");
          horas = sc.nextInt();
      }while(horas < 0 || horas > 23);
      
      int minutos;
      do {
          System.out.println("minutos: ");
          minutos = sc.nextInt();
      }while(minutos < 0 || minutos > 60);
      
      int segundos;
      do {
          System.out.println("segundos: ");
          segundos = sc.nextInt();
      }while(segundos < 0 || segundos > 60);

      resultado.h = horas;
      resultado.m = minutos;
      resultado.s = segundos;

      return resultado;
  }
}

class Hora {
    int h;
    int m;
    int s;
}
/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
