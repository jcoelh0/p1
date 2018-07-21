/*Escreva um programa que permita manipular os valores de temperatura de uma estac˜ao
meteorologica numa serie de 5 dias consecutivos. O programa devera ler os valores da
temperatura mınima (tMin) e da temperatura maxima (tMax) de cada dia e calcular a
amplitude termica correspondente (tMax - tMin).
Utilize uma estrutura de dados para armazenar a informac˜ao das temperaturas de um dia, 
bem como a sua amplitude termica.
No final, o programa desenvolvido deve indicar a amplitude termica maxima e o dia
em que ocorreu */

import java.util.*;
public class ex76 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		Temperaturas[] registos = new Temperaturas[5];
	
		for(int i=0;i<5;i++){
			System.out.println("Dia " + (i+1));
			registos[i] = leregistos();
		}
		escreveregistos(registos);
		escreveamplitude(registos);
	}

	public static Temperaturas leregistos() {
		Temperaturas resultado = new Temperaturas();
	
		do{
			System.out.println("Introduza a temperatura minima (entre -20 e 50):");
			resultado.tMin = sc.nextDouble();
		}while(resultado.tMin<-20 || resultado.tMin>50);
		
		do{
			System.out.println("Introduza a temperatura maxima (entre -20 e 50):");
			resultado.tMax = sc.nextDouble();
			
		}while(resultado.tMax<-20 || resultado.tMax>50 || resultado.tMin>resultado.tMax);
		return resultado;
	}

	public static void escreveregistos(Temperaturas[] registos) {
	
		for(int i=0;i<registos.length;i++){
			System.out.println("Dia " + (i+1));
			System.out.println("Temperatura minima:" + registos[i].tMin);
			System.out.println("Temperatura maxima:" + registos[i].tMax);
			//double amplitude = registos[i].tMax-registos[i].tMin;
			System.out.println("Amplitude termica: " + (registos[i].tMax-registos[i].tMin));
			//return amplitude;
		}
	}
	
	public static void escreveamplitude(Temperaturas[] registos) {
		int dia=0;
		double amplitudeMax=-20;
		for(int i=0;i<registos.length;i++){
			double amplitude = registos[i].tMax - registos[i].tMin;
			if(amplitude > amplitudeMax){
				amplitudeMax = amplitude;
				dia = i+1;
			}	
		}
		System.out.println("\nA amplitude termica maxima foi " + amplitudeMax + " e ocorreu no dia " + dia);
	}
}

class Temperaturas {
	double tMin;
	double tMax;
}
