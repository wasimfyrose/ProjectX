package pagestest;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StringOpr {
	String[] splited;
	String[] strings;
	public void mtdone() {

		/*
		 * String []arr =new String[]{"s d f g"}; int n= arr.length;
		 * 
		 * for(int i=0;i<=4;i++) { String a =arr[i].toString(); System.out.println(a);
		 * splited = a.split(" "); System.out.println(splited[0]);
		 * System.out.println(splited[2]); System.out.println(splited[1]);
		 * 
		 * } int l=0;
		 */
		List<String[]> output =new ArrayList<>();
		output.add(new String[] {"a","b"});
		String [] strings = output.get(0);
		System.out.println(strings[1]);
		/*for(int i=0;i<n;i++) {
			System.out.println(splited[i]);	
		}
	}*/
	 XSSFWorkbook workbook = new XSSFWorkbook();
     XSSFSheet sheet= workbook.createSheet();

    
    /*  String excelData[][] = input;
      System.out.println("lenght excel data"+excelData.length)*/;
      XSSFRow myRow1 = sheet.createRow(output.size());

      
      XSSFCell myCell = myRow1.createCell(8);


      for (int i = 0; i <5; i++) {
          for (int j = 0; j < 5; j++) {
        
              myCell.setCellValue(strings[i]);

          }}}

	public static void main(String[] args) {

		StringOpr gg = new StringOpr();
		gg.mtdone();
	}

}
