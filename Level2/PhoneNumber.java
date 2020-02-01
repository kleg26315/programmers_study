package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PhoneNumber {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<phone_book.length; i++) {
            map.put(phone_book[i], 0);        	
        }
        
        Set<String> set = new HashSet<String>();
        set = map.keySet();
        
        List<String> list = new ArrayList<String>();
        list.addAll(set);
        
        for(int i=0; i<list.size(); i++) {
        	int cnt = 0;
        	while(i+cnt < list.size()-1) {
        		cnt++;
        		if(list.get(i).length() <= list.get(i+cnt).length()) {
        			if(list.get(i+cnt).substring(0,list.get(i).length()).contains(list.get(i))) {
                		answer = false;
                		return answer;
        			}
        		}
        		else {
        			if(list.get(i).substring(0,list.get(i+cnt).length()).contains(list.get(i+cnt))) {
                		answer = false;
                		return answer;
        			}
        		}
        		
        	}
        }
        
        return answer;
    }
}