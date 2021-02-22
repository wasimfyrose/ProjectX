package test;

import java.util.Scanner;

public class JavaLoops {
	
	int a=0; int b=3; int n =0;
	Scanner sc = new Scanner(System.in);
	
	public  void method1() {
		System.out.println("Enter the Value:");
		int finnum= sc.nextInt();
		System.out.println("Enter the b:");
		b= sc.nextInt();
		System.out.println("Enter the limit:");
		n= sc.nextInt();
		int j=0;
		for(int i=j+1;i<n;i++) {
			if((i%2)==0) {
		finnum = (finnum +(b*i));
		System.out.print(" "+finnum);
		}
			else {
				System.out.println("5");
			}
			}
		
	}
	
	public static void baseic()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("t = ");
        int t=sc.nextInt();
        double val =Math.pow(-2, 63);
        double val1 = Math.pow(2, 63);
        
        long Int = (long) Math.pow(-2, 31);
        long Int1 = (long) Math.pow(2, 31);
        System.out.println(Int + Int1);
        
        for(int i=0;i<t;i++)
        {

            try
            {
            	System.out.println("Enter X values");
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                
                if(x>=-128 && x<=127) {
                	
                	System.out.println("* byte");
                	
                }
                else if(x>=-32768 && x<=32767 && x>=val && x<=(val1-1) &&  x>=Int && x<=(Int1-1)) {
                	System.out.println("* short");
                	System.out.println("* int");
                	System.out.println("* long");
                	
                }
                else if( x>=val && x<=(val1-1) &&  x>=Int && x<=(Int1-1)) {
                	
                	System.out.println("* int");
                	System.out.println("* long");
                	
                }
                
                else if(x>=-Math.pow(2, 31) && x<=Math.pow(2, 31)){
                    System.out.println("* long");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
                System.out.println(e);
            }}
        }
	public static void main(String[] args) {
		/*
		 * JavaLoops jl = new JavaLoops(); jl.method1();
		 */
JavaLoops.baseic();
	}

}
