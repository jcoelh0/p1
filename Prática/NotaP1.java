import java.util.*;
public class NotaP1 {
	static Scanner kb = new Scanner(System.in);
	public static void main (String args[]) {
		double TP1, TP2, API, EP;
		System.out.print("TP1:");
		TP1 = kb.nextDouble();
		System.out.print("TP2:");
		TP2 = kb.nextDouble();
		System.out.print("API:");
		API = kb.nextDouble();
		System.out.print("EP:");
		EP = kb.nextDouble();
		System.out.println("Nota final a P1: " + (TP1*0.1+TP2*0.1+API*0.3+EP*0.5));
	}
}

