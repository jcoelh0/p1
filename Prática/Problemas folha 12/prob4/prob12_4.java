import java.util.*;
import java.io.*;
	public class prob12_4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		int op = -1;
		int cont = 0;
		aluno alunos[] = new aluno[1000];
		for(int i=0;i<1000;i++){
			alunos[i]=new aluno();
		}
		
		do{
			System.out.println("Servicos Academicos - Gestao de uma pauta:");
			System.out.println("1 - Ler ficheiro com numeros mec. e pedir informacao de notas");			
			System.out.println("2 - Imprimir no terminal a informacao da disciplina");
			System.out.println("3 - Calcular estatisticas das notas finais");
			System.out.println("4 - Alterar as notas de um aluno");
			System.out.println("5 - Imprimir um histograma de notas");
			System.out.println("6 - Gravar num ficheiro a informacao da disciplina (ordenada)");
			System.out.println("7- Terminar o programa");
			System.out.print("Opcao ->");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op){
				case 1:
					cont = lerficheiro(alunos,cont);
					break;
				case 2:
					informacao(alunos,cont);
					break;
				case 3:
					calcular(alunos,cont);
					break;
				case 4:
					alterar(alunos,cont);
					break;
				case 5:
					histograma(alunos,cont);
					break;
				case 6:
					gravarficheiro(alunos,cont);
					break;
				case 7:
					System.out.println("Volte sempre :D");
					break;
				default:
					System.out.println("Erro, introduza uma opcao valida.");
					break;
			}
		}while(op != 7);
	}
	
	public static int lerficheiro(aluno[] alunos,int cont) throws IOException{
		boolean doc = false;
		do{
			System.out.println("Qual o nome do ficheiro que pretende ler?");
			String s = sc.nextLine();
			File fin = new File(s);
			System.out.println("Attempting to read from file in: "+fin.getCanonicalPath());
			if(!fin.exists()){
				System.out.println("Ficheiro inexistente.");
			}
			else if(fin.isDirectory()){
				System.out.println(s + " e um diretorio");
			}
			else if(!fin.canRead()){
				System.out.println("Ficheiro nao pode ser lido.");
			}
			else{
				Scanner f = new Scanner(fin);
				doc = true;
				while(f.hasNextLine()){
					alunos[cont] = new aluno();
					alunos[cont].Nmec = f.nextInt();
					alunos[cont].nome = f.nextLine().trim();
					System.out.println("Nome: " + alunos[cont].nome);
					System.out.println("N.mec:	" + alunos[cont].Nmec);
					do{
						System.out.print("Nota de epoca normal: ");
						alunos[cont].notanormal = sc.nextInt();
					}while(alunos[cont].notanormal < 0 || alunos[cont].notanormal > 20 && alunos[cont].notanormal != 77);
					do{
						System.out.print("Nota de epoca de recurso: ");
						alunos[cont].notarecurso = sc.nextInt();
					}while(alunos[cont].notarecurso < 0 || alunos[cont].notarecurso > 20 && alunos[cont].notarecurso != 77);
					
					if(alunos[cont].notanormal > alunos[cont].notarecurso && alunos[cont].notanormal != 77 && alunos[cont].notarecurso != 77){
						alunos[cont].notafinal = alunos[cont].notanormal;
					}
					else{
						alunos[cont].notafinal = alunos[cont].notarecurso;						
					}
					if(alunos[cont].notanormal == alunos[cont].notarecurso && alunos[cont].notanormal == 77){
						alunos[cont].notafinal = alunos[cont].notarecurso;
					}
					if(alunos[cont].notanormal == 77){
						alunos[cont].notafinal = alunos[cont].notarecurso;						
					}
					if(alunos[cont].notarecurso == 77){
						alunos[cont].notafinal = alunos[cont].notanormal;						
					}
					cont++;
				}
				f.close();
			}
		}while(!doc);
		return cont;
	}
	
	public static void informacao(aluno alunos[], int cont){
		System.out.println("Pauta de uma disciplina");
		System.out.println("-------------------------");
		for(int i = 0; i < cont; i++){
			System.out.printf("|  %5d", alunos[i].Nmec);
			System.out.printf(" | %2d", alunos[i].notanormal);
			System.out.printf(" | %2d", alunos[i].notarecurso);
			System.out.printf(" | %2d |\n", alunos[i].notafinal);
		}
		System.out.println("-------------------------");

		
	}
	
	public static void calcular(aluno alunos[], int cont){
		double media = 0;
		for(int i = 0; i < cont; i++){
			if(alunos[i].notafinal < 22){
				media = media + alunos[i].notafinal;
			}
		}
		media = media/cont;
		System.out.println("O valor da nota final media de todos os alunos e " + media);
		
		//MELHOR ALUNO (se houver vários alunos com nota máxima, o programa escolhe o primeiro a aparecer como melhor)
		int NotaFinalMaxima = 0;
		int MelhorNmec = 0;
		String MelhorAluno = "";
		for(int i = 0; i < cont; i++){
			if(alunos[i].notafinal > NotaFinalMaxima && alunos[i].notafinal < 21){
				NotaFinalMaxima = alunos[i].notafinal;
				MelhorNmec = alunos[i].Nmec;
				MelhorAluno = alunos[i].nome;
			}
		}
		System.out.println("O melhor aluno e " + MelhorAluno + "(" + MelhorNmec + ") com uma nota final de " + NotaFinalMaxima);
		int aprovados = 0;
		for(int i = 0; i < cont; i++){
			if(alunos[i].notafinal >= 10){
				aprovados++;
			}
		}
		System.out.println("O numero de alunos aprovados e " + aprovados + " e o de reprovados e " + (cont-aprovados));
	}
	
	public static void alterar(aluno alunos[], int cont){
		System.out.println("Qual o numero mecanografico pertencente ao aluno que pretende alterar?");
		int k = sc.nextInt();
		int verif = 0;
		for(int i = 0; i < cont; i++){
			if(k == alunos[i].Nmec){
				do{
					System.out.print("Nota de epoca normal: ");
					alunos[i].notanormal = sc.nextInt();
				}while(alunos[cont].notanormal < 0 || alunos[i].notanormal > 20 && alunos[i].notanormal != 77);
				do{
					System.out.print("Nota de epoca de recurso: ");
					alunos[i].notarecurso = sc.nextInt();
				}while(alunos[i].notarecurso < 0 || alunos[i].notarecurso > 20 && alunos[i].notarecurso != 77);
				if(alunos[i].notanormal > alunos[i].notarecurso && alunos[i].notanormal != 77 && alunos[i].notarecurso != 77){
					alunos[i].notafinal = alunos[i].notanormal;
				}
				else{
					alunos[i].notafinal = alunos[i].notarecurso;						
				}
				if(alunos[i].notanormal == alunos[i].notarecurso && alunos[i].notanormal == 77){
					alunos[i].notafinal = alunos[i].notarecurso;
				}
				if(alunos[i].notanormal == 77){
					alunos[i].notafinal = alunos[i].notarecurso;						
				}
				if(alunos[i].notarecurso == 77){
					alunos[i].notafinal = alunos[i].notanormal;						
				}
			}else{
				verif++;
			}
		}
		if(verif <= cont){
			System.out.println("Nao ha nenhum aluno com esse numero mecanografico");
		}
	}
	
	public static void histograma(aluno alunos[], int cont){
		System.out.println("               Histograma de uma disciplina                   ");
		// COMEÇAR DE CIMA PARA BAIXO POR ISSO TENHO QUE DESCOBRIR QUANTOS *'S HA DE CADA NUMERO
		int maximo = -1;
		int variacoes[] = new int[21];
		
		for(int i = 0; i < 21; i++){ //definir quantas vezes cada numero tem
			for(int j=0;j<cont;j++){
				if(alunos[j].notafinal == i){ 
					variacoes[i]++;
				}
			}
		}
		//VER QUAL É O MAIOR PARA DEFINIR A ALTURA DO HISTOGRAMA
		for(int i = 0; i < 21; i++){
			if(variacoes[i] > maximo){ 
				maximo = variacoes[i];
			}
		}
		
		for(int i = maximo; i > 0; i--){
			for(int a = 0; a < 21; a++){
				if(variacoes[a] >= i){
					System.out.print(" * ");
				}
				else{
					System.out.printf("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------");
		for(int i = 0; i < 21; i++){
			System.out.printf("%2d ",i);
		}
		System.out.println();
	}
	
	public static void gravarficheiro(aluno alunos[], int cont) throws IOException{
		boolean ola = false;
		
		
		File fout;
		//do{
			
		System.out.println("Qual o ficheiro que pretende gravar?");
		String s = sc.nextLine();
		fout = new File(s);
		
	
		if(fout.exists()){
			System.out.println("Esse ficheiro ja existe. Pretende escrever por cima? S/N");
			String opcao = sc.nextLine();
			if(opcao.toUpperCase().charAt(0) != 'S'){
				System.out.println("Qual o nome em que pretende guardar o ficheiro em alternativa? ");
				s = sc.nextLine().trim();
				fout = new File(s);
			}
		}
		
		for(int i = 0; i < cont-1; i++){
			for(int j = i + 1; j < cont; j++){
				if(alunos[i].notafinal < alunos[j].notafinal){
					aluno tmp = new aluno();
					
					tmp.notafinal = alunos[i].notafinal;
					tmp.notanormal = alunos[i].notanormal;
					tmp.notarecurso = alunos[i].notarecurso;
					tmp.nome = alunos[i].nome;
					tmp.Nmec = alunos[i].Nmec;
					
					alunos[i].notafinal = alunos[j].notafinal;
					alunos[i].notanormal = alunos[j].notanormal;
					alunos[i].notarecurso = alunos[j].notarecurso;	
					alunos[i].nome = alunos[j].nome;
					alunos[i].Nmec = alunos[j].Nmec;
					
					alunos[j].notafinal = tmp.notafinal;
					alunos[j].notanormal = tmp.notanormal;
					alunos[j].notarecurso = tmp.notarecurso;
					alunos[j].nome = tmp.nome;
					alunos[j].Nmec = tmp.Nmec;
					
				}
			}
		}
		
		PrintWriter p = new PrintWriter(fout);	
		for(int i = 0; alunos[i].notafinal >= 9.5; i++){
			if(alunos[i].notafinal<21){
				p.println("NotaFinal: "+ alunos[i].notafinal + "		N mec: " + alunos[i].Nmec
				+ "	NotaNormal: " + alunos[i].notanormal + "	NotaRecurso: " + alunos[i].notarecurso+"	Nome: " + alunos[i].nome);
			}
		}
		p.close();
		
	}
}

class aluno {
	int Nmec;
	String nome;
	int notanormal;
	int notarecurso;
	int notafinal;
}
