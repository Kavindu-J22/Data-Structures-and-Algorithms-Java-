package Link_lists;

public class MylinkMain {
	public static void main(String[] args) {
		linkList lk1 = new linkList();
		
		lk1.insertFrist(10);
		lk1.insertFrist(20);
		lk1.insertFrist(30);
		lk1.insertFrist(40);
		lk1.insertFrist(50);
		
		lk1.DisplayList();
		
		System.out.println(" "); // for space
		
		while(!lk1.isempty()) {
			linkx val = lk1.DeletFrist();
			System.out.print("Deleted - ");
			val.displayData();
		}
		
		lk1.DisplayList();
			
	}

}
