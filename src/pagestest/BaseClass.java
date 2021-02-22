package pagestest;

import java.text.NumberFormat;
import java.util.Scanner;

public class BaseClass  {
	Scanner sc = new Scanner(System.in);
	public void m1() {
		int a[] = new int[] { 1, 2, 3, 5 };
		int b[] = new int[] { 5, 2, 3, 1 };
		int len = a.length;

		for (int i = 0; i < len; i++) {
			a[i] = a[i] * b[i];
			b[i] = a[i] / b[i];
			a[i] = a[i] / b[i];
			/*
			 * a[len]=a[i]; a[i]=b[i];
			 */
			System.out.println(a[i] + "   " + b[i]);

		}
	}

	public void m2() {
		String s = "String";
		int len = s.length();
		String a[] = new String[10];
		/*
		 *
		 */
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sb1 = new StringBuilder();
		String op = sb.reverse().toString();
		System.out.println(op);
		System.out.println(s.charAt(2));
		for (int i = 0; i < len; i++) {
			char c = sb.charAt(i);

		}
		// char b[] = a[len-1];

	}

	public void m3() {
		String s = "BEEB";
		StringBuilder sb = new StringBuilder(s);
		String reversedS = sb.reverse().toString();
		int n = sb.length();

		if (s.equalsIgnoreCase(reversedS)) {
			System.out.println("Palindrom daww");
		} else {
			System.out.println("Mooditu velaya paaruda");
		}

	}

	public void m4() {
		String qs[] = new String[] {"BEEB"};

		String s[] = new String[] {"B","E","E","B"};
		//		  long n =s.length;
		int n= s.toString().length();
		char b[] =qs.toString().toCharArray();
		int as= b.length;
		for(int i=as;i<as;i++) {
			char c = qs.toString().charAt(i);
			/* if(s.toString().equalsIgnoreCase()) */
		}



	}

	public void fibaSeries() {
		int a,b,c,n;
		a=0;
		b=1;

		n=12;
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;

			System.out.println("Fibanocci Series: "  + a
					);
		}

	}
	public void multiInp() {
		/*
		 * System.out.println("How many elements: "); int n = sc.nextInt();
		 */

		String ip[] = new String[] {"w","a","s","i","m"};
		int n=ip.length;
		String op [] = new String[n];

		for(int i=0;i<n;i++) {
			if(i%2 == 0) {

				System.out.println(ip[i].toString().substring(i));

			}
			else {
				System.out.println(op[i] = ip[i].toString().substring(i));

				
			}
		}
		/*
		 * for(int i=0;i<n;i++) { if(i%2==0) { System.out.println("Even Elements:"
		 * +op[i].toString().substring(i)); } else {
		 * System.out.println("Odd Elements: "+ op[i].toString().substring(i)); }
		 */}




	public static void main(String[] args) {
		/*
		 * Thread th = new Thread(); th.run();
		 */
		BaseClass bc = new BaseClass();

		/* bc.m1(); */
		/* bc.m2(); */
		/* bc.m3(); */
		/* bc.m4(); */
		bc.multiInp();
		/* bc.fibaSeries(); */

	}
}