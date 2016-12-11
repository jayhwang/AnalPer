/*
 * 배열로 차례대로 배열됨.
 * */

package readExcel;


import java.util.ArrayList;
import java.util.Arrays;


import Action.AD;


// 시총,per,pbr과 같은 투자지표들과 연간수익률 사이의 위치관계(excel)로 파악할것임. 일단 투자지표가 조건에 맞으면 현재까지의 수익률을 구하는 소스를 만들어보자.
public class ER {
	public static void main(String[] args) {
	
		ArrayList<AD> data = new ArrayList<AD>();
		ArrayList<AD> data2 = new ArrayList<AD>();
	
				
				
	      data = EP.ExcelParser();
	      data2 = DivP.Divv(data);
	      
	      
	      for (int i = 1; i < data.size(); i++) { 
	    																						/*  	  	System.out.println(data.get(i).getDate()+"    "+data.get(i).getAv()+"    "+data.get(i).getPer() +"    "+data.get(i).getPrf()+"    "+data.get(i).getFcff()+"    "+data.get(i).getEv()+"     "+data.get(i).getEvs());*/  
	    	// System.out.println(Arrays.toString(data.get(i).getArray()));
	    	  									
	      
	      }
	      	
	      
	      //	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");	        

	      	  for(int i=1;i<data2.size();i++) System.out.println(Arrays.toString(data2.get(i).getPer()));
	      	  
		      }
		


	
}
