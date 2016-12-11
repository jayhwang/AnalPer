package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Action.AD;

public class EP {

	public static ArrayList<AD> ExcelParser(){

	      File file = new File("C:/Users/USER/Desktop/exp.xlsx");

	      XSSFWorkbook wb = null;

	 

	      try {

	         wb = new XSSFWorkbook(new FileInputStream(file));

	      } catch (Exception e) {

	         e.printStackTrace();

	      }

	 

	      ArrayList<AD> list = new ArrayList<AD>();

	      AD aData = null;

	      for(Row row : wb.getSheetAt(0)){ 

	         aData = new AD();

	         String[] temp = new String[8]; // 요거 가변배열로 바꿔주면 좋겠는데 -> ok

	         int count = 0;

	         

	         for(Cell cell : row){ 

	        	    if(temp.length <= count)     // temp.length =8 , count= 0~8,9
	        	    {	
	        	    	String tempp[] = new String[temp.length+1];
	        	    	System.arraycopy(temp, 0, tempp, 0, temp.length);
	        	    	temp = tempp;        	    	
	        	    }
	        	
	            switch(cell.getCellType()){
	            case XSSFCell.CELL_TYPE_FORMULA : 
	                temp[count] = cell.getCellFormula();
	               break;
	               
	               case XSSFCell.CELL_TYPE_NUMERIC :
	            	   temp[count] = "" +cell.getNumericCellValue();
	               break;
	               
	               case XSSFCell.CELL_TYPE_STRING : 
	            	   temp[count] = "" + cell.getStringCellValue();
	               break;
	               case XSSFCell.CELL_TYPE_BLANK : 
	            	   temp[count] =  "";
	               break;
	               case XSSFCell.CELL_TYPE_ERROR : 
	            	   temp[count] =  ""+cell.getErrorCellValue();
	               break;
	               default:
	            }
	            if(temp[count] == "") break; // 읽는 다음 셀이 null이면 루프 break
	            
	 
	            count++;				
	            
	         }
	         
	         	if(temp[5] =="" | temp[5] ==null) continue;
	         	
	         	
	         	
	         	aData.setArray(temp);
	 
	         	
	         	
	         	list.add(aData);
	      }

	      return list;

	}
}
