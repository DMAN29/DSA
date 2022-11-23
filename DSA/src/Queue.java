
public class Queue {

	private int arr[];
	private int front, rear;
	private int contain;
	
	Queue(int size){
		arr = new int[size];
		front = -1;
		rear = -1;
		contain = size;
	}
	void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
			System.exit(1);
		}
		else {
			if(front == -1) 
				front = 0;
			rear++;
			arr[rear] = data;
		}
	}
	
	int deQueue() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
		 element = arr[front];
	      if (front >= rear) {
	        front = -1;
	        rear = -1;
	      } /* Q has only one element, so we reset the queue after deleting it. */
	      else {
	        front++;
	      }
	      System.out.println("Deleted -> " + element);
	      return element;
	    }
//		return arr[front++];
		
	}
	
	Boolean isFull(){
		return rear == contain -1;
	}
	
	Boolean isEmpty() {
		return front == -1;
	}
	
	void disQueue() {
		for(int i= front; i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		System.out.println("jfkajfkajlfda");
//		System.out.println(q.disQueue());
		System.out.println(q.deQueue());
		
		System.out.println();
		q.deQueue();
		q.enQueue(40);
		q.enQueue(50);
		q.disQueue();
		q.enQueue(40);
		q.enQueue(50);
		q.enQueue(40);
		q.enQueue(50);
		System.out.println("faj");
	}
}
