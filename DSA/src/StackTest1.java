

public class StackTest1 {
	private String names[];
	private int  top;
	private int store;
	
	
	StackTest1(int size){
		names = new String[size];
		top = -1;
		store = size;
	}
	
	Boolean isEmpty() {
		return top == -1;
	}

	Boolean isFull() {
		return top == store -1;
	}
	
	void push(String s) {
		if(isFull()) {
			System.out.println("OverFlow");
			System.exit(1);
		}
		names[++top] = s;
	}
	
	String pop() {
		if(isEmpty()) {
			System.out.println("UnderFlow");
			System.exit(1);
		}
		return names[top--];
	}
	
	
	void StringDisplay() {
		for(int i =0; i<= top; i++) {
			System.out.println(names[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StackTest1 str = new StackTest1(5);
		str.push("Rajan");
		str.push("Mohan");
		str.push("Palak");
		str.push("Elon");
		str.push("Tony");
		str.StringDisplay();
		
		str.pop();
		str.pop();
		System.out.println("display 2.0");
		str.StringDisplay();
		
		
		
	
	
	}

}
