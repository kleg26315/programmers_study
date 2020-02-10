package stack_queue;

import java.util.HashMap;
import java.util.Stack;

public class Iron_rod {
	public static void main(String[] args) {
		String arrangement = "()(((()())(())()))(())";
		System.out.println(solution(arrangement));
	}
	
	public static int solution(String arrangement) {
		int answer = 0;
		int rodCnt = 0;
		int razerCnt = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean check = false;
		boolean anotherCheck = true;
		boolean razerCheck = true;
		
		for(int i=0; i<arrangement.length(); i++) {
			char next = arrangement.charAt(i);
			
			if(next=='(') {
				if(check==false) {
					rodCnt++;
					map.put(rodCnt, 0);
				}
				else if(anotherCheck == false){				// ) ������ (�� �ö�
					if(razerCheck == false) {
						map.put(rodCnt, 0);
						razerCheck = true;
					}
				}
				check = false;
				anotherCheck = true;
			}
			else if(next == ')') {
				if(check == false) {	// ( ������ ) �϶�
					map.remove(rodCnt);
					if(map.size()==0)
						razerCnt = 0;
					else {
						for(int j=1; j<map.size()+1; j++) {
							map.put(j, map.get(j)+1);
						}
					}
					razerCheck = false;
				}
				else if(anotherCheck == false){		// ) ������ ) �� �ö�
					rodCnt--;
					answer += map.get(rodCnt)+1;
					map.remove(rodCnt);
				}
				anotherCheck = false;
				check = true;
			}
		}
		return answer;
	}
	
   public static int solution2(String arrangement) {
        int answer = 0;
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(')
                stack.add(arrangement.charAt(i));
            else {
                stack.pop();
                if (arrangement.charAt(i-1) == '(')
                    answer+=stack.size();
                else
                    answer++;
            }
        }
        return answer;
    }

}
