import java.util.*;

public class ex43_fatorial {

	public static void main(String[] args){
	while(true){
		{
		System.out.println("valor, sua ****, do fatorial");
		int x,a,b;
		Scanner i = new Scanner(System.in);
		x=i.nextInt(); 
		switch(x){
		default:
			b=x;a=1;
			for(;b>1;b--){
			a = a*(b);
			}
		System.out.println(x +"!="+a);
		case 0:
			System.exit(x);
			
		}
	}
}
}
}
