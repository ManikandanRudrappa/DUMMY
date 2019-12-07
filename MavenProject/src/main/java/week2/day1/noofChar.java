package week2.day1;

public class noofChar {

	public static void main(String[] args) {
		
		String name="america";
		char[] name1=name.toCharArray();
		int len=name.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(name1[i]=='a')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
