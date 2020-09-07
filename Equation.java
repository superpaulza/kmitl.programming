import java.util.*;
class Equation
{
	public static void main(String[] args) 
	{
		//Get data from user via keyboard
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter variable from this form Ax^2+Bx+C = 0");
		System.out.print("Enter Variable A ==> ");
		double a = input.nextDouble();
		System.out.print("Enter Variable B ==> ");
		double b = input.nextDouble();
		System.out.print("Enter Variable C ==> ");
		double c =input.nextDouble();

		//Calculate Equation
		double p = Math.sqrt(b*b - 4.0*a*c);
		double q = (2.0*a);
		double x1 = (-b + p) / q;
		double x2 = (-b - p) / q;

		//Print Answer
		System.out.println("\n === Answer ===");
		System.out.printf("%s%f%n%s%f%n","X1 = ",x1,"X2 = ",x2);
	}
}
