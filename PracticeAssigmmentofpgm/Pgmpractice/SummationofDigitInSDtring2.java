import java.util.Scanner;

public class SummationofDigitInSDtring2 {
	public static void main(String[] args) {
		System.out.println("Enter ur string containing digits::");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum +Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("sum of digits in String=" + sum);
	}

}
