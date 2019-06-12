package code_test1;

public class Duplicate_str_char {

	public static void main(String[] args) {
		String st = "sambhaji";
		int count = 0;
		char[] chars = st.toCharArray();
		for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j < st.length(); j++) {
				if (chars[i] == chars[j]) {
					System.out.println(chars[j]);
					count++;
					break;
				}

			}

		}

	}
}
