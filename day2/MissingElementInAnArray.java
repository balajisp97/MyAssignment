package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr);
		int n=0;

		for (int i = 0; i < arr.length; i++)
		{
			n++;

			if(n != arr[i])
			{
				System.out.println("Missing element : " + n);
				break;
			}
		}
	}
}
