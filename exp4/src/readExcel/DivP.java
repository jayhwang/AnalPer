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
			
		if(Arrays.asList(a).contains("�ð��Ѿ� (���忹���ֽļ� ����)(���)"))
				ad.setAv(a);
		else if(Arrays.asList(a).contains("PER(����ȭ)(��)"))
			ad.setPer(a);
		else if(Arrays.asList(a).contains("���ͷ� (12����)(%)"))
				ad.setPrf(a);
		else if(Arrays.asList(a).contains("EV/EBITDA(���)(��)"))
			ad.setEv(a);
		else if(Arrays.asList(a).contains("EV/Sales(���)(��)"))
			ad.setEvs(a);
		else if(Arrays.asList(a).contains("PBR(��)"))
			ad.setPbr(a);
		
		}
		
		
			
			
		return list;	
	}
		


	
	
	


}
		
		
		
	

