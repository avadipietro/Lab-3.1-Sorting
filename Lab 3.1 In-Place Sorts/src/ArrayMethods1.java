// Ava DiPietro
// 2/2/18


public class ArrayMethods1 {
	
	public static void main(String args[]) {
		int[] list1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double[] list2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String[] list3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		//insertion sort test
		System.out.println("insertion sort {");
		long start = System.nanoTime();
		insertionSort(list1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("} took " + time + " nanoseconds\n");
		
		//Selection Sort Test
		System.out.println("selection sort {");
		start = System.nanoTime();
		selectionSort(list2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("} took " + time + " nanoseconds\n");
			
		//Bubble Sort Test
		System.out.println("bubble sort {");
		start = System.nanoTime();
		bubbleSort(list3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("} took " + time + " nanoseconds\n");
	}
	
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
	
	public static void selectionSort(double [] list) {	
		for (int x = 0; x < list.length; x++) {
			for (int y = x; y < list.length; y++) {
				if (list[y] < list[x]) {
					swapDouble(list, x, y);
				}
			}
		}		
		for (double l : list) {
			System.out.println(l);
		}		
	}
	
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