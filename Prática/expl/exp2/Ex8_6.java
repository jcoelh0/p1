import java.util.Scanner;

public class Ex8_6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insira uma frase");
        String frase = sc.nextLine();


        String res = tradutor(frase);
        System.out.println(res);
        
    }
    
    public static String tradutor(String s) {
        String resultado = "";
        
        for (int i = 0; i < s.length(); i++) {
            char charAtual = s.charAt(i);
            
            if(charAtual == 'l') {
                resultado = resultado + 'u';
            }
            
            if(charAtual == 'L') {
                resultado = resultado + 'U';
            }
            
            if(charAtual != 'l' && charAtual != 'L' && charAtual != 'r' && charAtual != 'R') {
                resultado = resultado + charAtual;
            }
                
        }
        
        return resultado;
    }
}
