package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Hot {
	public static void main(String[] args) {
		int[] scovile = {1,2,3};
		int K = 11;
		
		System.out.println(solution(scovile, K));
	}
	
	public static int solution(int[] scovile, int K) {		// 우선순위 큐를 이용, 효율성 테스트 통과
		int answer = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i=0; i<scovile.length; i++) {
			q.offer(scovile[i]);
		}
		
		while(q.peek() < K) {
			if(q.size() == 1) {
				answer = -1;
				break;
			}
			
			int a = q.poll();
			int b = q.poll();
			
			q.offer(a+b*2);
			answer++;
		}
		
		return answer;
	}
	
	
	public static int solution2(int[] scovile, int K) {		// 배열을 이용, 효율성 테스트 불통과
		int answer = 0;
		int size = scovile.length;
		Arrays.sort(scovile);
		
		while(scovile[0] < K) {
			if(answer==size-1) {
				answer = -1;
				break;
			}
			scovile = mix(scovile);
			answer++;
			
			Arrays.sort(scovile);
		}
	    return answer;
	}
	
	public static int[] mix(int[] scovile) {
		int[] newScovile = new int[scovile.length -1];
		newScovile[0] = scovile[0] + (scovile[1] * 2);
		for(int i =1; i<newScovile.length; i++) {
			newScovile[i] = scovile[i+1];
		}
		
		return newScovile;
	}
}
