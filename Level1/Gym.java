package greedy;

import java.util.Arrays;

public class Gym {
	public static void main(String[] args){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        
        System.out.println(solution(n, lost,reserve));
    }
   
    public static int solution(int n, int[] lost, int[] reserve) {
    	int answer = 0;
    	
    	answer = n - lost.length;
    	Arrays.sort(lost);
    	Arrays.sort(reserve);
    	
    	for(int i=0; i<lost.length; i++) {
    		for(int j=0; j<reserve.length; j++) {
    			if(lost[i] == reserve[j]) {
    				answer++;
    				lost[i] = Integer.MIN_VALUE;
    				reserve[j] = Integer.MIN_VALUE;
    			}
    		}
    	}
        		
    	for(int i=0; i<lost.length; i++) {
    		for(int j=0; j<reserve.length; j++) {
    			if(lost[i] != Integer.MIN_VALUE) {
            		if(lost[i] == reserve[j] ||
            				lost[i] == reserve[j]-1 ||
            				lost[i] == reserve[j] +1) {
            			reserve[j] = Integer.MIN_VALUE;
            			answer++;
            			break;
            		}
    			}
       		}
    	}
    	
    	return answer;
    }
}
