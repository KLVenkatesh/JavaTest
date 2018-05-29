package arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BinarySearchOnCharArray {

	@Test
	public void binarySearchTest() {
		binarySearch(0, 'q');
	}
	
	public void binarySearch(int i, char j) {
		char[] chrArr = {'a','c','d','y','e','q','b'};
		int index = Arrays.binarySearch(chrArr, i, chrArr.length-1, j);
		System.out.println(index);
	}

}
