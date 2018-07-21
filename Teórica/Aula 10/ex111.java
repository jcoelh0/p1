import java.util.*;
import java.io.*;
public class ex111 {
	static Random rand = new Random();	
	static final int N = 20;		
public static void main (String args[]) throws IOException    {
    int a[] = new int[N];
    File Piwinha = new File("Arrays");
    PrintWriter pw = new PrintWriter(Piwinha);
    String nome[] = new String[N];	
       
    for(int i = 0; i < a.length;  i++) 
          a[i] = rand.nextInt(100);
    String dao = "dados nao ordenados", dor = "dados ordenados";
    System.out.println(dao);
    print(a,pw);
long time=System.nanoTime();
    sortCrescSeq(a);
long time_end=System.nanoTime();
    System.out.println(dor);
    print(a,pw);
    pw.close();
System.out.printf("measured time (in ns): %d\n",time_end-time);
System.out.printf("measured time (in ms): %.3f\n",(double)(time_end-time)/1000000.);
}

public static void sortCrescSeq(int[] num_array) {
  for(int i = 0;i < num_array.length-1;i++) 
     for(int j = i + 1;j < num_array.length;j++)
          comparar_trocar(num_array,i,j);
 }
 
public static boolean comparar_trocar(int a[], int indice1, int indice2)   {
     if (a[indice1] < a[indice2])
     {   int tmp = a[indice1]; 
		 a[indice1] = a[indice2];
		 a[indice2] = tmp;  
		 return true; }
     return false;
	 }

public static void print(int array[],PrintWriter pw)
{    for(int i = 0; i < array.length; i++)
		pw.printf("array[%d] = \t%d;\n",i,array[i]);     }

}
