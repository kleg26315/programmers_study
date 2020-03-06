package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class RamenFactory {
	
	public static void main(String[] args) {
		int stock = 4;
		int[] dates = {4,10,15};
		int[] supplies = {20,5,10};
		int k = 30;
		
		System.out.println(solution(stock, dates, supplies, k));
	}
	
	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int index = 0;
		
		for(int i=0; i<k; i++) {
			if(index<dates.length && dates[index] == i) {
				q.offer(supplies[index]);
				index++;
			}
			
			if(stock==0) {
				stock += q.poll();
				answer++;
			}
			
			stock--;
		}
		
	    return answer;
	}
}
