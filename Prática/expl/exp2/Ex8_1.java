
import java.util.Scanner;

public class Ex8_1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insira uma frase");
        
        String frase = sc.nextLine();
        int maiusculas = 0;
        int minusculas = 0;
        int digitos = 0;
        int vogais = 0;
        
        
        for (int i = 0; i < frase.length(); i++) {
            char charActual = frase.charAt(i);
            
            if(Character.isUpperCase(charActual)) {
                maiusculas++;
            }
            
            if(Character.isLowerCase(charActual)) {
                minusculas++;
            }
            
            if(Character.isDigit(charActual)) {
                digitos++;
            }
            
            if(isVowel(charActual)) {
                vogais++;
            }
            
        }
        
        System.out.println("Maiusculas: " + maiusculas);
        System.out.println("Minusculas: " + minusculas);
        System.out.println("Digitos: " + digitos);
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + (maiusculas+minusculas-vogais));
        
    }
    
    public static boolean isVowel(char c) {
        boolean resultado;
        char c2 = Character.toLowerCase(c);
        if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
            resultado = true;
        }else {
            resultado = false;
        }
        
        return resultado;
    }
}
