import java.util.Scanner;

public class SummetionofNoinSting {
	public static void main(String[] args) {
		System.out.println("Enter ur string containing digits::");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		String[] find=str.split("[a-zA-Z]+");
		for (int i = 0; i < find.length; i++) {
				sum = sum + +Integer.parseInt(find[i]);
			}
		System.out.println("sum of Nimbers in String=" + sum);
	}

}
