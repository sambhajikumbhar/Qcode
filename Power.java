package code_test1;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		int l=1;
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	int p=s.nextInt();
	while(p!=0)
	{
		l=l*b;
		p--;
	}
	System.out.println("power"+l);
	}

}
