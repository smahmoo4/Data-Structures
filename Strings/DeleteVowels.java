import java.util.*; 

class deleteVowel {
	public static void main(String[] args) {
		System.out.println(deleteVowel("AEIOUOIOUIEOIUEOIEOUOIEOUOIZ"));
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	public static String deleteVowel(String str){
		
=======
	public static String deleteVowel(String str){		
		char[] arr = str.toCharArray(); 
>>>>>>> FETCH_HEAD
=======
	public static String deleteVowel(String str){		
		char[] arr = str.toCharArray(); 
>>>>>>> FETCH_HEAD
		HashSet<Character> hash = new HashSet<Character>();
		StringBuilder sb = new StringBuilder(); 
		hash.add('a');
		hash.add('e');
		hash.add('i');
		hash.add('o');
		hash.add('u');
		hash.add('A');
		hash.add('E');
		hash.add('I');
		hash.add('O');
		hash.add('U');
		
		for (int i = 0; i < str.length(); i++) {
			if(!hash.contains(str.charAt(i)))
				sb.append(str.charAt(i));
		}
		
		return sb.toString(); 
	}
}
