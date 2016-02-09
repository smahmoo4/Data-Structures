import java.util.Arrays;
import java.util.Random;


//USING EXTRA SPACE ON EACH RECURSIVE CALL
class Mergesort2 {
	public static void main(String[] args) {
		int [] arr = generate(10);
		System.out.print("Before: ");
		printArray(arr);
		mergeSort(arr);
		System.out.print("After : ");
		printArray(arr);
	}
	
	public static void printArray(int [] arr){
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int [] generate(int size){
		int [] arr = new int[size];
		
		Random random = new Random();
		
		for(int i = 0; i< arr.length; i++){
			arr[i] = random.nextInt(100);
		}
		
		return arr;
	}
	
	public static void mergeSort(int [] arr){
		if(arr.length < 2){
			return;
		}
		
		int mid = arr.length/2;
		int [] left = Arrays.copyOfRange(arr, 0, mid);
		int [] right = Arrays.copyOfRange(arr, mid, arr.length);		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
	}
	
	public static void merge(int [] left, int [] right, int [] arr) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<left.length && j < right.length){
			if(left[i] <= right[j]){
				arr[k] = left[i];
				i++;
				k++;
			}
			
			else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i < left.length){
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < right.length){
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}