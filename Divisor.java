/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
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