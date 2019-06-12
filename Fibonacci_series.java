package code_test1;

public class Fibonacci_series {

	public static void main(String[] args) {
		int a=10;int i=0;int j=1;
		for(int p=0;p<=a;p++)
		{
			System.out.print(i+" ");
			int sum=i+j;
			i=j;
			j=sum;
		}
	}

}
