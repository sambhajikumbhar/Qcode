package code_test1;

public class Long_string {

	public static void main(String[] args) {
		String name="my name is sambhaji";
		String[] space=name.split(" ");
		String str="";
		for(int i=0;i<space.length;i++)
		{
			if(space[i].length()>=str.length())
			{
				str=space[i];
			}
		}
		System.out.println(str);
	}

}
