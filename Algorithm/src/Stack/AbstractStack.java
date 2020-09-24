package Stack;

class Stacks<T>{
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() throws Exception {
		if(top == null) {
			throw new Exception();
		}
		
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top =t;
	}

	public T peek() throws Exception {
		if(top == null) {
			throw new Exception();
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top ==null;
	}
}	

public class AbstractStack {
	public static void main(String[] args) {
		Stacks<Integer> st = new Stacks<Integer>();
		st.push(1);
		st.push(5);
		
	}
}
