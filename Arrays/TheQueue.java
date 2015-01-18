import java.util.Arrays; 
class TheQueue {
	
	public static void main(String[] args) {
			TheQueue q = new TheQueue(10);
			q.enqueue("10");
			q.enqueue("20");
			q.enqueue("40");
			q.enqueue("60");
			q.enqueue("80");
			q.enqueue("30");
			q.enqueue("50");
			q.enqueue("70");
			q.enqueue("90");
			q.enqueue("100");
			q.dequeue();
			q.display();		
			q.dequeue();		
			q.display();	
			q.dequeue();		
			q.display();		
			q.front(); 								q.display();		
												
	}

	String [] queueArray;
	int queueSize; 
	int front= 0;  
	int back = 0; 
	int numItems = 0; 
	
	TheQueue(int size) {
		queueSize = size; 
		queueArray = new String[size];
		Arrays.fill(queueArray, "-1");
	}
	
	public void enqueue(String t){
		if(numItems <= queueSize){
			queueArray[back] = t; 
			back++; 
			numItems++;
			System.out.println("ENQUEUE: "+ t+" was added to the queue");
		}
		
		else{
			System.out.println("Queue is FULL");
		}
	}
	
	public void dequeue(){
		if(numItems>=0){
			System.out.println("DEQUEUE: "+ queueArray[front]+" was removed from the queue");
			queueArray[front] = "-1";
			front++;
			numItems--; 
		}
		else{
			System.out.println("Queue is EMPTY");
		}
	}
	
	public String front(){
		if(numItems>0){
			System.out.println("FRONT: "+ queueArray[front] + " is at the front of the queue"); 
			return queueArray[front];
		}
		else
			return "-1";	
	}
	
	public void display() {
		for(int i = 0; i<queueSize; i++){
				if(queueArray[i] == "-1")
					continue; 
			System.out.print("["+ queueArray[i] +"] ");
		}
		System.out.println(); 
	}
}