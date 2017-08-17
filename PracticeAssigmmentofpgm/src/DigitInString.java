import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitInString {

	public static void main(String[] args) {
		System.out.println("Enter ur string containing digits::");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String regex = "(\\d+)";
		Matcher matcher = Pattern.compile(regex).matcher(str);
		while (matcher.find()) {
			String num = matcher.group();
			System.out.print("  " + num);
		}
	}

}
