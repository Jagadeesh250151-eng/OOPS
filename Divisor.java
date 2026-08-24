package jagadeesh2117250020151;
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Divisors:");
		for(int i=2;i<n;i++)
			if(n%i==0)
				System.out.print(i+"  ");
		sc.close();

	}

}
