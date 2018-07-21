//~ Esta¸c~ao meteorol´ogica:
//~ 1 - Ler ficheiro de dados
//~ 2 - Acrescentar medida
//~ 3 - Listar valores de temperatura e humidade
//~ 4 - Listar medidas ordenadas por valor de temperatura
//~ 5 - Listar medidas ordenadas por valor de humidade
//~ 6 - Calcular valores m´edios de temperatura e humidade
//~ 7 - Calcular valores m´aximos e m´ınimos de temperatura e humidade
//~ 8 - Calcular histograma das temperaturas e humidade
//~ 9 - Terminar o programa
//~ Op¸c~ao ->
import java.util.*;
import java.io.*;
public class prob12_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		int k=-1;
		meteo[] met = new meteo[31];
		int cont=0;
		do{
			k = menu();	
			
			switch(k){
				case 1:
					cont = lerficheiro(met,cont);
					break;
				
				case 2:
					cont = acrescentar(cont, met);
					break;
				
				case 3:
					listarValores(met,cont);
					break;
				case 4:
					MostrarOrdernadaPelasTemp(met,cont);
					break;
				case 5:
					MostrarOrdernadaPelaHum(met,cont);
					break;
				case 6:
					calcularMedia(met,cont);
					break;
				case 7:
					calcularMaximos(met,cont);
					break;
				case 8:
					histograma(met, cont);
					break;				
				default: 
					break;
			}
		}while(k != 9);
		
		
	}
	
	public static int menu(){
		
		System.out.println("Estacao meteorologica:");
		System.out.println("1 - Ler ficheiro de dados");
		System.out.println("2 - Acrescentar medida");
		System.out.println("3 - Listar valores de temperatura e humidade");
		System.out.println("4 - Listar medidas ordenadas por valor de temperatura");
		System.out.println("5 - Listar medidas ordenadas por valor de humidade");
		System.out.println("6 - Calcular valores medios de temperatura e humidade");
		System.out.println("7 - Calcular valores maximos e minimos de temperatura e humidade");
		System.out.println("8 - Calcular histograma das temperaturas e humidade");
		System.out.println("9 - Terminar o programa");
		System.out.print("Opcao ->");
		int k = sc.nextInt();
		sc.nextLine();
		return k;
	}
	
	public static int lerficheiro(meteo[] met,int cont) throws IOException{
		boolean doc = false;
		File fin;
		do{	
			System.out.println("Qual o nome do ficheiro a ler?");
			String s = sc.nextLine();
			fin = new File(s);
			if(!fin.exists()){
				System.out.println("O ficheiro nao existe no diretorio.");
			}
			else if(fin.isDirectory()){
				System.out.println("E um diretorio, escolha um ficheiro.");
			}
			else if(!fin.canRead()){
				System.out.println("O ficheiro nao pode ser lido.");
			}
			else{
				doc = true;
			}
		}while(!doc);
		Scanner f = new Scanner(fin);
		while(f.hasNextLine()){
			met[cont] = new meteo();
			met[cont].temp = f.nextInt();
			met[cont].hum = f.nextInt();
			f.nextLine();
			cont++;
		}
		
		return cont;
	}
	
	public static int acrescentar(int cont, meteo met[]) throws IOException{
		met[cont] = new meteo();	
		do{
			//met[cont] = new meteo();
			System.out.print("Insira o valor da temperatura:");
			met[cont].temp = sc.nextInt();
			if(met[cont].temp<-10 || met[cont].temp>40){
				System.out.println("Erro. Introduza o valor entre -10 e 40");
			}
		}while(met[cont-1].temp<-10 || met[cont-1].temp>40);
		
		do{
			//met[cont] = new meteo();
			System.out.print("Insira o valor da humidade:");
			met[cont].hum = sc.nextInt();
			if(met[cont].hum<0 || met[cont].hum>100){
				System.out.println("Erro. Introduza o valor entre 0 e 100");
			}
			else{
				cont++;
			}
		}while(met[cont-1].hum<0 || met[cont-1].hum>100);
		return cont;
	}
	
	public static void listarValores(meteo[] met, int cont){
		for(int i=0;i<cont;i++){
			System.out.println("Temperatura: "+met[i].temp+" Humidade: "+met[i].hum);
		}
	}
	
	public static void histograma(meteo[] met, int cont){
		System.out.println("Histograma da temperatura");
		System.out.println("------------------------");
		for(int i=-10;i<41;i++){
			System.out.printf("%3d | ",i);
			for(int a=0;a<cont;a++){
				if(met[a].temp == i){
					System.out.printf("*");
				}
			}
			System.out.println();
		}
		
	}
	public static void MostrarOrdernadaPelasTemp(meteo[] met, int cont){
		System.out.println("Todas as medidas ordenadas de forma crescente pela temperatura:");
		// 0 3 1 4
		for(int i=0;i < cont-1;i++){
			
			for(int j=i+1;j < cont;j++){
				if(met[i].temp > met[j].temp){
					meteo temporario = met[i];
					met[i] = met[j];
					met[j] = temporario;
					
				}
			}
		System.out.println("Temperatura: "+met[i].temp+" Humidade: "+met[i].hum);	
		}
		
	}
	
	public static void MostrarOrdernadaPelaHum(meteo[] met, int cont){
		System.out.println("Todas as medidas ordenadas de forma decrescente pela humidade:");
		// 0 3 1 4
		for(int i=0;i < cont-1;i++){
			
			for(int j=i+1;j < cont;j++){
				if(met[i].hum > met[j].hum){
					meteo temporario = met[i];
					met[i] = met[j];
					met[j] = temporario;
					
				}
			}
		System.out.println("Temperatura: "+met[i].temp+" Humidade: "+met[i].hum);	
		}
		
	}
	
	public static void calcularMedia(meteo[] met, int cont){
		meteo media = new meteo();
		double mediaHum = 0;
		double mediaTemp = 0;
		for(int i=0;i < cont;i++){
			mediaTemp = met[i].temp + mediaTemp;
			mediaHum = met[i].hum + mediaHum;
			
		}
		mediaHum=mediaHum/cont;
		mediaTemp=mediaTemp/cont;
		System.out.println("Media da temperatura:" + mediaTemp + " Media da humidade: " + mediaHum);
	}
	
	public static void calcularMaximos(meteo[] met, int cont){
		meteo max = new meteo();
		max.temp = 0;
		max.hum = 0;
		for(int i=0;i < cont-1;i++){
			if(met[i].temp > max.temp){
				max.temp = met[i].temp;
			}
			if(met[i].hum > max.hum){
				max.hum = met[i].hum;
			}
		}
		System.out.println("O maximo das temperaturas e:" + max.temp + " e o das humidades e: " + max.hum);
	}		
}


class meteo{
	int temp;
	int hum;
}
