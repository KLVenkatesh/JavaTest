package arrays;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ArraysToList {
	
	@Test
	public void arrayListTest() {
		arrayList();
		
	}

	public void arrayList() {
		
		String strArr[] = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
		List<String> strList = Arrays.asList(strArr);
		System.out.println(strList.size());
		System.out.println(strList);
		
	}

}
