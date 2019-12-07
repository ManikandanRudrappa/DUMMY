package week1.dayy1;

public class sumOfInteg {
	
	
	

	public static void main(String[] args)
	{
		int num=15673;
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