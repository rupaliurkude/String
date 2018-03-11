package com.qa.Strings;

public class ReveseString 
{

	String s="Rupali";
	String Reverse="";
	public  void Reverse()
	{
		for(int i =s.length()-1;i>=0;i--){
			Reverse =Reverse+s.charAt(i);
		}
	System.out.println(Reverse);
	
	}
	public static void main(String[] args)
	{
		 ReveseString rs = new  ReveseString();
		 rs.Reverse();
	}

}
