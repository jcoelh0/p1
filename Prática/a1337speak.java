//Your program must read the string given on the standard 
//input and print to the standard output the same string 
//converted into 1337 speak.


import java.util.*;
public class a1337speak {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in); 
	
	
	//String replaced = sentence.replace("and", "");
    //System.out.println(replaced);
	
	String s = sc.nextLine();
	s=s.replace('o','0');
	s=s.replace('a','4');
	s=s.replace('A','4');
	//if(s.hasNextLine("o"))
	//	s.replace("0");
	//System.out.println(a);
	//System.out.println(b);
	System.out.println(s);
	}
}
