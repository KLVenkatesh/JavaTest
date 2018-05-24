package arrays;

import java.util.Arrays;

public class BinarySearchOnCharArray {

	public static void main(String[] args) {
		char[] chrArr = {'a','c','d','y','e','q','b'};
		int index = Arrays.binarySearch(chrArr, 0, chrArr.length-1, 'q');
		System.out.println(index);
	}

}
