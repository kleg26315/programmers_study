package hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Camouflage {
	 public int solution(String[][] clothes) {
	        int answer = 0;
	        HashMap<String, String> map = new HashMap<>();
	        for(int i=0; i<clothes.length; i++) {
		        map.put(clothes[i][0],clothes[i][1]);
	        }
	        answer = map.size();
	        HashMap<String, Integer> countMap = new HashMap<>();
	        
	        for(int i=0; i<map.size(); i++) {
	        	if(countMap.containsKey(clothes[i][1])==true) {
		        	countMap.put(clothes[i][1], countMap.get(clothes[i][1])+1);
	        	}
	        	else {
	        		countMap.put(clothes[i][1], 1);
	        	}
	        }
	        
	        Set<String> set = countMap.keySet();
	        if(set.size()!=1) {
		        Iterator<String> it = set.iterator();
		        
		        
		        int result = 1;
		        while(it.hasNext()) {
		        	result = result * (countMap.get(it.next())+1) ;
		        }
		        
		        answer = result -1;	
            }
	        return answer;
	    }
}