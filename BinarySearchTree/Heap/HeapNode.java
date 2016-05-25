class HeapNode {
	protected int data;
	protected HeapNode leftChild;
	protected HeapNode rightChild;
	protected HeapNode parent;
	
	public HeapNode(int d) {
		this.data = d;
	}
	
	private HeapNode(int d, HeapNode lC, HeapNode rC, HeapNode p) {
		this.data = d;
		this.leftChild = lC;
		this.rightChild = rC;
		this.parent = p;
	}
	
	private HeapNode getLeftChild() {
		return this.leftChild;
	}
	
	private HeapNode getRightChild() {
		return this.rightChild;
	}
	
	private HeapNode getParent() {
		return this.parent;
	}
	
	private int getData() {
		return this.data;
	}
	
	private void setLeftChild(HeapNode lC) {
		this.leftChild = lC;
	} 
	
	private void setRightChild(HeapNode rC) {
		this.rightChild = rC;
	} 
	
	private void setParent(HeapNode p) {
		this.parent = p;
	} 
	
	private void setData(int d) {
		this.data = d;
	} 
	
	private boolean equals(HeapNode other) {
		return (this.data == other.data)	&& 
		(this.parent == other.parent)		&& 
		(this.leftChild == other.leftChild)	&& 
		this.rightChild == other.rightChild;
	}
}