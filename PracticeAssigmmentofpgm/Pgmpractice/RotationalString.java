import java.util.Scanner;

//pgm for string rotational
public class RotationalString {

	public static void main(String[] args) {
    System.out.println("Enter ur string::");
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println("Enter u want find string within rotational string::");
    String find=sc.nextLine();
    if((str+str).contains(find)){
    	System.out.println("Ur string contains in rotational string");
    }
    else
    	System.out.println("Ur string  not contains in rotational string");
	}

}
