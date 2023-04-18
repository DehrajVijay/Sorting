package com.sortings.bubblesort;

public class BubbleSort {
	static int array[] = { 7, 8, 3, 1, 2 };

	public static void printArray(int array[]) {
		System.out.println("Original list of elements are:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
		ascendingOrder(array);
		System.out.println();
		descendingOrder(array);
	}

	public static void ascendingOrder(int array[]) {

		// time complexity=O(n^2) which is not good for sorting.
		// sorting, using bubble sort.
		// outer loop will count the n-1 elements.
		for (int i = 0; i < array.length - 1; i++) {// Outer loop runs n-1 times.
			// loop other than sorted elements.
			for (int j = 0; j < array.length - i - 1; j++) {
				// length-i represents the sorted elements with every value
				// of i: if i=0 no element is sorted and so on
				if (array[j] > array[j + 1]) { // index is 'j' because comparing the elements which are at index j, 'i'
												// is
												// just a counter.
					// swap
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}

			}
		}
		System.out.println("Ascending order:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void descendingOrder(int array[]) {

		// time complexity=O(n^2) which is not good for sorting.
		// sorting, using bubble sort.
		// outer loop will count the n-1 elements.
		for (int i = 0; i < array.length - 1; i++) {// Outer loop runs n-1 times.
			// loop other than sorted elements.
			for (int j = 0; j < array.length - i - 1; j++) {
				// length-i represents the sorted elements with every value
				// of i: if i=0 no element is sorted and so on
				if (array[j] < array[j + 1]) { // index is 'j' because comparing the elements which are at index j, 'i'
												// is
												// just a counter.
					// swap
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}

			}

		}
		System.out.println("Descending Order:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void main(String[] args) {

		// Method calling.
		printArray(array);

	}
}
