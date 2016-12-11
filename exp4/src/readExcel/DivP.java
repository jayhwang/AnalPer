package readExcel;

import java.util.ArrayList;
import java.util.Arrays;

import Action.AD;

public class DivP {

	public static ArrayList<AD> Divv(ArrayList<AD> arr){
		ArrayList<AD> list =new ArrayList<AD>(); 
		AD ad =  new AD();
		
		
		for(int i=1;i<arr.size();i++){
			
			int j = i-1;
			String[] a = arr.get(i).getArray();
			String[] b = arr.get(j).getArray();
			if(a[1].equals(b[1]) == false)
			{
				list.add(ad); 
				ad = new AD();
			}
			
		if(Arrays.asList(a).contains("시가총액 (상장예정주식수 포함)(억원)"))
				ad.setAv(a);
		else if(Arrays.asList(a).contains("PER(연율화)(배)"))
			ad.setPer(a);
		else if(Arrays.asList(a).contains("수익률 (12개월)(%)"))
				ad.setPrf(a);
		else if(Arrays.asList(a).contains("EV/EBITDA(평균)(배)"))
			ad.setEv(a);
		else if(Arrays.asList(a).contains("EV/Sales(평균)(배)"))
			ad.setEvs(a);
		else if(Arrays.asList(a).contains("PBR(배)"))
			ad.setPbr(a);
		
		}
		
		
			
			
		return list;	
	}
		


	
	
	


}
		
		
		
	

