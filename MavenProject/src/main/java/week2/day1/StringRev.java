package week2.day1;

public class StringRev {

	public static void main(String[] args)
	{
		String example="hi how are you";
		String[] spl=example.split(" ");
		for(int i=spl.length-1;i>=0;i--)
		{
			int len1=spl[i].length();	
			for(int j=len1-1;j>=0;j--)
			{
				System.out.print(spl[i].charAt(j));
			}
			System.out.print(" ");
		}
		

	}

}
