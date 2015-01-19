class PalindromeSubstrings {
	public static void main(String[] args) {
		getPalindromeSubstrings("abbcccdddddcccbba");
		int [] arr = {2,3,2,5,7,2,9,3,2};
		Print(deleteElement(arr,2));
	}
	
	public static void getPalindromeSubstrings(String str){
					 
			for (int i = 0;i<str.length();i++) {
				for(int j = i; j<str.length(); j++) {
					String out = str.substring(i,j+1);
					if(isPalindrome(out) && out.length()>1){
						System.out.println(out);
					}
				}
			}
	}
	
	public static boolean isPalindrome(String str){
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		}
		
		return true;
	}
	
	public static int [] deleteElement(int [] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==val){
				for (int j = i; j < arr.length-1; j++) {
					arr[j] = arr[j+1];
					arr[j+1] = 0;
				}
			}
		}
		return arr; 
	}
	
	private static void Print(int[] arr)
		{
			
		for(int k = 0; k<arr.length; k++)
			{
				System.out.print(arr[k] + ",");
			}	
			
		System.out.println("---");
			
		}

}