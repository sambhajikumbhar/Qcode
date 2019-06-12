package code_test1;
import java.util.*;
public class Prime_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
		int a=s.nextInt();
		int c=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("it is prime no");
		}
		else {
			System.out.println("not a prime no");
		}
	}

}
