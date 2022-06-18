package Sampmavan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonMethods {

	public ArrayList<String> getdatafrmexl(String TCname) throws IOException {


		ArrayList<String> TCinfo = new ArrayList();
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SVEC\\Desktop\\AUTOMATIN TESTING\\sampleTest.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
        XSSFSheet sheet  =wbook.getSheet("registration");
   
      Iterator<Row>  rows = sheet.iterator();
      
      while(rows.hasNext())
      {
          Row specificrow =   rows.next();
        
       if(specificrow.getCell(0).getStringCellValue().equalsIgnoreCase(TCname)) 
          {
    
    	Iterator<Cell>  cells =  specificrow.cellIterator();
    	while(cells.hasNext())
    	{
    	Cell cellvalue = cells.next();
    	System.out.println(cellvalue.getStringCellValue());
    	TCinfo.add(cellvalue.getStringCellValue());
    	}
     
          }
     
	}
      
      wbook.close();
      return TCinfo;
		
	}
}
