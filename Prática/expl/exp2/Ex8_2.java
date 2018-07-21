import java.util.Scanner;

public class Ex8_2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String testes = "Organização 123 das Nações Unidas";
        System.out.println(testes);
        String res = acronimo(testes);
        
        System.out.println(res);
        
    }
    
    public static String acronimo(String s) {
        String resultado = "";
        
        String[] palavras = s.split(" ");
        
        for (int i = 0; i < palavras.length; i++) {
            String palavraAtual = palavras[i];
            char primeiraLetra = palavraAtual.charAt(0);
            
            if(Character.isUpperCase(primeiraLetra)) {
                resultado = resultado + primeiraLetra;
            }
        }
        
        System.out.println("Número de palavras = " + palavras.length);
        return resultado;
    }
}
