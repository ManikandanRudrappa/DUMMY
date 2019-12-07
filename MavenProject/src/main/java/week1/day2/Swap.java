package week1.day2;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the value of a: ");
		int a = input.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = input.nextInt();
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of a: "+ a);
		System.out.println("the value of b: "+ b);

		

	}

}
