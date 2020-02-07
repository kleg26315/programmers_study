package stack_queue;


public class Top {
	public static void main(String[] args) {
		int[] heights = {10,4,3,11,1};
		for(int i=0; i<solution(heights).length; i++) {
			System.out.println(solution(heights)[i]);
		}
	}
	
	public static int[] solution(int[] heights) {
        int[] answer = {};
        answer = new int[heights.length];
        answer[0] = 0;
        for(int i=1; i<heights.length; i++) {
        	for(int j=0; j<i; j++) {
        		if(heights[j]>heights[i]) {
        			answer[i] = j+1;
        		}
        	}
        }
        return answer;
    }
}
