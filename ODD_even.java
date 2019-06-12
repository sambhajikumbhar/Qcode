package code_test1;
import java.util.*;
public class ODD_even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("how many no sort even or odd");
		int a=s.nextInt();
for(int i=0;i<=a;i++)
{
	if(i%2==0)
	{
		System.out.print("even");
	System.out.println(i);	
	}
	if(i%2!=0)
	{
		System.out.print("odd"+i);
	}
}
	}

}
