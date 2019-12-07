package week1.dayy1;

public class getPrime {

	public static void main(String[] args)
	{
			int flag=0;
			int num=6;
		//for(int num=2;num<100;num++)
		
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					flag=1;
			}
			if(flag == 0)
			{
				System.out.println(num +"is a prime num");
			}

	

	}
}
