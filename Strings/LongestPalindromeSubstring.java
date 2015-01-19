class LongestPalindrome{
	public static void main(String[] args) {
		String x = "abcbadfghahgf";

		System.out.println(longestPalindromeSubstring(x));
	}

	public static String longestPalindromeSubstring(String str){
		String maxSub = "";
		for (int i = 0;i<str.length(); i++) {
			for(int j = i; j<str.length(); j++){
				String x = str.substring(i,j+1);
				if(isPalindrome(x))
					if(x.length() > maxSub.length())
						maxSub = x;
			}
		}

		return maxSub; 
	}

	public static boolean isPalindrome(String str){
		for (int i = 0;i<str.length()/2;i++) {
			if(str.charAt(i)!= str.charAt(str.length()-1-i))
				return false;
		}

		return true;
	}

}