import java.util.*;
public class ex34AltoBaixo {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		
		int secret = (int)(100.0*Math.random()) + 1;
		System.out.println("Este e o jogo AltoBaixo! Tenta adivinhar o número de 1 a 100:");
		int x,a=0;
		do{
			x = sc.nextInt();
			a++;
		if(x > secret){
			System.out.println("Numero demasiado alto, tenta outra vez:");
			//x = sc.nextInt();
		}
		else if(x<secret){
			System.out.println("Numero demasiado baixo, tenta outra vez:");
			//x = sc.nextInt();
		}
		else if(x==secret){
			
			System.out.printf("Boa, acertaste! Precisaste de %d tentativas, que nabo/a foda-se pahahaha", a);
		}
	}
		while(x !=secret);
	}
}
//Altere o jogo AltoBaixo de forma que quando um jogo acaba, o programa pergunta Novo
//jogo (s/n)?. O utilizador responde escrevendo uma letra. O programa s´o termina se a
/*resposta for n.
Pode ler uma palavra com o c´odigo:
String resp = sc.next();
e pode testar igualdade com a express˜ao (resp.equals("n"))*/
