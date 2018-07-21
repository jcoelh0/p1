/*O ´Indice de Massa Corporal (IMC) ´e um dos crit´erios utilizados para detetar problemas
de obesidade nos humanos. 
* 
Construa um programa para o c´alculo do IMC, tendo em conta que a idade inserida pelo
utilizador n˜ao deve ser inferior a 18 anos e o programa n˜ao deve aceitar entradas sem sentido
(exemplo pesos e alturas negativas, sexo diferente de M/F, etc.). Deve implementar uma
fun¸c˜ao para leitura dos dados, outra para o c´alculo do IMC e uma para a impress˜ao do
relat´orio, tal como apresentado de seguida.*/

import java.util.*;
public class ex810 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Calculo do (IMC) Indice de Massa Corporal");
		System.out.println("Preencha os seguintes dados");
		
		individuo i1 = sujeito();
		double imc = calcularIMC(i1);
		relatorio(i1,imc);
	}
	
	public static individuo sujeito(){
		individuo sujeito = new individuo();
		
		System.out.print("Nome (ate 29 caracteres):");
		sujeito.nome = sc.nextLine();
		
		do{
			System.out.print("Idade:");
			sujeito.idade = sc.nextInt();
		}while(sujeito.idade<18);
		
		do{	
			System.out.print("Sexo:");
			sujeito.sexo = sc.next().charAt(0);
		}while(sujeito.sexo != 'M' && sujeito.sexo != 'm' && sujeito.sexo != 'F' && sujeito.sexo != 'f');
		
		do{	
			System.out.print("Peso:");
			sujeito.peso = sc.nextDouble();
		}while(sujeito.peso<20);
		
		do{	
			System.out.print("Altura:");
			sujeito.altura = sc.nextDouble();
		}while(sujeito.altura<0);
		
		return sujeito;
	}
	
	public static double calcularIMC(individuo sujeito){
		//individuo sujeito = new sujeito();
		double imc = 0;
		imc = sujeito.peso/Math.pow(sujeito.altura,2);
		System.out.println("Imc = "+imc);
		return imc;
	}
	
	public static void relatorio(individuo sujeito, double imc){
		System.out.println("|-------------------------------------|");
		System.out.println("| Calculo do Indice de Massa Corporal |");
		System.out.println("|-------------------------------------|");
		System.out.printf("| Nome: %-29s |\n", sujeito.nome);
		if(sujeito.sexo == 'm' || sujeito.sexo == 'M'){
			System.out.printf("| Sexo: Masculino                     |\n");
		}
		else{
			System.out.printf("| Sexo: Feminino                      |\n");
		}
		System.out.printf("| IMC : %2.1f (kg/m2)                  |\n", imc);
		if(imc<18.5){
			System.out.printf("| Comentario: Abaixo do peso          |\n");
		}
		else if(imc>=18.6 && imc<=24.9){
			System.out.printf("| Comentario: Saudavel                |\n");
		}
		else if(imc>=25.0 && imc<=29.9){
			System.out.printf("| Comentario: Peso em excesso         |\n");
		}
		else if(imc>=30.0 && imc<=34.9){
			System.out.printf("| Comentario: Obesidade Grau I        |\n");
		}
		else if(imc>=35.0 && imc<=39.9){
			System.out.printf("| Comentario: Obesidade Grau II       |\n");
		}
		else{
			System.out.printf("| Comentario: Obesidade Grau III      |\n");
		}

		System.out.print("|-------------------------------------|");
		
			
	}
}

class individuo {
	String nome;
	int idade;
	char sexo;
	double peso;
	double altura;
}
