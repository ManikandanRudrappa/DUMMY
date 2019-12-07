package week2.day1;

public class SumOfNos {

	public static void main(String[] args) 
	{
		String Sample = "AC1SFc45c2";
		String Sample1 = Sample.replaceAll("\\D","");
		System.out.println("After removing strings, the value is :- "+Sample1);
		Integer num=Integer.parseInt(Sample1);
		// int[] num1=num.to
		//System.out.println(num);
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println("The sum is:" + sum);
		
	}

}
