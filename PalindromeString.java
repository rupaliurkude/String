package com.qa.Strings;

public class PalindromeString 
{
	String s = "mom";
	String Reverse ="";

	public void palindrome_String()
	{
		for(int i =s.length()-1;i>=0;i--){
			Reverse = Reverse+s.charAt(i);
		}
		if(s.equals(Reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
	}
	
	public static void main(String[] args) 
	{
		PalindromeString ps = new PalindromeString();
		ps. palindrome_String();
	}

}
