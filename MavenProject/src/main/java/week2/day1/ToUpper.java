package week2.day1;

public class ToUpper {

	public static void main(String[] args)
	{
		String sample="testleaf";
		char[] upper=sample.toCharArray();
		for(int i=0;i<sample.length();i++)
		{
			if(i%2!=0)
			{
				int num1=upper[i];
				char b=(char)(num1-32);				
				System.out.print(b);
			
				
			}
			/*else
			{
				System.out.print(upper[i]);
			}*/
		}

	}

}
