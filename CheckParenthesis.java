package com.qa.Strings;
import java.util.Stack;

public class CheckParenthesis 
{
	//String Balenced = "(())";	
	public boolean checkParenthesis(String braces){
		String s = braces;
		Stack <String> stack = new Stack<String>();
		
			for(int i =0;i<s.length();i++){
				char c = s.charAt(i);
				String s1 = c+"";
				if(s1!=null){
				 if((c=='(')||
				 	(c=='{')||
				 	(c=='[')) {
					 stack.push(s1);
				 }else if(c==')'){
					 s1= "("+"";
				}
				else if(c=='}'){
					s1="{"+"";
				}
				else if(c =='['){
					s1 ="]"+"";	
				}
				 if(stack.size()==0 ){
						System.out.println("Is Unbalenced parenthesis");
					 return false;
					 }
					 if(stack.peek().equals(s1)){
						 stack.pop(); 
					}else{
					 System.out.println("Invalid Parenthesis");
				 }
			}
			if(stack.size()==0){
    			System.out.println("Is balenced parenthesis");
				return true;

			}
			return false;
			}
			System.out.println("Should not be null");
			return false;
	}

	public static void main(String[] args) 
	{
		CheckParenthesis p = new CheckParenthesis();
				p.checkParenthesis(")(");
	}

}
