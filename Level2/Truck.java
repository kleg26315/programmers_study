package stack_queue;

public class Truck {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
       	int answer = 0;
       	int[] passing_truck = new int[truck_weights.length];
       	int[] tmp = new int[truck_weights.length];
       	
       	int order = 0;
       	int total =0;
       	
        while(true) {
        	answer++;
        	total = 0;
        	
        	passing_truck[order] = truck_weights[order];
        	tmp[order] = answer;
        	order++;
        	
        	for(int i=0; i<tmp.length; i++) {
        		if(tmp[i] + bridge_length == answer) {
        			passing_truck[i] = 0;
        		}
        	}
        	
        	for(int i=0; i<passing_truck.length; i++) {
        		total += passing_truck[i];
        	}
        	
        	if(total>weight) {
        		order--;
        	}
        	else {
            	if(order==truck_weights.length) {
            		answer += bridge_length;
            		break;
            	}
        	}
        }
        return answer;
    }
}
