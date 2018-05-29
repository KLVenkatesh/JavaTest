package arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MyArraySort {
	
	@Test
	public void ArraySortTest() {
		int[] myArr = {3,2,56,12,98,23,56};
		ArraySort(myArr);
	}
	
public void ArraySort(int[] i){		
		Arrays.sort(i);
		for(int str:i){
			System.out.println(str);
		}
	}

}
