package code_test1;
import java.util.*;
public class LargeNO {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("insert 3 no");
	int a=Integer.parseInt(s.nextLine());
	int b=s.nextInt();
	int c=s.nextInt();
	if(a==b&&a==c)
	{
		System.out.println("all r same");
	}
	else if(a>b&&a>c)
	{
		System.out.println(a+"is big");
	}
	else if(a==b&&a>c)
	{
		System.out.println("a & b is big no");
	}else if(a==c&&a>b){
		System.out.println("a & c are big");
	}else if(b==c && b>a)
	{
		System.out.println(" b & c r big");
	}
	else if(b>c)
	{
		System.out.println("b is big");
	}else
	{
		System.out.println("c i s big");
	}
		
	}
	
	}


