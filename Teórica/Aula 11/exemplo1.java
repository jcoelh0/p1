import java.util.Scanner;
import java.io.*;

public class exemplo1{
	static Scanner kb = new Scanner(System.in);
  public static void main(String[] args) throws IOException{
    System.out.print("Nome do ficheiro: ");
    String fileName = kb.nextLine();
    int dim = contarNumeros(fileName);
    System.out.println("O fich. tem " + dim + " numeros validos");
    double numeros[] = new double[dim];
    lerNumeros(fileName, numeros);
    imprimir(numeros);
    bubbleSort(numeros);
    System.out.println("Ordenados crescente:");
    imprimir(numeros);
    sequentialSort(numeros);
    System.out.println("Ordenados decrescente:");
    imprimir(numeros);
    System.out.print("Qual o numero: ");
    double num = kb.nextDouble();
    if(pesquisar(numeros, num))
    {
      System.out.println("Existe");
    }
    else
    {
      System.out.println("Não existe");
    }

    int count = contagem(numeros, num);
    if(count != 0)
    {
      System.out.println("Existe "  + count +  " vezes");
    }
    else
    {
      System.out.println("Não existe");
    }
  }

  public static int contagem(double a[], double num)
  {
    int count = 0;
    for(int p = 0 ; p < a.length ; p++)
    {
      if(num == a[p])
      {
        count++;
      }
    }
    return count;
  }

  public static boolean pesquisar(double a[], double num)
  {
    for(int p = 0 ; p < a.length ; p++)
    {
      if(num == a[p])
      {
        return true;
      }
    }
    return false;
  }

  public static void sequentialSort(double a[])
  {
    for(int i = 0 ; i < a.length - 1 ; i++)
    {
      for(int j = i + 1 ; j < a.length ; j++)
      {
        if(a[i] < a[j])
        {
          double tmp;
          tmp = a[i];
          a[i] = a[j];
          a[j] = tmp;
        }
      }
    }
  }

  public static void bubbleSort(double a[])
  {
    int trocas = 0;
    do{
      trocas = 0;
      for(int p = 0 ; p < a.length - 1 ; p++)
      {
        if(a[p] > a[p+1])
        {
          double tmp;
          tmp = a[p];
          a[p] = a[p+1];
          a[p+1] = tmp;
          trocas++;
        }
      }
      System.out.println("Foram feitas " + trocas + " trocas");
    }while(trocas != 0);
  }

  public static void imprimir(double a[])
  {
    for(int i = 0 ; i < a.length ; i++)
    {
      System.out.println(a[i]);
    }
  }
  public static void lerNumeros(String nome, double a[]) throws IOException
  {
    int count = 0;
    File f = new File(nome);
    Scanner sc = new Scanner(f);
    while(sc.hasNextDouble())
    {
      double tmp;
      tmp = sc.nextDouble();
      if(tmp >= 0.0 && tmp <= 14)
      {
        a[count] = tmp;
        count++;
      }
    }
    sc.close();
  }
  public static int contarNumeros(String nome) throws IOException
  {
    int count = 0;
    File f = new File(nome);
    Scanner sc = new Scanner(f);
    while(sc.hasNextDouble())
    {
      double tmp;
      tmp = sc.nextDouble();
      if(tmp >= 0.0 && tmp <= 14)
      {
        count++;
      }
    }
    sc.close();
    return count;
  }
}
