import java.util.Scanner;

public class Testes_Strings {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "abc 123bbbbbb";
        String s2 = "abc 123bbbbbb";
        //String s;
        //s = new String("abc 123")
        
        int[] numeros = { 1 , 5 , 8 , 10 };
        
        if(s.equals(s2)) {
            System.out.println("são iguais");
        }else {
            System.out.println("são diferentes");
        }
        
        //double num = 16.0;
        //Math.sqrt(num);
        
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            
            //if(tmp.isLetter()) {
            if(Character.isLetter(tmp)) {
                System.out.println(tmp);
            }
        }
        
        
        String teclado = sc.nextLine();
        
        System.out.println(teclado.charAt(0));
    }
}
