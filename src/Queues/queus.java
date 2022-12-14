package Queues;

public class queus {
	private int front;
	private int rear;
	private int maxsize;
	private int []quearray;
	private int nitems;
	
	public queus(int s) {
		front = 0;
		rear = -1;
		maxsize = s;
		quearray = new int[maxsize];
		nitems = 0;
	}
	
	// impliment "isfull" method
	
	public boolean isfull() {
		return(rear==(maxsize-1));
	}
	
	// impliment "isempty" method
	
	public boolean isempty() {
		return nitems == 0;
	}
	
	// impliment "insert" method
	
	public void insert(int x) {
		if(isfull())
			System.out.println("Queue is full..!");
		else {
			quearray[++rear] = x;
			nitems++;
		}

	}

		// impliment "Circular Queue insert" method
	
		public void cinsert(int x) {
			if(nitems == maxsize-1)
				System.out.println("Circular Queue is full..!");
			else {
				if(rear==maxsize-1)
					rear=0;
				else
					rear++;
				
				quearray[rear]= x;
				nitems++;
			}		
		}
	
	// impliment "remove" method
	
	public int remove() {
		if(isempty()) {
			System.out.println("Queue is Empty..!");
			return -99;
		}

		else {
			nitems--;
			return quearray[front++];
		}
	}

		// impliment "Circular Queue remove" method
	
		public int cremove() {
			if(isempty()) { // or nitems == 0
				System.out.println("Queue is Empty..!");
				return -99;
			}	
			else {
				nitems--;
				int x = quearray[front];
				
				if(front == maxsize-1)
					front = 0;
				else
					front++;
				
				return x;
			}
		}

	
	// impliment "peekfront" method
	
	public int peekfront() {
		if(isempty()) {
			System.out.println("Queue is empty..!");
			return -99;
		}
		else
			return quearray[front];
	}
}
