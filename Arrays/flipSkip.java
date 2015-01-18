/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

/**
 *
 * @author Saaduddin
 */
class flipSkip {
	public static void main(String[] args) throws Exception {
		int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		Print(flipSkip(arr,2));
	}

	//this method flips n elements, and skips n elements
	
	public static int [] flipSkip(int [] arr, int n) throws Exception
	{
		for (int i = 0; i <arr.length; i+=(n*2)) {
			reverseSegment(arr,i,i+n-1);
			//Print(arr);
		}
		return arr; 
	}
	
	public static int[] reverseSegment(int [] arr, int start, int end) throws Exception
	{
	if(arr.length==0)
            return arr; 
	if(start>=arr.length || end>=arr.length)
		{
		throw new Exception("Index Out of Bounds"); 
		}

		for (int i = 0; i <(end-start); i++) {
		swap(arr, start+i, end-i);
		} 
				
	return arr;
			}
	
	public static void swap(int [] arr, int a, int b)
	{
	int temp = arr[a];
	arr[a]=arr[b];
	arr[b]= temp; 
	}
	
	private static String Print(int[] arr)
		{
                    String p = "";
			for(int k = 0; k<arr.length; k++)
				{
					p+= "" + (arr[k] + ",");
		
                                }
                        p+= "" + "---";
		System.out.print(p);
                
                return p;
		}

}// end of class