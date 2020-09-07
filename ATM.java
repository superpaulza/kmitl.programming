import java.util.*;
class ATM
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Money ==> ");
		int money = input.nextInt();
		int b1000 = 0 ,b500 = 0 ,b100 = 0 ,s = 0;
			b1000 = money/1000;
			s = money%1000;
			b500 = s/500;
			s = s%500;
			b100 = s/100;
			s = s%100;
		System.out.println("Bank1000 ==> " + b1000 + "\n" + "Bank500 ==> " + b500 + "\n" + "Bank100 ==> "  + b100 + "\n");
	}
}
