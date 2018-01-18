
public class ArrayMethods1 {
	
	public static void main(String args[]) {
		int[] list1 = {1, 2, 3, 4};
		swapInt(list1, 2, 3);
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
		
	}
	
	/* Bubble sort iterates through the list, swapping
	 *  any out of order elements. We keep iterating until
	 *  no swaps are required. Then the array is sorted! */
	
	public static void bubbleSort(String [] list1) {
		
	}
	public static void swapInt(int[] list1, int x, int y) {
		int z = x;
		// x = 2, y = 3, z = 2
		list1[x] = list1[y];
		list1[y] = z;
		
		for (int i = 0; i < list1.length; i++) {
			System.out.println(list1[i]);
		}
	}
	public static void swapDouble(double[] list1, int x, int y) {
		int z = x;
		list1[x] = list1[y];
		list1[y] = list1[z];
	}
	public static void swapString(String[] list1, int x, int y) {
		int z = x;
		list1[x] = list1[y];
		list1[y] = list1[z];
	}
}