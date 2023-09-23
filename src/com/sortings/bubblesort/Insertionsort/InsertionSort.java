package com.sortings.bubblesort.Insertionsort;

public class InsertionSort {

	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		// Insertion sort
		// basically, array is divided into two parts 1. sorted part and 2. unsorted
		// part.
		// placing elements from the unsorted part to sorted part at its right place.
		int array[] = { 7, 8, 3, 1, 2 };
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;

			}
			// placement
			array[j + 1] = current;

		}
		System.out.println("sorted elements with Insertion sort.");
		printArray(array);
	}

}
