package pages;

import java.util.Scanner;

public class StdinOut {
	static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values");
		int i =sc.nextInt();
		
		sc.nextLine();
		
		
			s = sc.nextLine();
		
		Double d= sc.nextDouble();
		System.out.println(i);
        System.out.println(d);
        System.out.println(s);
	}

}
