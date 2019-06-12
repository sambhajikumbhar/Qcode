package code_test1;
import java.util.*;
public class Perfeact_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
		int n=s.nextInt();
		int sum=0,p;
		p=n;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
			System.out.println(i);
		}
	}
	if(sum==p)
	{
		System.out.println("perfect no");
	}
	else {
		System.out.println("not a perfect");
	}
	}
}
