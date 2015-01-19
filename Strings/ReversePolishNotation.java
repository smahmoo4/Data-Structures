import java.util.Stack;

//this method computes a mathematical operation on the last two elements in the stack
//if no more computations exist, return top of Stack 
// example input = ["2", "1", "+", "3", "*"] -> (2+1) * 3 = 9
// ["4", "13", "5", "/", "+"] -> ((13 / 5)+4) -> 6
class ReversePolishNotation{
	
	public static void main(String[] args) {
		String [] strArr= new String [] {"4", "5", "4", "+", "3", "*", "-"};
		System.out.println(rpn(strArr));
	}

	public static int rpn(String [] arr){
		int returnVal = 0; 
		Stack<String> stack = new Stack<String>(); 
		String ops = "*+/-";
		for (int i =0;i<arr.length;i++) {
			if(!ops.contains(arr[i]))
				stack.push(arr[i]);
			else{
				int a = Integer.parseInt(stack.pop());
				int b = Integer.parseInt(stack.pop()); 
				String s = arr[i];
				switch(s){
					case "*": {
						stack.push(String.valueOf(a*b));
						break; 
					}

					case "+": {
						stack.push(String.valueOf(a+b));
						break;
					}

					case "-": {
						stack.push(String.valueOf(a-b));
						break;
					}

					case "/": {
						stack.push(String.valueOf(a/b));
						break;
					}

					default: 
						break; 
				}
			}
		}

		returnVal = Integer.parseInt(stack.pop());
		return returnVal;
	}
	
}