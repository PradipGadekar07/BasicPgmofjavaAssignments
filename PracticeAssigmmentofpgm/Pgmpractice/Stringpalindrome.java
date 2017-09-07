import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		System.out.println("Enter ur string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("String is Palindrome");
			System.exit(0);
		}
		else{
			System.out.println("String is not Palindrome");
			System.exit(0);
		}
	}
}
