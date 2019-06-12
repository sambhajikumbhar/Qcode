package code_test1;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int f=1;
	Scanner s=new Scanner(System.in);
	System.out.println("inert a no");
	int n=s.nextInt();
	while(n!=0)
	{
		f=f*n;
		n--;
	}
	System.out.println(f);
	}

}
