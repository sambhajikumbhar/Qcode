package code_test1;

public class String_revres {

	public static void main(String[] args) {
		String st1 = "sam";
		String st2 = "";
		int i = 0;
		i = st1.length();
		for (i = i - 1; i >= 0; i--) {
			st2 = st2 + st1.charAt(i);
		}
		System.out.println(st2);
//		StringBuffer sb=new StringBuffer(st1);
//		sb.reverse();
//		System.out.println(sb);
//		

	}

}
