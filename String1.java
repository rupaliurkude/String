package com.qa.Strings;

public class String1 
{
	String s = "This is Nice";
	int count =1;
	public  void StringCount()
	{
			String a[] = s.split(" ");
			for(String a1:a)
			{
				System.out.print(a1+ count++ + " ");
			}
	}	
		
	public static void main(String[]arg)
	{
		String1 s = new String1();
		s.StringCount();
	}
}


