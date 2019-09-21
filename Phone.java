/*
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 4 이상, 20이하인 문자열입니다.
 */
package codingtest;
import java.util.Scanner;

public class Phone {
	public static void main(String[] args) {
	String phone_number = "";
		
		System.out.println("Input phone_number");
		
		Scanner scan = new Scanner(System.in);
		phone_number = scan.nextLine();
		scan.close();
		
		Solution solution = new Solution();
		solution.solution(phone_number);
		
	}
}

class Solution {
	  public String solution(String phone_number) {
		  String answer = "";
	      String answer2 = "";
	      String special = "*";
	      int i =0; 
	      int max = phone_number.length();
	      System.out.println(max);
	      
	      answer2 = phone_number.substring(max-4,max);
	      while(i<max-4)
	      {
	    	  answer = special.concat(answer);
	    	  
	    	  i++;
	      }
	      
	      answer = answer.concat(answer2);
	      System.out.println(answer);
	      return answer;
      }
}