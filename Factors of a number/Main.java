import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      int N, i;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        N = scanner.nextInt();
       
        for (i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}