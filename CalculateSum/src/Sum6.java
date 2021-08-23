import java.util.Scanner;

public class Sum6
{
	
 public static int calculateSum(int n)
 {
	 int sum = 0;
	 for (int i = 1; i <= n; i++)
	 {
		 if(i % 3 == 0 || i % 5 == 0 )
		  sum = sum + i;
	 }
	 System.out.println("hey");
	 
	return sum;
	
 }
	
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the number");

  int n = sc.nextInt();
  System.out.print("Sum : " + calculateSum(n));
 }
}
