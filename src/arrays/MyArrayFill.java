package arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MyArrayFill {
	
	@Test
	
	public void arrayFillTest() {
		arrayFill("Assigned");
	}
	
	public void arrayFill(String s){
        
        String[] myArr = new String[10];
        Arrays.fill(myArr, s);
        for(String str:myArr){
            System.out.println(str);
        }
    }

}
