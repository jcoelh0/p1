import java.util.*;
public class lol {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) { 
	
		for (int a = 1; a <= 100; a++){
			for (int b = a+1; b <= 100; b++){
				System.out.printf("\na=%d b=%d c=%d\n",a,b,a*a+b*b);
				
			}
		}
	}
}
/*do{
		 boolean done = false;
        for (long c = 1; !done; c++)
            for (long a = 1; a < c; a++)
                for (long b = 1; b < c && a<b; b++)
                    if (a*a + b*b == c*c) done = true;
                    System.out.println(a+" "+b+" "+c);
  // }while(a<100 && b<100);
}
}
* 
	/*	double a=0,b=0,c=0;
		double qa;
		double qb;
		double qc;
		
		
			
			qa = a * a;
			qb = b * b;
			qc = c * c;
			
		{	a=Math.sqrt(c*c-b*b);
			b=Math.sqrt(c*c-a*a);
			c=Math.sqrt(a*a+b*b);
			//a*a+b*b=c*c;
			
			if(qa + qb == qc){
				System.out.println(a+" "+b+" "+c);
			}
				a++;
				if(qa + qb == qc){
				System.out.println(a+" "+b+" "+c);
				b++;}
			
				if(qa + qb == qc){
				System.out.println(a+" "+b+" "+c);
				}c++;
			
		}while(a<100 && b<100); 
			//String eq1="a*a+b*b=c*c;";
			//int[] SolveEquations(eq1) {
	}
}

public class lol { 

    public static void main(String[] args) { 
        boolean done = false;
        int a,b,c;
        for (int c = 1; !done; c++)
            for (int a = 1; a < c; a++)
                for (int b = 1; b < c; b++)
                    if (a*a + b*b == c*c) done = true;
                    System.out.println(a+" "+b+" "+c);
   }

}

*/
