/*
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
 */
package codingtest;

public class Intsum {
	public long solution(int a, int b) {
	      long answer = 0;
	      if(a<b) {
		      for(int i = a; i<=b; i++) {
		    	  answer += i;
		      }
	      }
	      else if(a>=b) {
	    	  for(int i = b; i<=a; i++) {
		    	  answer += i;
		      }
	      }
	      
	      return answer;
	}
	
	public static void main(String[] args) {
		Intsum sum = new Intsum();
		int a= 3;
		int b= 3;
		System.out.println(sum.solution(a, b));
	}

}
