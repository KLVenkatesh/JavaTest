package javaexercise;

import org.testng.annotations.Test;

public class palindromeTest {
	String s2="";
	
	//TestNG UnitTesting
	@Test
	
	public void TestPlaindrome(){
		palindrome("MALAYALAM");
	}

	//Method to evaluate the given string Palindrome or not?
	public void palindrome(String s1) 	
	{
		//Length of input string
		int len = s1.length();
		
		//loop to reverse the input string and store in s2
		for(int i = len-1 ;i>=0;i--)
		{
			s2 = s2 +s1.charAt(i);
		}
		
		//if clause to evaluate palindrome of string s1 and s2
		if(s1.equals(s2)) 
			System.out.println("palindrome");
		else
			System.out.println("Not Palindrome");
	
	}
	
}


