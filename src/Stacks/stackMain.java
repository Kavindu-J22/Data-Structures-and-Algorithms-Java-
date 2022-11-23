package Stacks;

public class stackMain {
	public static void main(String[] args) {
		stackx mystack = new stackx(5);
		
		mystack.push(12);
		mystack.push(11);
		mystack.push(16);
		mystack.push(18);
		mystack.push(15);
		mystack.push(154);
		mystack.push(188);
		mystack.push(1548);
		
		
		while(!mystack.isEmpty()) {
			System.out.println(mystack.peek());
			mystack.pop();
		}
	}
}
