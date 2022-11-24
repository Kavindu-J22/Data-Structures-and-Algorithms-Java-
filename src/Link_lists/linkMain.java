package Link_lists;

	// This is for Understanding purpose(Small Application)
	// How to Connect this Links together
	// Whatever, next step is linkList.java Cording
	
public class linkMain {
	public static void main(String[] args) {
		linkx l1 = new linkx(20);
		linkx l2 = new linkx(30);
		linkx l3 = new linkx(40);
		linkx l4 = new linkx(50);
		
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
	}

}
