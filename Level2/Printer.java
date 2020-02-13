package stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Printer {
	public static void main(String[] args) {
//		int[] priorities = {2,1,3,2};
//		int location = 2;
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		System.out.println(solution(priorities, location));
	}
	public static int solution(int[] priorites, int location) {
		int answer = 0;
		int count = 1;
		int realCount = 0;
		int result[] = new int[priorites.length];
		List<Integer> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		List<Integer> listlocation = new ArrayList<>();
	
		for(int i=0; i<priorites.length; i++) {
			q.offer(priorites[i]);
			list.add(priorites[i]);
			listlocation.add(i);
		}
		int highest = sort(list);
		while(true) {
			int object = q.poll();
			if(highest!=object) {
				q.offer(object);
				listlocation.add(listlocation.get(0));
				listlocation.remove(listlocation.get(0));
				count++;
			}
			else {
				result[realCount] = listlocation.get(0);
				realCount++;
				if(list.size()!=0)
					highest = sort(list);
				listlocation.remove(listlocation.get(0));

				if(q.isEmpty())
					break;
			}
		}
		
		for(int i=0; i<result.length; i++) {
			if(result[i] == location)
				answer = i+1;
		}
		return answer;
	}
	
	public static int sort(List<Integer> list) {
		int highest = list.get(0);
		int removeNumber = list.size()-1;
		int tmp = 0;
		for(int i=1; i<list.size(); i++) {
			tmp = list.get(i);
			if(highest < tmp)
				highest = tmp;
		}
		
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i)==highest) {
				removeNumber = i;
			}
		}
		list.remove(removeNumber);
		return highest;
	}
}
