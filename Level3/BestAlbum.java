package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<genres.length; i++) {
        	if(map.containsKey(genres[i])) {
        		map.put(genres[i], map.get(genres[i])+plays[i]);
        	}
        	else{
        		map.put(genres[i], plays[i]);
        	}
        }
        List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o2).compareTo(map.get(o1));
			}
        });
        List<Integer> answerList = new ArrayList<>();
        HashMap<Integer, Integer> mapNumber = new HashMap<>();      
 
        for(int i=0; i<plays.length; i++) {
        	mapNumber.put(i, plays[i]);
        }
        for(int i=0; i<keySetList.size(); i++) {
    		List<Integer> list = new ArrayList<>();
        	for(int j=0; j<genres.length; j++) {
        		if(keySetList.get(i).equals(genres[j])) {
        			list.add(plays[j]);
        		}
        	}
        	Collections.sort(list, Comparator.reverseOrder());
        	if(list.size()>=2) {
        		if(list.get(0).equals(list.get(1))) {
        			for(int j=0; j<mapNumber.size(); j++) {
	        			int standard =0;
	    				int object = 0;
	    				for(int k=0; k<mapNumber.size(); k++) {
	    					if(list.get(0).equals(mapNumber.get(k))) {
	    						standard = k;
	    					}
	    				}
	    				for(int z=0; z<mapNumber.size(); z++) {
	    					if(list.get(1).equals(mapNumber.get(z))) {
	    						if(z!=standard) {
	    							object = z;
	    						}
	    					}
	    				}
	    				if(standard<object) {
	    					answerList.add(standard);
	    					answerList.add(object);
	    					break;
	    				}
	    				else {
	    					answerList.add(object);
	    					answerList.add(standard);
	    					break;
	    				}
        			}
        		}
        		else {
        			for(int j=0; j<mapNumber.size(); j++) {
        				if(list.get(0).equals(mapNumber.get(j))) {
        					answerList.add(j);
        				}
        			}
        			for(int j=0; j<mapNumber.size(); j++) {
        				if(list.get(1).equals(mapNumber.get(j))) {
        					answerList.add(j);
        				}
        			}
        			
        		}
        	}
        	else if(list.size()==1) {
        		for(int j=0; j<list.size(); j++) {
        			for(int k=0; k<mapNumber.size(); k++) {
        				if(list.get(j).equals(mapNumber.get(k))) {
        					answerList.add(k);
        				}
        			}
        		}
        	}
        }
        
        answer = new int[answerList.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}