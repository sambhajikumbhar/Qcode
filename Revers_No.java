package code_test1;

public class Revers_No {

	public static void main(String[] args) {
		int a=123,p,sum=0;
		while(a!=0)
		{
		p=a%10;
		sum=sum*10+p;
		a=a/10;
		}
		System.out.println(sum);
	}

}
