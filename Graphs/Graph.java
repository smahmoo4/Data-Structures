import java.util.*;

class Graph {
	
	private int vertices;
	private HashMap<Integer, LinkedList<Integer>> adj;
	
	Graph(int v) {
		this.vertices = v;
		this.adj = new HashMap<Integer,LinkedList<Integer>>();
		for(int i = 1; i <= v; i++){
			adj.put(i, new LinkedList<Integer>());
		}
	}
	
	void addEdge(Integer v, Integer w){
		LinkedList<Integer>ll = adj.get(v);
			ll.addLast(w);
	}
	
	
	void breadthFirstSearch(int s){
		
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.add(s);
		visited.add(s);
				
		while(queue.size() > 0) {
			int next = queue.poll();
			System.out.print(next+" ");
			Iterator<Integer> iterator = adj.get(next).listIterator();
			while(iterator.hasNext()) {
				int n = iterator.next();
				if(!visited.contains(n)){
					visited.add(n);
					queue.add(n);
 				}				
			}
		}
	}
	
	void depthFirstSearch(int s, HashSet<Integer>visited, Stack<Integer> stack) {
		while(!stack.isEmpty()){
			int next = stack.pop();
			System.out.print(next + " ");
			Iterator<Integer> iterator = adj.get(next).listIterator();
			while(iterator.hasNext()){
				int n = iterator.next();
				if(!visited.contains(n)) {
					stack.push(n);
					visited.add(n);
					depthFirstSearch(n, visited, stack);
				}
			}
		}
	}
	
	void dfs(int s){
		HashSet<Integer> visited = new HashSet<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(s);
		visited.add(s);
		depthFirstSearch(s, visited, stack);
	}
	
	public static void main(String[] args) {
		Graph graph = new Graph(7);
		graph.addEdge(1, 2);
		graph.addEdge(2, 1);
		graph.addEdge(2, 7);
		graph.addEdge(7, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 2);
		graph.addEdge(3, 6);
		graph.addEdge(6, 3);
		graph.addEdge(7, 5);
		graph.addEdge(5, 7);
		graph.addEdge(6, 7);
		graph.addEdge(7, 6);
		graph.addEdge(5, 4);
		graph.addEdge(4, 5);

		graph.breadthFirstSearch(2);
		System.out.println();
		graph.dfs(2);
	}
}