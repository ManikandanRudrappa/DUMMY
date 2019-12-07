package week2.day1;

public class SumNos1 {

	public static void main(String[] args)
	{
	
		String Sample = "AC1SFc45c2";
		String Sample1 = Sample.replaceAll("\\D","");
		System.out.println(Sample1);
		char[] Sample2 = Sample1.toCharArray();
		int [] num = new int[Sample.length()];
		for (int i =0;i<Sample.length();i++)
		{
			num[i]=Sample.charAt(i)-'0';
			
		}
		for (int i:num)
			System.out.println(i);
	}

}
