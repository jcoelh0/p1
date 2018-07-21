
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jifup
 */
public class ArraysBidimensionais {
    public static Scanner sc = new Scanner(System.in);
    public static void main (String args[]) {
        int[][] m = new int[2][3];
        
        int numLinhas = m.length;
        System.out.println(numLinhas);
        int numColunas = m[0].length;
        System.err.println(numColunas);
        
        lerMatriz(m);
        imprimirMatriz(m);
    }
    
    
    public static void lerMatriz(int m[][]){
        for(int l = 0 ; l < m.length ; l++){
            for(int c = 0 ; c < m[l].length ; c++){
                System.out.print("pos [" + l + "][" + c + "]: ");
                m[l][c] = sc.nextInt();
            }
        }
    }
    
    public static void imprimirMatriz(int m[][]){
        for(int l = 0 ; l < m.length ; l++){
            for(int c = 0 ; c < m[l].length ; c++){
                System.out.printf(" %5d", m[l][c]);
            }
            System.out.println();
        }
    }
}
