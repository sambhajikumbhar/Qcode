package code_test1;

public class Palindrom_no {

	public static void main(String[] args) {
		int a=120,i;int j=0,temp;
		temp=a;
		while(a!=0)
		{
			i=a%10;
			j=j*10+i;
			a=a/10;
		}
		if(temp==j)
		{
			System.out.println("palindrom no");
		}
		else
		{
			System.out.println("not a pylindropm");
		}
	}

}
