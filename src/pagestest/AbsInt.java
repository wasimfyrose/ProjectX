package pagestest;

public class AbsInt {
	
	public void m1() {
		int a[]= {1,-2,4,0,10,-6,23,7,-9};
		int n = a.length;
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		System.out.println("Positive Numbers");
		for(int i=0;i<a.length;i++) {
			if(a[i]>0 && a[i]!=0) {
				b[i] =a[i];
				
				System.out.println(b[i]);
			}}
		System.out.println("Negative Numbers");
			for(int i=0;i<a.length;i++) {
			if(a[i]<0 && a[i]!=0) {
				c[i] =a[i];
			
				System.out.println(c[i]);
			}
			
			
			
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		AbsInt ab = new AbsInt();
		ab.m1();
	}

}
