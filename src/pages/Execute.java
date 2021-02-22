package pages;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public  class Execute implements markUP{
	int i,n,j;
	com.codoid.products.fillo.Connection connection;
	String fieldnames [][];
WebDriver driver;
	public void excelReader(){

		try {
			Fillo fi = new Fillo();
			String s []= {"kjfhiufkj"};
			connection= fi.getConnection("C:\\Users\\Wasim Abdullah\\eclipse-workspace\\Project X\\main\\resources\\testData\\testData.xlsx");
			String strQuery="Select * from Module";
			Recordset recordset=connection.executeQuery(strQuery);
			List<String> fieldnames =   recordset.getFieldNames();
			int count =fieldnames.size();
			/* Select se = new Select(element); */
					Alert al = driver.switchTo().alert();
						File scr = new File("");
						List<WebElement> li = new ArrayList<WebElement>();
						
						File scre = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						LocalDateTime a =LocalDateTime.now();
						Iterator<WebElement> it= li.iterator();
			/*
			 * while(recordset.next()){
			 * 
			 * 
			 * }
			 */	
			fieldnames.forEach(field-> System.out.println(field));
			/*
			 * System.out.println(recordset.getFieldNames());
			 * System.out.println(recordset.getField("Vehicleno"));
			 */recordset.close();
			connection.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * public String[][] sModel(){ String sNumvalues [][] = null; List<String>
	 * sModel;
	 * 
	 * for( i=0;i<n;i++) { for(j=0;j<n;j++) { sNumvalues[i][j]; sModel.add(); }}
	 * 
	 * 
	 * return sNumvalues;
	 * 
	 * }
	 */

	public void strngprogram() {
		
	}



	public static void main(String[] args) {
		Execute ex = new Execute();
		ex.excelReader();
		//ex.sarcasm();
		ex.faas();

	}

	@Override
	public String modelmethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void faas() {
		// TODO Auto-generated method stub
		
	}

	
	

}
