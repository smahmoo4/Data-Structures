import java.util.Random;
class QuickSort {
	public static void main(String[] args) {
		int [] arr = generate(8);
		
		System.out.print("Before: ");
		printArray(arr);
		quickSort(arr, 0, arr.length-1);
		System.out.print("After : ");
		printArray(arr);
	}
	
	public static void quickSort(int [] arr, int low, int high) {
		
		if(arr == null || arr.length == 0)
			return;
		
		if(low>=high)
			return;
		
		int pivot = arr[low+(high-low)/2];
		//System.out.println("pivot: "+pivot);
		int i = low, j = high;
		
		while(i<=j){
			while(arr[i]<pivot){
				i++;
			}
			
			while(arr[j]>pivot){
				j--;
			}
			
			if(i<=j){
				swap(arr, i, j);
				i++;
				j--;
			}	
		}
		
		if(low < j){
			quickSort(arr, low, j);
		}
		
		if(high > i){
			quickSort(arr, i, high);
		}
	}
	
	public static void swap(int []arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
}