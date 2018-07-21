import java.util.*;
public class aula_33 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		double x,x1;
		double max_,min_;
		int n=0;
		double para_media = 0;
		System.out.print("Introduza um numero real: ");
		x = sc.nextDouble(); x1 = x; max_ = x; min_ = x; n++; para_media = x;
		do
		{
		System.out.print("Introduza um numero real: ");
		x = sc.nextDouble(); n++;
		if (x> max_) max_ = x;
		if (x<min_)min_=x;
		para_media +=x;
		} while(x1 != x);
		n--; para_media-=x;
		System.out.print("max = " +max_);
		System.out.print("min = " +min_);
		System.out.print("n = " +n);
		System.out.print("media = " +(para_media/n));
	}
}
