
public class ArrayMethods1 {
	
	public static void main(String args[]) {
		int[] list1 = {2, 1, 4, 3};
		double[] list2 = {2.0, 1.0, 4.0, 3.0};
		String[] list3 = {"b", "e", "a", "c", "z", "d"};
		insertionSort(list1);
		selectionSort(list2);
		bubbleSort(list3);
	}
	
	/*Insertion takes each element from the array,
	 *  and adds it to the front of the array in the
	 *   correct order. We need to keep track of where
	 *    we are inserting elements as we sort. */
	
	public static void insertionSort(int[] list1) {
		
	}
	
	/*Selection sort finds the lowest element and
	 *  moves it to the front of the array. Then 
	 *  searches the rest of the array for the next
	 *   element, and repeats.*/
	
	public static void selectionSort(double [] list1) {
		//INDEXOF() !!!
		
		boolean swapped = false;
		double lowest = list1[0];
		while (swapped == false) {
			for (int x = 0; x < list1.length - 1; x++) {
				if (list1[x] > (list1[x + 1])) {
					swapDouble(list1, x, x + 1);
					swapped = false;
				}
				else {
					swapped = true;
				}
			}	
		}		
		for (double l : list1) {
			System.out.println(l);
		}
		
	}
	
	/* Bubble sort iterates through the list, swapping
	 *  any out of order elements. We keep iterating until
	 *  no swaps are required. Then the array is sorted! */
	
	public static void bubbleSort(String [] list1) {
		boolean swapped = false;
		while (swapped == false) {
			for (int x = 0; x < list1.length - 1; x++) {
				if (list1[x].compareTo(list1[x + 1]) > 0) {
					swapString(list1, x, x + 1);
					swapped = false;
				}
				else {
					swapped = true;
				}
			}	
		}		
		for (String l : list1) {
			System.out.println(l);
		}
	}
	public static void swapInt(int[] list1, int x, int y) {
		int z = list1[x];
		list1[x] = list1[y];
		list1[y] = z;
	}
	public static void swapDouble(double[] list1, int x, int y) {
		double z = list1[x];
		list1[x] = list1[y];
		list1[y] = z;
	}
	public static void swapString(String[] list1, int x, int y) {
		String z = list1[x];
		list1[x] = list1[y];
		list1[y] = z;
	}
}