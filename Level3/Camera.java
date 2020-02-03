package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Camera {
	public static int solution(int[][] routes) {
		int answer = 0;
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i=0; i<routes.length; i++) {
			map.put(routes[i][0], routes[i][1]);
		}
		
		Set<Integer> set = map.keySet();
		List<Integer> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		int cnt = 0;
		answer = greedy(cnt, map, list);
		
	    return answer;
	}
	
	public static int greedy(int cnt, HashMap<Integer, Integer> map, List<Integer> list) {
		int check = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(list.size()-1)>map.get(list.get(i))) {
				check++;
			}
			else {
				map.remove(list.get(i), map.get(list.get(i)));
			}
		}
		if(map.size()>=1) {
			Set<Integer> newSet = map.keySet();
			List<Integer> newList = new ArrayList<>();
			newList.addAll(newSet);
			Collections.sort(newList);
			cnt = greedy(cnt, map, newList);
			
		}
		if(map.size()==0) {
			return cnt+1;
		}
		else if(map.size()==1) {
			return cnt+1;
		}
		return cnt;
	}
}
