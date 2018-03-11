package com.qa.Strings;

public class ReverceTheSentence 
{
	String s = "Hi I am Rupali";
	String Reverse = "";
	public void ReverseSentence()
	{
		for(int i =s.length()-1;i>=0;i--)
		{
			Reverse  =Reverse +s.charAt(i);
		}
	System.out.println(Reverse);
	}
	public static void main(String[] args) 
	{
		ReverceTheSentence rs = new ReverceTheSentence ();
			rs.ReverseSentence();
	}
}
