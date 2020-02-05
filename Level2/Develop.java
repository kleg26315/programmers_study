package stack_queue;

import java.util.ArrayList;
import java.util.List;
 
public class Develop {
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		int order = 0;
		int cnt = 1;
		while(true) {
			cnt = 1;
			for(int i=0; i<progresses.length; i++) {
				progresses[i] += speeds[i];
			}
			
			if(progresses[order] >= 100) {
				for(int i=order+1; i<progresses.length; i++) {
					if(progresses[i]>=100) {
						cnt++;
						order++;
					}
					else {
						order = i;
						break;
					}
				}
				list.add(cnt);
			}
			if(progresses[order]>=100 && order==progresses.length-1) {
				break;
			}
		}
		
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}