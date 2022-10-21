import java.util.Scanner;
public class Num_Palindrome {
	static void num_palindrome(int n)
	{
		int a=n; // storing orignal value of n in a
		int r=0;
		while(n>0)
		{
			r=(r*10)+(n%10);
			n=n/10;
		}
	  if(a==r)
		{
			System.out.print("Given Number is a Palindrome");
		}
		else
		{
			System.out.print("Given Number is not a Palindrome");
		}
	}
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int n= sc.nextInt();
		num_palindrome(n);	
	}
}