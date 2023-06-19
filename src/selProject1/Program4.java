package selProject1;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) 
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int i1 = sc.nextInt();
	
	
	System.out.println(chkPolindrome(i1));
	
	
	
		
	
	}
	public static int chkPolindrome(int n) {
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n /= 10;
		}
		
		return sum;
	}
}
	
	
	
	


