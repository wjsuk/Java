package org.Arashio.looptraining;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Prime number counter");
		int range = 122;
		int[] array = new int[range-1];
		for (int i = 0; i < range-1; i++) {
			array[i] = i+2;
		}
		int maxinum = array[range-2];
		for (int i = 0; array[i]*array[i] <= maxinum; i++) {
			if (array[i] == 0)
				continue;
			 for (int j = i+1; j < range-1; j++) {
				 if (array[j] == 0) {
					 continue;
				 }
				 if (array[j]%array[i] == 0) {
					 array[j] = 0;
				 }
			 }
		}
		System.out.println("The list of prime numbers: ");
		for (int i = 0; i < range-1; i++) {
			if (array[i] != 0)
				System.out.println(array[i]);
		}
	}

}