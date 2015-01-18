class QuickSort{
	public static void main(String[] args) {
		
		int [] arr = {1,4,5,0,-2,2,7,-3};
		quickSort(arr,0, arr.length-1);
		PrintArray(arr);
	}

	public static void quickSort(int [] arr, int low, int high){

		if(arr.length == 0)
			return;
		
		if(low>=high)
			return; 

		int middle = low + (high-low)/2;
		int pivot = arr[middle];

		int i = low;
		int j = high; 
		while(i<=j){
			while(arr[i] < pivot){
				i++;
			}

			while(arr[j] > pivot){
				j--;
			}

			if(i<=j){
				swap(arr, i, j);
				i++;
				j--;
			}

			if(low < j)
				quickSort(arr, low, j);

			if(high> i)
				quickSort(arr, i, high);
		}
	}

	public static void swap(int [] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp; 
	}

	public static void PrintArray(int [] arr){
		for (int i = 0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}