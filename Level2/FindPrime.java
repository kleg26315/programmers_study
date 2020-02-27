package BP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindPrime {
	private static Set<Integer> primeSet = new HashSet<>();

	public static void main(String[] args){
        String numbers = "7843";
        
        System.out.println(solution(numbers));
    }
   
    public static int solution(String numbers) {
    	int answer =0;

    	ArrayList<Character> list = new ArrayList<>();
    	for(int i=0; i<numbers.length(); i++) {
    		list.add(numbers.charAt(i));
    	}
   
    	func(list,  "");
    	
    	answer = primeSet.size();
    	return answer;
    }
    
    public static void func(ArrayList<Character> list, String check) {
    	ArrayList<Character> copy = new ArrayList<>();

    	for(int i=0; i<list.size(); i++) {

    		check += list.get(i).toString();
    		if(prime(Integer.parseInt(check)) == true) {
    			primeSet.add(Integer.parseInt(check));
    		}
    		
    		for(int j=0; j<list.size(); j++) {
        		copy.add(list.get(j));
        	}
			copy.remove(i);
			func(copy, check);
    		
    		
			check = check.substring(0, check.length()-1);

    		copy.clear();
    	}
    }
    
    public static boolean prime(int su) {
    	if(su<2) {
    		return false;
    	}
    	else if(su==2) {
    		return true;
    	}
    	else {
        	for(int i=2; i<su; i++) {
        		if(su%i == 0) {
        			return false;
        		}
        	}
    	}
		return true;    	
    }
}
