import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("\nEnter a number:");
		n=s.nextInt();
		s.close();
		if(n%2==0)
		{
			System.out.println( +n+" is an even number!");
		}
		else
		{
			System.out.println(+n+ "is an odd number");
		}

	}
	
}