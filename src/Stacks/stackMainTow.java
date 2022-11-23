package Stacks;
import java.util.Scanner;

public class stackMainTow {
	public static void main(String[] args) {

		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Stack Array size : ");
		int mval = ob.nextInt();
		
		stackx st1 = new stackx(mval);
		
		int i;
		double k;
		
		for(i= 0; i < mval ;i++) {
			System.out.println("Enter index "+(i+1)+" number : ");
			k = ob.nextDouble();
			st1.push(k);	
		}
		
		System.out.println("Stack Stored Successfully..!");
		
		
	}
}
