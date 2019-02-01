import java.util.Scanner;

public class FibonaciSeries {
	public static void main(String[] args) {
		System.out.println("Program Started");
		System.out.println("Enter the range :");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int a=0,b=1,fs=0;
System.out.println("Fibonaci Series is : ");
		while(fs < range)
		{
			System.out.println(fs+" ");
			fs=a+b;
			a=b;
			b=fs;
			
		}
		System.out.println("Program Ended");
	}
}
