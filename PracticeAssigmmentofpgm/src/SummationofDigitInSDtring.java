import java.util.Scanner;

public class SummationofDigitInSDtring {

	public static void main(String[] args) {
		System.out.println("Enter ur string containing digits::");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 47 && ch[i] <= 58) {
				int p = (char) Character.getNumericValue(ch[i]);
				sum = sum + p;
			}
		}
		System.out.println("sum of digits in String=" + sum);
	}

}
