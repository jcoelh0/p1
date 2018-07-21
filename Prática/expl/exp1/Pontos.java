import java.util.Scanner;

public class Pontos {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
      //Ponto2D pontoTestes;
      //pontoTestes = lePonto();
      
      //Ponto2D pontoTestes2;
      //pontoTestes2 = lePonto();
      
      
      //escrevePonto(pontoTestes);
  
      //double distancia;
      //distancia = calculaDistancia(pontoTestes, pontoTestes2);
      //System.out.println("Distancia = " + distancia);
      
      Ponto2D origem;
      origem = new Ponto2D();
      origem.x = 0;
      origem.y = 0;
      
      Ponto2D pontoAtual;
      pontoAtual = new Ponto2D();
      int pontosIntroduzidos = -1;
      double somaDistanciasOrigem = 0;
      double maximoDistancias = 0;
      
      Ponto2D pontoDistanciaMaxima;
      pontoDistanciaMaxima = new Ponto2D();
      
      do {
          pontoAtual = lePonto();
          pontosIntroduzidos++;
          double distanciaOrigem = calculaDistancia(pontoAtual, origem);
          somaDistanciasOrigem = somaDistanciasOrigem + distanciaOrigem;
          if(distanciaOrigem > maximoDistancias) {
              maximoDistancias = distanciaOrigem;
              pontoDistanciaMaxima = pontoAtual;
          }
      }while(pontoAtual.x != 0 || pontoAtual.y != 0);
      
      System.out.println("A soma das distâncias dos 4 pontos à origem é " + somaDistanciasOrigem);
      System.out.println("O ponto mais afastado da origem foi");
      escrevePonto(pontoDistanciaMaxima);
      
      
      
  }
  
  public static Ponto2D lePonto() {
      Ponto2D resultado;
      resultado = new Ponto2D();
      
      System.out.println("x:");
      resultado.x = sc.nextInt();
      
      System.out.println("y:");
      resultado.y = sc.nextInt();
      
      return resultado;
  }
  
  public static double calculaDistancia(Ponto2D p1, Ponto2D p2) {
      double resultado;
      resultado = Math.sqrt( (p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y)    );
      
      return resultado;
  }
  public static void escrevePonto(Ponto2D p) {
      System.out.printf("(%2.1f,%2.1f) \n", p.x, p.y);
  }
}

class Ponto2D {
    double x;
    double y;
}
