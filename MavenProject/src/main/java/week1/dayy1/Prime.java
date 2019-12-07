package week1.dayy1;

public class Prime {

	public static void main(String[] args)
	{
			
								
			for(int num=2;num<=100;num++)
			{
				int flag=0;
				
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					flag++;
			}
			if(flag == 0)
			{
				System.out.println(num +"is a prime num");
			}
			
			
}
	}
}
