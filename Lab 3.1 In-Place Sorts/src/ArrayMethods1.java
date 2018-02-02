
// Ava DiPietro
// 2/1/18

public class ArrayMethods1 {
	
	public static void main(String args[]) {
		int[] list1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double[] list2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String[] list3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		//insertionSort(list1); COMPLETE?
		//selectionSort(list2);
		//bubbleSort(list3); COMPLETE
	}
	
	/*Insertion takes each element from the array,
	 *  and adds it to the front of the array in the
	 *   correct order. We need to keep track of where
	 *    we are inserting elements as we sort. */
	
	// It does it backwards and somehow works? Aight
	public static void insertionSort(int[] list) {
		for (int y = 0; y < list.length; y++) {
			for (int x = 0; x <= y; x++) {
				if (list[y] < list[x]) {
					swapInt(list, x, y);
				}
			}
		}
		for (int l : list) {
			System.out.println(l);
		}
	}
	
	/*Selection sort finds the lowest element and
	 *  moves it to the front of the array. Then 
	 *  searches the rest of the array for the next
	 *   element, and repeats.*/
	
	public static void selectionSort(double [] list) {
		int w = 0;
		for (int x = 1; x < list.length; x++) {
			double lowest = list[w];
			if (list[x] < lowest) {
				swapDouble(list, x, w);
				int p = x;
				w = p;
				lowest = list[p];
			}
		}
		
		for (double l : list) {
			System.out.println(l);
		}
		
		/*
		int y = 0;
		int c = 1;
		while (c != 0) {
			c = 0;
			while (y != list.length) {
				y = 0;
				for (int x = 1; x < list.length - 1; x++) {
					System.out.println("x = " + x);
					System.out.println("y = " + y);
					System.out.println("c = " + c);
					if (list[x] < list[y]) {
						swapDouble(list, x, y);
						c++;
					}
					else {
						y++;
					}
				}
			}
		}
		for (double l : list) {
			System.out.println(l);
		}*/
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