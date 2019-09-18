/*
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
*/

import java.util.Scanner;

public class Middle {
	public static void main(String[] args) {
		String s = "";
		
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		scan.close();
		
		Solution solution = new Solution();
		solution.solution(s);
		
	}
}

class Solution {
	  public String solution(String s) {
	      String answer = "";
	      System.out.println(s.substring((s.length()-1 )/2, s.length() /2+1));
	      
	      return answer;
	  }
}
