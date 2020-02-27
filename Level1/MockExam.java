package BP;

import java.util.ArrayList;

public class MockExam {
	public static void main(String[] args){
        int[] answers = {1,2,3,4,5};
        
        for(int i=0; i<solution(answers).length; i++) {
            System.out.println(solution(answers)[i]);        	
        }

    }
   
    public static int[] solution(int[] answers) {
    	int[] first = {1,2,3,4,5};
    	int[] second = {2,1,2,3,2,4,2,5};
    	int[] third = {3,3,1,1,2,2,4,4,5,5};
    	int firstCnt = 0;
    	int secondCnt = 0;
    	int thirdCnt = 0;
    	
    	for(int i=0; i<answers.length; i++) {
        	if(first[i%5] == answers[i]) {
        		firstCnt++;
        	}
			if(second[i%8] == answers[i]) {
    			secondCnt++;
    		}
    		if(third[i%10] == answers[i]) {
    			thirdCnt++;
    		}
    	}

		ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=answers.length; i>=0; i--) {
    		if(i==firstCnt) {
    			list.add(1);
    		}
    		if(i==secondCnt) {
    			list.add(2);
    		}
    		if(i==thirdCnt) {
    			list.add(3);
    		}
    		
    		if(list.size()>=1) {
    			break;
    		}
    	}
    	
    	int[] answer = new int[list.size()];
    	for(int i=0; i<answer.length; i++) {
    		answer[i] = list.get(i);
    	}
        return answer;
      
    }
}
