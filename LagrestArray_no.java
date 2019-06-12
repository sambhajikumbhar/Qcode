package code_test1;
import java.util.*;
public class LagrestArray_no {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter array size");
	int temp;
	int n=s.nextInt();
	int k[]=new int [n];
	System.out.println("enter array elements");
	for(int i=0;i<n;i++)
	{
		k[i]=s.nextInt();
	}
	//sort logic
	for(int i=0;i<n;i++)
	{
		for(int j=1+i;j<n;j++)
		{
			if(k[i]<k[j])
			{
				temp=k[i];
				k[i]=k[j];
				temp=k[j];
			}
			
		}
		
	}
	System.out.println(k[0]);
	}

}
