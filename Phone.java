/*
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
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