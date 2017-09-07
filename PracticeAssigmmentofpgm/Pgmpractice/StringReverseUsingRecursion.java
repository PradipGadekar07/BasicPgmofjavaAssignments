import java.util.Scanner;

public class StringReverseUsingRecursion {
	 public String rev=" ";
		public String reverse(String str)
		{
			if(str==null||str.length()<1)
				return str;
			else
			{
				rev =rev+str.charAt(str.length()-1);
				reverse(str.substring(0,str.length()-1));
				return rev;
			}
		}

	public static void main(String[] args) {
		System.out.println("Enter ur string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    System.out.println("String before reverse:"+str);
	    StringReverseUsingRecursion strrev=new StringReverseUsingRecursion();
	    System.out.println("String after reverse:"+strrev.reverse(str));
	}

}
