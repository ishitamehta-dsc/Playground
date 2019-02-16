import java.util.Scanner;
class Main {
	public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       double side = scanner.nextDouble();
       double area = side*side; 
       System.out.println(+area);
	}
}