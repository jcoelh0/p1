import java.util.Scanner;

public class ex63LEANDRO {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	int	max=0,min=0,nota,opcao,cont=0;	
	float media=0,peido=0;
	int notas[];
	notas = new int[50];
	
opcao = 0;	

notas = new int[50];
	
	System.out.println("Escreve a sequencia(0 para parar):");
	nota = sc.nextInt();
	while(cont<51){
		if(nota<=0)
		break;
	notas[cont] = nota;
	nota = sc.nextInt();
	cont ++;
	
	}

while( opcao != 6){
System.out.println("1- escrever nova sequencia");
System.out.println("2- calcular o maximo");
System.out.println("3- calcular o minimo");
System.out.println("4- calcular a media");
System.out.println("5- detetar se a sequencia e constituida apenas por pares ");
System.out.println("6- terminar programa ");
System.out.println("Escolha a opcao:");
opcao = sc.nextInt();

switch (opcao){
	case 1: 
	notas = new int[50];
	
	System.out.println("Escreve a sequencia:");
	nota = sc.nextInt();
	while(nota > 0){
		if(nota<0)
		break;
	notas[cont] = nota;
	nota = sc.nextInt();
	cont ++;
	}


	
		break;
	case 2:
	max = notas[0];
	for ( int i =0; i <= cont ;i++){
	if( max < notas[i]){
	max = notas[i];
}
}
System.out.println("Nota máxima " + max);	
System.out.println();
	
		break;
	case 3:
	//System.out.print(cont);
	min= notas[0];
	for ( int i=0; i < cont ;i++){
			if( min > notas[i]){
	min= notas[i];
	
}
}
System.out.println("Nota minima " + min);
		break;
	case 4: 
		for ( int i=0; i <=cont;i++){
		
		peido+=notas[i];
		media=(peido)/i;
	}	System.out.println("A media e "+ media);
		break;
	
	case 5:
		int lol=0,nlol=0;
		
		for(int i=0;i<cont;i++){
			
			if(notas[i]%2==0){
				lol++;
			}
			else{  
				nlol++;	
			}
		}
		if(nlol>0){
			System.out.println("Nao e so constituido por numeros pares");
		}
		else{
			System.out.println("E so constituido por numeros pares");
		}
		break;
	case 6:
	break;

}
}

	}
	
}
