package pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class MainPage {
	Scanner in = new Scanner(System.in);
	public void loops() {

		int a,i,b,n =0;
		System.out.println("Enter value:");
		int t=in.nextInt();
		System.out.println("Enter three values:");
		a = in.nextInt();
		b = in.nextInt();
		n = in.nextInt();
		/* = a+(b*1);*/
		int s = a+(b*1);
		for( i=2;i<=t;i=i+i){
			s = s+(b*i);
			System.out.print(s +" ");
			in.close();
		}

	}
	public void fuck(){
		try {
			Fillo fillo=new Fillo();
			Map mp = new HashMap();
			List<String> li = new ArrayList<String>();
			Connection connection=fillo.getConnection("C:\\Users\\Wasim Abdullah\\eclipse-workspace\\Project X\\main\\resources\\testData\\testData.xlsx");
			String strQuery="Select * from Module";
			Recordset recordset=connection.executeQuery(strQuery);
			while(recordset.next()){

				System.out.println(recordset.getField("Vehicleno"));
				li.add(recordset.getField("Vehicleno"));
			}
			recordset.close();
			connection.close();
			Iterator it = li.iterator();
			li.stream().filter(str->str.isEmpty()).collect(Collectors.toList());
			
			while(it.hasNext()) {
				System.out.println(it.toString());
			}
		}
		catch(Exception e) {
			System.out.println(e);	
		}
	}


	/*
	 * public static void main (String []args) throws FilloException {
	 * 
	 * MainPage mp = new MainPage();
	 * 
	 * mp.fuck(); }
	 */
}


