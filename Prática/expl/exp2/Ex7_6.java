
import java.util.Scanner;

public class Ex7_6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Temperaturas[] registos = new Temperaturas[5];
        
        for (int i = 0; i < registos.length; i++) {
            System.out.println("Dia " + (i+1));
            registos[i] = leValores();
        }
        imprimeRegistos(registos);
        imprimeAmplitudeMaxima(registos);
    }
    
    public static Temperaturas leValores() {
        Temperaturas resultado;
        resultado = new Temperaturas();
        
        do {
            System.out.println("Insira o valor da temperatura minima:");
            resultado.tMin = sc.nextDouble();
        }while(resultado.tMin < -20 || resultado.tMin > 50);
        
        do {
            System.out.println("Insira o valor da temperatura maxima:");
            resultado.tMax = sc.nextDouble();
        }while(resultado.tMax < -20 || resultado.tMax > 50 || resultado.tMax < resultado.tMin);
        
        return resultado;
    }
    
    public static void imprimeRegistos(Temperaturas[] registos) {
        for (int i = 0; i < registos.length; i++) {
            System.out.println("Dia " + (i+1));
            System.out.println("Temperatura minima: " + registos[i].tMin);
            System.out.println("Temperatura máxima: " + registos[i].tMax);
            double amplitude = registos[i].tMax - registos[i].tMin;
            System.out.println("Amplitude términa: " + amplitude);
            
        }
    }
    
    public static void imprimeAmplitudeMaxima(Temperaturas[] registos) {
        double maximo = 0;
        int dia = 0;
        for (int i = 0; i < registos.length; i++) {
            double amplitude = registos[i].tMax - registos[i].tMin;
            if(amplitude > maximo) {
                maximo = amplitude;
                dia = i+1;
            }
        }
        System.out.println("A amplitude térmica máxima foi de " + maximo + " e ocorreu no dia " + dia);
    }
}

class Temperaturas {
    double tMin;
    double tMax;
}
