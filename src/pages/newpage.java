package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class newpage implements ModelInterface {
	Scanner sc = new Scanner(System.in);
	String val;
	
	
	public void methodone() {
		List<String> li = new ArrayList<String>();
		System.out.println("Enter the value to add:");
		int n=sc.nextInt();
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++) {
			String val = sc.nextLine();
			li.add(i, val);
			
		}
		
		li.forEach(str-> System.out.println(val));
	
		
	}
	
	
	 
	public static void main(String[] args) {
		newpage np = new newpage();
		np.methodone();
		np.fwace();
		ModelInterface sum =(a,b)-> a+b;
		System.out.println("answer:"+sum.ask(4, 6));
	}


	@Override
	public int ask(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
