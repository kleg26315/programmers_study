/*
2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
�� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, 
solution�� �ϼ��ϼ���. ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�.
���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.

���� ����
2016���� �����Դϴ�.
2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
*/
package codingtest;

public class Solution {
  public String solution(int a, int b) {
	  String[] days = {"THU","FRI","SAT","SUN","MON","TUE","WEN"};
	  int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
      String answer = "";

	  for(int i =0; i<a-1; i++) {
		  b += months[i];
	  }
	  
	  answer = days[b%7];
      return answer;
  }
    
    public static void main(String[] args){
        Solution sol = new Solution();
        int a = 12;
        int b = 31;
        System.out.println(sol.solution(a,b));
        
    }
}