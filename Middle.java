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