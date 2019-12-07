package week3day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListNames 
{
	public static void main(String[] args)
	{
		List<String> lnames=new ArrayList<String>();

		lnames.add("Mani");
		lnames.add("Manju");
		lnames.add("Arrun");
		lnames.add("Mohan");
		lnames.add("Manju");
		lnames.add("Jeen");
		lnames.add("Sen");
		lnames.add("Rudrappa");
		//int length=lnames.size();
		
		Set<String> dupnames=new HashSet<String>();
		
		for(String each:lnames)
		{
			boolean add = dupnames.add(each);
			if(add==false)
			{
			System.out.println("Duplicate name:"+ each);
			dupnames.remove(each);
			}
		}
		for(String each:dupnames)
		{
			//dupnames.add(each);
		System.out.println(each);
		}
		
		
		
		}
		
	}
	


