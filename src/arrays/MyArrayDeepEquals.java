package arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MyArrayDeepEquals {
	
	@Test
	public void arrayEqualsTest() {
		arrayEquals();
	}
	
	public void arrayEquals(){
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        String[] strArrCopy = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        System.out.println("Are strArr and strArrCopy same? "
                    +Arrays.deepEquals(strArr, strArrCopy));
        String[] strArrMod = {"JAVA", "C++", "PERL", "STRUTS"};
        System.out.println("Are strArr and strArrMod same? "
                    +Arrays.deepEquals(strArr, strArrMod));
    }

}
