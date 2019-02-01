import java.util.Scanner;

public class GreatestOf3 {
	public static void main(String[] args) {
		System.out.println("Program Started : ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Numbers to check biggest");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is big");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("n2 is big");
		}
		else
			System.out.println("n3 is big");
		System.out.println("Program Ended :");
	}
}
