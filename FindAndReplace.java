package com.qa.Strings;

public class FindAndReplace 
{
	String s = "Hi I am Rupali ";
	String Find = "Rupali";
	String Replace = "Ritvik";
	String replacedString ="";
	public void find_replace()
	{
		String a []= s.split(" ");
		for(String a1:a)
		{
			if(a1.contains(Find))
			{
				if(a1.equals(Find))
					a1=Replace;
			}
			replacedString = replacedString.concat(" "+a1);

		}
		System.out.println(replacedString);
	
	}
	public static void main(String[] args)
	{
		FindAndReplace fr = new FindAndReplace();
		fr.find_replace();
	}

}
