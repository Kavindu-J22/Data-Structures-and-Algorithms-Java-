package Stacks;

public class stackx {
	private int top;
	private int maxsize;
	private double []stackarray;
	
	public stackx(int s){
		top = -1;
		maxsize = s;
		stackarray = new double[maxsize];
	}
	
	// impliment "isfull" method

	public boolean isfull() {
		return (top == (maxsize-1));
	}
	
	// impliment "isEmpty" method
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	// impliment "push" method
	
	public void push(double x) {
		if(isfull())
			System.out.println("Stack is full");
		else {
			top++;
			stackarray[top] = x; // or stackarray[++top]=x;
		}
	}
	
	// impliment "pop" method
	
	public double pop(){
		if(isEmpty())
			return -99;
		else {
			double y = stackarray[top];
			top--;
			return y; // or return stackarray[top--];
		}	
	}
	
	// impliment "peek" method
	
	public double peek() {
		if(isEmpty())
			return -99;
		else
			return stackarray[top];
	}
	
}
