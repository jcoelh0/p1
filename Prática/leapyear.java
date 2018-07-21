//To determine whether a year is a leap year, follow these steps:
//1 If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//2 If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//3 If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//4 The year is a leap year (it has 366 days).
//5 The year is not a leap year (it has 365 days).

import java.util.*;
public class leapyear {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in, "UTF-8");
	System.out.print("Este programa determina se o ano é bissexto ou nao. Por favor introduza o ano:");
	int y;
	y=sc.nextInt(); 
	if (y%4==0) {
		if(y%100==0){
			if (y%400==0) {
			System.out.printf("%d e um ano bissexto (tem 366 dias)\n", y);
			}
			else {
			System.out.printf("%d e um ano comum (tem 365 dias)\n", y);
			}
		}
		else{
		System.out.printf("%d e um ano bissexto (tem 366 dias)\n", y);
		}
	}
	else {
	System.out.printf("%d e um ano comum (tem 365 dias)\n", y);
	}
	//        OOOOOUUUUUUUUUU	
	//if ((y%4==0 && y%100!=0) || y%400==0) {
	//	System.out.printf("%d e um ano bissexto (tem 366 dias)\n", y);
	//}
		//else {
	//	System.out.printf("%d e um ano comum (tem 365 dias)\n", y);
	//}
	
	}
}
