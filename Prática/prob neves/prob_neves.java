import java.util.*;
import java.io.*;

public class prob_neves {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
			
		aluno alunos[] = new aluno[1000];
		
		int op;
		int cont = 0;
		do{
			System.out.println("1-Ler ficheiro");
			System.out.println("2-Ordenar por nome");
			System.out.println("3-Ordenar por Nmec");
			System.out.println("4-Ordenar por nota");
			System.out.println("5-Histograma vertical");
			System.out.println("6-Histograma horizontal");
			System.out.println("7-Media");
			System.out.println("8-Ordenar por nota os que passaram");
			System.out.println("9-Retirar aluno");
			System.out.println("10-Adicionar aluno");
			System.out.println("11-Gravar informacao em ficheiro");
			System.out.println("12-Alterar nota dum aluno");
			System.out.println("13-Sair do programa");
			System.out.print("Opcao---->");
			op = sc.nextInt();
			sc.nextLine();
	
			switch(op){
				case 1:
					cont = lerficheiro(alunos,cont);
					break;
				case 2:
					ordenarNome(alunos,cont);
					break;
				case 3:
					ordenarNmec(alunos,cont);
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					
					break;
				case 8:
					
					break;
				case 9:
					
					break;
				case 10:
					
					break;
				case 11:
					
					break;
				case 12:
					
					break;	
				case 13:
					System.out.println("Se descobrir um bug reporte-o e doe dinheiro porque sempre ajuda! :) Volte sempre.");
					System.exit(1);
				default:
					System.out.println("Opcao invalida!");
					break;
			}
		}while(op != 13);
		
	}
	
	
	public static int lerficheiro(aluno[] alunos,int cont) throws IOException{
		boolean doc = false;
		do{
			System.out.println("Qual o ficheiro que pretende ler?");
			String s = sc.nextLine();
			File fin = new File(s);
			
			if(!fin.exists()){
				System.out.println(s + " nao existe!");
			}
			else if(fin.isDirectory()){
				System.out.println(s + " e um diretorio.");
			}
			else if(!fin.canRead()){
				System.out.println(s + " nao pode ser lido.");	
			}
			else{
				doc = true;
				Scanner f = new Scanner(fin);
				while(f.hasNextLine()){
					
					if(f.hasNextInt()){
						alunos[cont] = new aluno();
						alunos[cont].Nmec = f.nextInt();
						alunos[cont].nome=" ";
						while(!f.hasNextDouble()){
							String tmp = " ";
							tmp = f.next();
							alunos[cont].nome += tmp + " ";
						}
						alunos[cont].nome = alunos[cont].nome.trim();
						alunos[cont].nota = f.nextDouble();
						cont++;
					}
					f.nextLine();
				}
			}
		}while(!doc);
		return cont;
	}
	
	public static void ordenarNome(aluno[] alunos,int cont){
		
		for(int i = 0; i < cont; i++){
			for(int j = i+1; j < cont; j++){
				if(alunos[i].nome.compareTo(alunos[j].nome) > 0){	
					aluno tmp = new aluno();
					
					tmp.nota = alunos[i].nota;
					tmp.nome = alunos[i].nome;
					tmp.Nmec = alunos[i].Nmec;
					
					
					alunos[i].nota = alunos[j].nota;	
					alunos[i].nome = alunos[j].nome;
					alunos[i].Nmec = alunos[j].Nmec;
					
					alunos[j].nota = tmp.nota;
					alunos[j].nome = tmp.nome;
					alunos[j].Nmec = tmp.Nmec;
					
					
				}
			}
			System.out.println("Nmec: " + alunos[i].Nmec + " Nota: " + alunos[i].nota + " Nome: " + alunos[i].nome);
		}
	}
	
	public static void ordenarNmec(aluno[] alunos,int cont){
		
		for(int i = 0; i < cont; i++){
			for(int j = i+1; j < cont; j++){
				if(alunos[i].Nmec > alunos[j].Nmec){	
					aluno tmp = new aluno();
					
					tmp.nota = alunos[i].nota;
					tmp.nome = alunos[i].nome;
					tmp.Nmec = alunos[i].Nmec;
					
					
					alunos[i].nota = alunos[j].nota;	
					alunos[i].nome = alunos[j].nome;
					alunos[i].Nmec = alunos[j].Nmec;
					
					alunos[j].nota = tmp.nota;
					alunos[j].nome = tmp.nome;
					alunos[j].Nmec = tmp.Nmec;
					
					
				}
			}
			System.out.println("Nmec: " + alunos[i].Nmec + " Nota: " + alunos[i].nota + " Nome: " + alunos[i].nome);
		}
	}
}

class aluno{
	String nome;
	int Nmec;
	double nota;
}
