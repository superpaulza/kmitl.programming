import java.util.*;
class PerfectNo 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number x ==> ");
		int x = scan.nextInt();
		System.out.print("Enter number y ==> ");
		int y = scan.nextInt();
		System.out.print("Enter number z ==> ");
		int z = scan.nextInt();
		
		int result_x = result(x);
		int result_y = result(y);
		int result_z = result(z);
		check_number(x,result_x);
		check_number(y,result_y);
		check_number(z,result_z);
	}

	////////////////////////////////////////////////////////////////
	
	static int result(int A) 
	{
		int result=0;
		for(int i=1 ; i<A ;i++){
			if( A%i == 0 ){
				result=result+i;
			}
		}	
		return result;
	}
	
	/////////////////////////////////////////////////////////////////
	
	static void check_number(int a ,int b )
	{
		if(a==b){
			System.out.println(a+" is perfect number");
		}else if(a<b){
			System.out.println(a+" is deficient number");
		}else{
			System.out.println(a+" is abundant number");
		}
	}
}
