package week3day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharCount {

	public static void main(String[] args) 
	{
		String s="Manikandan";
		char[] name=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char each:name)
		{
			if(map.containsKey(each))
			{
				map.put(each,map.get(each)+1);
			}
			else
				map.put(each,1);
				
		}
		for(Map.Entry<Character,Integer> each:map.entrySet())
		{
			System.out.print(each.getKey()+ "->"+ each.getValue() + " " );
		}
		//System.out.println(map);
		
				

	}

}
