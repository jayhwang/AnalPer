/*
 * �迭�� ���ʴ�� �迭��.
 * */

package readExcel;


import java.util.ArrayList;
import java.util.Arrays;


import Action.AD;


// ����,per,pbr�� ���� ������ǥ��� �������ͷ� ������ ��ġ����(excel)�� �ľ��Ұ���. �ϴ� ������ǥ�� ���ǿ� ������ ��������� ���ͷ��� ���ϴ� �ҽ��� ������.
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
