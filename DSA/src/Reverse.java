import java.util.Scanner;

public class Reverse {
	private char data[];
	private int  top;
	private int store;
	
	Reverse(int size){
		data = new char[size];
		top = -1;
		store = size;

	}
	Boolean isEmpty() {
		return top == -1;
	}

	Boolean isFull() {
		return top == store -1;
	}

	void push(char ch) {
		if(isFull()) {
			System.out.println("OverFlow");
			System.exit(1);
		}
		data[++top] = ch;
		
	}
	
	char pop() {
		if(isEmpty()) {
			System.out.println("UnderFlow");
			System.exit(1);
		}
		return data[top--];
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse a word 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.next();
			
		Reverse rev = new Reverse(word.length());
		for(int i = 0; i <word.length(); i++) {
			rev.push(word.charAt(i));
		}
		
		for(int i=0;i<word.length();i++) {
			System.out.print(rev.pop());
		}
		scan.close();
	}

}
