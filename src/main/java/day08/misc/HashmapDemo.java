package day08.misc;

import java.util.HashMap;
import java.util.Map;
public class HashmapDemo {

	public static void main(String[] args) {
		Map<String,Integer> countMap=new HashMap<String,Integer>();
	    String[] arrnames= {"Joshua","Joel","Dharun","Joshua","Joel","Dharun","Joshua"};
		
		for (int i=0;i<arrnames.length;i++) {
			if(countMap.get(arrnames[i])==null) {
               countMap.put(arrnames[i], 1);
			}
			else {
				int count=countMap.get(arrnames[i]);
				count++;
				countMap.put(arrnames[i], count);
			}
		}
		System.out.println(countMap);
		

	}

}
