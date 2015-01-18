import java.util.Arrays;

//Array Implementation of The Stack
class TheStack{
	
	public static void main(String [] args){
		TheStack st = new TheStack(10);
		st.push("10");
		st.push("25");
		st.push("30");
		st.push("50");
		st.push("70");
		st.push("65");
		st.push("13");
		st.push("20");
		st.push("15");
		st.push("27");
		st.top();
		st.display(); 
		
	}
		String [] stackArray;
		int stackSize;

		int topOfStack = -1; 

		public TheStack(int size) {
			stackSize = size; 
			stackArray = new String[size];
			Arrays.fill(stackArray, "-1");
		}

		public void push(String t) {
			if(topOfStack+1<stackSize){
				topOfStack++; 
				stackArray[topOfStack] = t; 
			}
			else
				System.out.println("Stack is Full!");
		}

		public void pop() {
			if(topOfStack>=0) {
				System.out.println("POP: "+ stackArray[topOfStack] +" was removed.");
			    stackArray[topOfStack] = "-1";
				topOfStack--;
			}
			else 
				System.out.println("Stack is Empty!"); 
		}

		public String top() {
			if(topOfStack>=0) {
				System.out.println("TOP: "+stackArray[topOfStack] +" is at the top of the stack");
				return stackArray[topOfStack];
			}
			else {
					System.out.println("Stack is Empty!");
					return "-1"; 
			}
		}
		
		public void display() {
			for(int i = 0; i<stackSize; i++){
					if(stackArray[i] == "-1")
						continue; 
				System.out.print("["+ stackArray[i] +"] ");
			}
		}
}