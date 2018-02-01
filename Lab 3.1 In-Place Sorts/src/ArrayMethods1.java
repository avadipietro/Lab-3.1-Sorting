
public class ArrayMethods1 {
	
	public static void main(String args[]) {
		int[] list1 = {2, 1, 4, 3};
		double[] list2 = {10.0, 11.0, 6.0, 2.0, 10.0, 12.0, 1.0, 2.0, 6.0, 7.0};
		String[] list3 = {"jelly", "egg", "cow", "hay", "mayo", "bread", "fish", "rice", "farm"};
		insertionSort(list1);
		selectionSort(list2);
		//bubbleSort(list3); COMPLETE
	}
	
	/*Insertion takes each element from the array,
	 *  and adds it to the front of the array in the
	 *   correct order. We need to keep track of where
	 *    we are inserting elements as we sort. */
	
	public static void insertionSort(int[] list) {
		
	}
	
	/*Selection sort finds the lowest element and
	 *  moves it to the front of the array. Then 
	 *  searches the rest of the array for the next
	 *   element, and repeats.*/
	
	public static void selectionSort(double [] list) {
		/*int y = 0;
		double lowest = 0.0;
		while (y != list.length) {
			for (int x = 1; x < list.length; x++) {
				lowest = list[y];
				if (list[x] < lowest) {
					swapDouble(list, x, y);
				}
			}
		}
		for (double l : list) {
			System.out.println(l);
		}
		*/
		int y = 0;
		int x = 1;
		double lowest = 0.0;
	}
	
	/* Bubble sort iterates through the list, swapping
	 *  any out of order elements. We keep iterating until
	 *  no swaps are required. Then the array is sorted! */
	
	public static void bubbleSort(String [] list) {
		int count = 1;
		while (count != 0) {
			count = 0;
			for (int x = 0; x < list.length - 1; x++) {
				if (list[x].compareTo(list[x + 1]) > 0) {
					swapString(list, x, x + 1);
					count++;
				}
			}	
		}		
		for (String l : list) {
			System.out.println(l);
		}
	}
	public static void swapInt(int[] list, int x, int y) {
		int z = list[x];
		list[x] = list[y];
		list[y] = z;
	}
	public static void swapDouble(double[] list, int x, int y) {
		double z = list[x];
		list[x] = list[y];
		list[y] = z;
	}
	public static void swapString(String[] list, int x, int y) {
		String z = list[x];
		list[x] = list[y];
		list[y] = z;
	}
}