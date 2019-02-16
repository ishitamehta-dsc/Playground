import java.util.Scanner;
class Main {
  private static Scanner sc;
	public static void main (String[] args) {
		// Type your code here
      int number, first_digit;
		sc = new Scanner(System.in);
		number = sc.nextInt();	
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		System.out.println(+ first_digit);
	}
}