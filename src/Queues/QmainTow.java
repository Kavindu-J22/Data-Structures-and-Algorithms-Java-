package Queues;

import java.util.Scanner;

public class QmainTow {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Queue Array Size : ");
		int a = ob.nextInt();
		
		queus q2 = new queus(a);
		
		int i,y,e = 1,z;
		String con,anw = null;
		
		for(i=0 ; i<a ; i++) {
			System.out.println("Enter index "+(i+1)+" Value : ");
			y = ob.nextInt();
			q2.insert(y);
		}
		System.out.println("Queue Stored Sucessfuly..!");
		
		System.out.println("If you want to Check front value in Queue,Enter - F ");
		System.out.println("If you want to Remove values one by one in Queue,Enter - R ");
		System.out.println("If you want to Remove All value in Queue,Enter - A ");
		con = ob.next();

		
		if(con == "F" || con == "f" ) 
			System.out.println(q2.peekfront());
		
		if(con == "R" || con == "r")
			while(anw == "n"||anw == "N" || q2.isempty()) {
				int k = 0;
				System.out.println("Do you want to remove front index "+(k+1)+" Value(y/n) : ");
				anw = ob.next();
				
				if(anw == "Y" || anw == "y") {
					z = q2.remove();
					System.out.println("Remove Current Front Value - "+z);
				}	
				
				if(anw == "N" || anw == "n") {
					System.out.println("Back to Menu -->");
					
					
			// incomplet yet
					
				}
				
			}
	}

}
