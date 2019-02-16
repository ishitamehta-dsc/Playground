import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        System.out.print(+ average(x, y, z));
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
	}