/*
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,

arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
*/
package codingtest;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList numbers =new ArrayList();
        numbers.add(arr[0]);
        
        int m=0;
        for(int i =0; i<arr.length; i++) {
        	if(Integer.parseInt(numbers.get(m).toString())!=arr[i]) {
        		m++;
        		numbers.add(arr[i]);
        	}
        	
        }
        answer = new int[numbers.size()];
        for(int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
            answer[i] = (int) numbers.get(i);
        }
        return answer;
	}
    
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {1,1,3,3,0,1,1}; 
        sol.solution(arr);
        
    }
}