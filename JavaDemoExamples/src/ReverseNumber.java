import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	System.out.println("Program Started");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  Number to perform Reverse : ");
	int n=sc.nextInt();
	int n1=n;
	int rev=0;
    while(n>0)
	{
	int rem=n%10;
	rev=rem+rev*10;
	n=n/10;
	}
    System.out.println("The reverse of the number : "+n1+" is : "+rev);
	System.out.println("Program Ended");
}
}
