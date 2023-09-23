package com.sortings.selectionsort;

public class SelectionSort {

	public static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = { 7, 8, 3, 1, 2 };
		// Selection sort
		// time complexity=O(n^2) which is not optimum for sorting but it is important
		// to learn.

		for (int i = 0; i < array.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[smallest] > array[j]) {// array[smallest] <array[j] for descending order sorting.
					smallest = j;

				}
			}
			// swap
			int temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
		System.out.println("After sorting with selection sort: ");
		printArray(array);
	}

}
