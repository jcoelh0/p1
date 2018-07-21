
import java.util.Scanner;

/**
 * Function - Define several functions, and test them.
 * 
 * Nesta classe deve definir novas funções e testá-las na função main.
 * 
 * 
 **/
 
public class Functions {
	public static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		// Testar função sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));
	
		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		//int ano = getIntPos("Ano? ");
		//System.out.printf("ano = %d\n", ano);
                
                System.out.printf("fact(%d) = %d\n", 4, fact(4));
                
                
                System.out.printf("Teste à função getIntPos %d \n", getIntPos());
                
                
                int a = 6;
                int b = 2;
                System.out.printf("getIntRange(6,2) %d \n", getIntRange(a,b));
                
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                
                System.out.printf("printNtimes(3,Ola) \n");
                printNtimes(3, "Ola");
	}
	
	/**
	 * sqr - calcula o quadrado de um número (real).
	 * (A classe Math tem uma função para a raiz quadrada, sqrt,
	 * mas falta-lhe uma para o quadrado: sqr colmata essa lacuna!)
	 **/
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}
	
       
	// Defina as funções pedidas no enunciado:
	public static double f(int n) {
            double resultado;
            resultado = 1/(1 + sqr(n) );
            return resultado;
        }
        
        public static double max(double num1, double num2) {
            double maximo;
            if(num1 > num2) {
                maximo = num1;
            }else {
                maximo = num2;
            }
            
            return maximo;
        }
        
        
        
        public static int max(int num1, int num2) {
            int maximo;
            if(num1 > num2) {
                maximo = num1;
            }else {
                maximo = num2;
            }
            
            return maximo;
        }
        
        public static double poly3(double a, double b, double c, double d, double x) {
            double resultado = a*x*x*x + b*x*x + c*x + d;
            return resultado;
        }
        
        public static int fact(int n) {
            int resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado = resultado * i;
            }
            return resultado;
        }
        
        public static int getIntPos() {
            int numAtual;
            do {
                System.out.println("Insira um número inteiro positivo:");
                numAtual = sc.nextInt();
            }while(numAtual <= 0);
            return numAtual;
        }
        
        public static int getIntRange(int a, int b) {
            if(b < a) {
               int temp = a;
               a = b;
               b = temp;
            }
            
            int numAtual;
            do {
                System.out.println("Insira um número inteiro positivo:");
                numAtual = sc.nextInt();
            }while(numAtual <= a || numAtual >= b);
            return numAtual;
        }
        
        
        public static void printNtimes(int n, String palavra) {
            for (int i = 1; i < n+1; i++) {
                System.out.print(palavra);
            }
        }
}
