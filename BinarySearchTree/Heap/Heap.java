class Heap {
	
	private HeapNode root;
	
	
	private void lookup(HeapNode root, int data) {
		System.out.println("HeapNode address: " + root + " | data: "+ root.data);
		if(root.data == data){
			System.out.println("Found at address : " + root);
		}
		else  {
			lookup(root.leftChild, data);
			lookup(root.rightChild, data);
		}
	}
	
	private void addHeapNode(HeapNode node){
		if(node.data <= root.data) {
			root.leftChild == null ? root.rightChild = node : root.leftChild = node;
		}
		
		if(node.data > root.data) {
			swap(node.data, root.data);
			root.parent = node;
		}
	}
	
	private void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.root = new HeapNode(20);
		heap.addHeapNode(heap.root);
		HeapNode node1 = new HeapNode(30);
		heap.addHeapNode(node1);
		System.out.println(heap.root.data);
	}
	
	
}