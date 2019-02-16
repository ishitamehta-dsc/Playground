import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      
      Scanner scan = new Scanner(System.in);
      int score = scan.nextInt();
if(score >=85)
{
System.out.println("A");
}
else if ((score >=75)&&(score <85))
{
System.out.println("B");
}
else if ((score >= 65)&&( score <75 )) 
{
System.out.println("C");
}
else if ((score >=55 )&&(score <65))
{
System.out.println("D");
}
else if ((score >=45 )&&(score  <55))
{
System.out.println("E");
}
else if (score <45 )
{
System.out.println("Fail");
}

    }
}