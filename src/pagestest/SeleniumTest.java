package pagestest;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	/*
	 * static WebDriver driver;
	 * 
	 * public void selOne() { System.setProperty("webdriver.chrome.driver",
	 * "D:\\Browerdriver\\chromedriver.exe"); WebDriver Chromedriver = new
	 * ChromeDriver(); driver.manage().window().fullscreen();
	 * driver.get("www.google.com"); }
	 */

	public void prog() {
		try {
			int a[] = { 1, 2, 5, 3, 1, 6, 5, 4, 1 , 3, 5, 5, 2 };
			Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
			int len = a.length;

			for (int i = 0; i <len; i++)
			{

				if(mp.containsKey(a[i]) && mp.get(a[i])>0)
				{
					i++;
				}
				int k=2;
				for (int j = i+1; j <len; j++) {
					if (a[i] == a[j] ) {
						mp.put(a[i],k);

						k++;
					} 

				}

			}
			for (int i = 0; i < len; i++) {
				if(mp.get(a[i])>1){
					System.out.println( "Repeated value of " + a[i] +" " +mp.get(a[i]));
				}}}
		catch(Exception e){
			System.out.println(e);

		}

	}

	public static void main (String args[]) {
		SeleniumTest st = new SeleniumTest();
		st.prog();

		/*st.selOne();


		int num = 30;
		BigInteger factorial = BigInteger.ONE;
		for(int i = 1; i <= num; ++i)
		{
			// factorial = factorial * i;
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.printf("Factorial of %d = %d", num, factorial);
	}*/


	}
}