import java.util.Scanner;

public class PrimeNoFind {

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("Given no."+no+"  is not prime no");
				System.exit(0);
			}
			else{
				System.out.println("Given no."+no+"  is prime no");
				System.exit(0);
		}
		}
	}

}
