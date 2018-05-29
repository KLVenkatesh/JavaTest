package javaexercise;

public class palindromeTest {
	String s2="";

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
	
	public static void main(String[] args) {
		palindromeTest p1 = new palindromeTest();
		p1.palindrome("liril");
	}

}


