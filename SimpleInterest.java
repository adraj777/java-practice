import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter principle : ");
		int p = scan.nextInt();
		
		System.out.print("Enter rate : ");
		int r = scan.nextInt();
		
		System.out.print("Enter time : ");
		int t = scan.nextInt();
		
		int si=(p*r*t)/100;
		
		System.out.println("Simple Interest calculator "+si);
	}

}
