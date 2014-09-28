import java.util.Scanner;
public class PassRating 
{

	public static void main(String[] args) 
	{
		double a, b , c, d;
		double ATT, COMP, YDS, TD, INT;
		double Rating;
		Scanner keyBoard = new Scanner(System.in);
		
		System.out.println("How many touchdowns?");
		TD = keyBoard.nextDouble();
		System.out.println("How many yards?");
		YDS = keyBoard.nextDouble();
		System.out.println("How many completions?");
		COMP = keyBoard.nextDouble();
		System.out.println("How many interceptions?");
		INT = keyBoard.nextDouble();
		System.out.println("How many passes attempted?");
		ATT = keyBoard.nextDouble();
		
		a = ((COMP/ATT) - .3) * 5;
		b = ((YDS/ATT) - 3) * .25;
		c = (TD/ATT) * 20;
		d = 2.375 - ((INT/ATT) * 25);
		Rating = ((a + b + c + d) / 6) * 100;
		
		System.out.println();
		System.out.printf("NFL Passer Rating: %.1f%n", Rating);
		System.out.println();
		System.out.println("End of Program.");
		keyBoard.close();

	}

}
