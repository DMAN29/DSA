class Stack {
	//Stack implementation in Java

	private int arr[];
	private int top;
	private int container ;
	
	// Constructor
	Stack(int size){
		arr = new int[size];
		top = -1;
		container = size;
	}
	
	
	// push operation
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is full \"conditon overflow applied \" ");
			System.exit(1);
		}
		arr[++top] = element;
		
				
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty \" condition underflow applied \" " );
			System.exit(1);
		}
		return arr[top--];
	}
	public Boolean isFull() {
		return top == container-1;
	}
	public Boolean isEmpty() {
		return top == -1;
	}
	
	public void stackDisplay() {
		for(int i =0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Stack s1 = new Stack(5);
		s1.push(10);
		
		s1.stackDisplay();
		s1.push(20);
		s1.push(100);
		System.out.println("Display");
		s1.stackDisplay();

		s1.pop();
		System.out.println("display after pop");
		s1.stackDisplay();
	}
}


