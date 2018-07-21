
import java.util.Scanner;
import javax.naming.spi.DirStateFactory;

public class Ex8_10 {
    public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            Individuo i1 = leIndividuo();
            
            imprimeRelatorio(i1);
    }    
        
    public static Individuo leIndividuo() {
        Individuo resultado;
        resultado = new Individuo();
        
        System.out.println("Nome: ");
        resultado.nome = sc.nextLine();
        
        do {
            System.out.println("Idade: ");
            resultado.idade = sc.nextInt();
        }while(resultado.idade < 18);
        
        sc.nextLine();
        
        do {
            System.out.println("Sexo: ");
            resultado.sexo = sc.nextLine();
        }while(resultado.sexo.equals("M") && resultado.sexo.equals("F"));
        
        do {
            System.out.println("Peso: ");
            resultado.peso = sc.nextDouble();
        }while(resultado.peso <= 0);
        
        
        do {
            System.out.println("Altura: ");
            resultado.altura = sc.nextDouble();
        }while(resultado.altura <= 0);
        
        
        
        return resultado;
    }
    
    public static double calculaIMC(Individuo individuo) {
        double resultado;
        
        resultado = individuo.peso/(Math.pow(individuo.altura,2));
        
        return resultado;
    }
    
    public static void imprimeRelatorio(Individuo individuo) {
        System.out.println("Calculo do indice de massa corporal: ");
        
        System.out.println("Nome: " + individuo.nome);
        
        if(individuo.sexo.equals("M")) {
            System.out.println("Sexo: Masculino");
        }else {
            System.out.println("Sexo: Feminino");
        }
        
        System.out.println("IMC: " + calculaIMC(individuo));
    }
}

class Individuo {
    String nome;
    int idade;
    String sexo;
    double peso;
    double altura;
}
