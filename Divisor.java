/*
array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

���ѻ���
arr�� �ڿ����� ���� �迭�Դϴ�.
���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
divisor�� �ڿ����Դϴ�.
array�� ���� 1 �̻��� �迭�Դϴ�.
 */
package codingtest;

import java.util.ArrayList;
import java.util.Collections;

public class Divisor {
	
	public int[] divisor(int[] arr, int divisor) {
		int[] answer = {};
		int[] answer2 = {};
		int m=0;
		ArrayList realanswer = new ArrayList();
		int k=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor ==0) {
				m++;
			}
		}
		if(m==0)
			answer2 = new int[1];
		else
			answer2 = new int[m];
		 
		 if(m==0) { answer2[0] = -1;}
		 else {
			 for(int i=0; i<arr.length; i++) {
				 if(arr[i]%divisor==0) {
					 answer2[k] = arr[i];
					 k++;
				 }
				 
			 }
		 }
		for(int i =0; i<answer2.length; i++) {
			realanswer.add(answer2[i]);
		}
		
		Collections.sort(realanswer);
		answer = new int[realanswer.size()];
		for(int i=0; i<realanswer.size(); i++)
			answer[i] = (int) realanswer.get(i);
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Divisor div = new Divisor();
		int[] arr = {2,36,1,3};
		int divisor = 10;
		div.divisor(arr, divisor);
	}

}