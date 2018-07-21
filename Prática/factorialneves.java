import java.util.*;

public class factorialneves {
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Introduz um valor, coelho:") ;
int x=sc.nextInt(),n=x, fact =1;
for(;n>1;n--){
fact=(fact)*n;
}
System.out.println(x+"! ="+fact) ;
}
}
