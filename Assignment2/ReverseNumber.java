import java.util.Scanner;

public class ReverseNumber{
	public static void Reverse(int num){
		if(num>0){
			System.out.print(num%10);
			num=num/10;
			Reverse(num);
		}
	}
	public static void main(String args[]){
		int number=0;

		System.out.print("Enter a number : ");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();

		System.out.print("Reverse number : ");
		Reverse(number);
		System.out.println("");
	}
}
