package com.qa.Strings;

public class worldCount {
	String s ="I Love You";
	int wordCount =1;
	
	
	public void count_world(){
		for(int i =0;i<s.length();i++){
			if(s.charAt(i)==' '){	
				wordCount++;	
			}		
		}
		System.out.print("Count of num of words:"+wordCount);
	}

	public static void main(String[] args) {
		 worldCount w = new  worldCount();
		 w.count_world();
	}

}
