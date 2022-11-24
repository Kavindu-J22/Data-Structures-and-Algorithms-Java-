package Queues;

public class QueMain {
	public static void main(String[] args) {
		queus q1 = new queus(3);
		
		q1.insert(43);
		q1.insert(93);
		q1.insert(63);
		q1.insert(33);
		
		System.out.println(q1.peekfront());	
		
		while(!q1.isempty()) {
			q1.remove();
		}
		
		System.out.println(q1.peekfront());
	}

}
