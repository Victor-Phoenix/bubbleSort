package bubbleSort;

public class bubble {
	public static void sortByBubble(int [] array) {
		for(int j =array.length-1; j> 0; j--) {

			for(int i =0; i < j; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i+1];
					array[i+1] = array[i]; 
					array[i] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] array = {29, 10, 14, 37, 13, 18, 2, 5, 42, 33};
		sortByBubble(array);

		System.out.println("Sorted array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
