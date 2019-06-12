package code_test1;

public class String_each_char {

	public static void main(String[] args) {
//		
	String s = "Alex Vipul Verma";
//		for(int counter=0;counter<s.length();counter+=1) {
//		System.out.println(s.charAt(counter));
		String [] st=s.split(" ");
	
		//System.out.println(st[0]);
		for(int i = st.length-1;i>=0;i--) {
			System.out.print(st[i]+" ");
		}
		}
	}


