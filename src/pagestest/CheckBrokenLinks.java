package pagestest;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLinks {

}
	
	/*public void freak() {
		
		 * driver = new ChromeDriver(); System.
		 * getProperty("C:\\Users\\Wasim Abdullah\\eclipse-workspace\\Project X\\main\\resources\\drivers"
		 * ); String homepage = "www.google.com"; driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
	//*** Writing Excel Things////****
	String[][] input;
	String filename="";
	String tabname="";
	int col=5;
	public String[][] write_xlsx() {
	       System.out.println("input data lenght"+input.length);

	       
	       
	       String []arr =new String[] {"s d f g"};
		/* String[] splited = arr.toString().split("\\s+"); 
	       String[] splited;
	       int n = arr.length;
	       for(int i=0;i<=n;i++) {
	    	   for (int j=0;j<0;j++) {
	    		   splited [j]= arr[i].toString().split("\\s+");
	    	   }
	       }
	       try {
	           File excel = new File("E:\\output.xlsx");
			
			 * System.out.print("\t"+filename+"\t"+tabname+"\t"+col+input.length+"col"+col+
			 * "\n");
			 
	           XSSFWorkbook workbook = new XSSFWorkbook();
	           XSSFSheet sheet= workbook.createSheet();

	          
	            String excelData[][] = input;
	            System.out.println("lenght excel data"+excelData.length);
	            XSSFRow myRow1 = sheet.createRow(input.length);

	            
	            XSSFCell myCell = myRow1.createCell(col);
	     

	            for (int i = 0; i < input.length; i++) {
	                for (int j = 0; j < col; j++) {
	              
	                    myCell.setCellValue(input[i][j]);
	                    
	                    System.out.println(">>"+excelData[i][j]);
	                }
	            }
	                FileOutputStream out = new FileOutputStream(filename);
	                workbook.write(out);
	                out.close();
	                System.out.println("report genrated..");
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        return null;
	   }
	}

*/