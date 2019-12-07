package week2.day1;

public class Arrays {

	public static void main(String[] args) 
	{
		String[] group= {"Manju","Mani","Jay","Sakthi","Sasi","Raja","Swathi","Sai","Dhaya"};
		int length1=group.length;
		for(int i=0;i<length1;i++)
		{
			if(group[i].startsWith("S") || group[i].endsWith("a")
					)
			{
				System.out.println(group[i]);
			}
			
			
		}

	}

}
