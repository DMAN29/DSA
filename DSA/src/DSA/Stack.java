package DSA;

public class Stack {
	private int[] arr;
	private int top;
	private int capacity;
	
	Stack(int size){
		arr = new int[size];
		top = -1;
		capacity = size;
	}
	
	public void push(int val) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			System.exit(0);
		}
		arr[++top] = val;
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return arr[top--];
	}
	
	public boolean isFull(){
		return top == capacity-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void displayStack() {
		for(int i = 0 ; i < top+1;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	public int peek() {
		return arr[top];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(5);
		System.out.println( s.isEmpty());
		System.out.println(s.isFull());
//		s.pop();
		s.push(10);
		System.out.println( s.isEmpty());
		System.out.println(s.isFull());
		System.out.println(s.peek());
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println( s.isEmpty());
		System.out.println(s.isFull());
		System.out.println(s.peek());
		s.displayStack();
		s.push(70);
	}

}
