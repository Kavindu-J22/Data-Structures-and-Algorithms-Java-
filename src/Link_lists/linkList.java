package Link_lists;

public class linkList {
	private linkx frist;
	
	public linkList() {
		frist = null;
	}
	
	public boolean isempty() {
		return (frist == null);
	}
	
	
	
	public void insertFrist(int id) {
		linkx nwLink = new linkx(id);
		nwLink.next = frist;
		frist = nwLink;
	}
	
	
	public void DisplayList() {
		if(isempty())
			System.out.println("Link List is Empty..!");
		else {
			linkx current = frist;
			
			while(current != null) {
				current.displayData();
				current = current.next;
			}
		}
	}
	
	
	
	public linkx DeletFrist() {
		linkx temp = frist;
		frist = frist.next;
		return temp;	
	}
	
}

