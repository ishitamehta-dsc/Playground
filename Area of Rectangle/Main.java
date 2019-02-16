import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scanner = new Scanner(System.in);
	   double length = scanner.nextDouble();
	   double width = scanner.nextDouble();
	   double area = length*width;
	   System.out.println(+area);
	}
}