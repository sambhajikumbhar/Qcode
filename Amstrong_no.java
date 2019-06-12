package code_test1;

public class Amstrong_no {

	public static void main(String[] args) {

		int a = 150;
		int r = 0, p, temp = 0;
		temp = a;
		while (a != 0) {
			p = a % 10;
			r = r + (p * p * p);
			a = a / 10;
		}
		if (temp == r) {
			System.out.println("amstrong no");
		} else {
			System.out.println("not amstong no");
		}

	}

}
