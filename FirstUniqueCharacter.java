package Programs;

import java.util.HashMap;

public class FirstUniqueCharacter {

	public static int firstUniqueChar(String s)
	{
		HashMap<Character, Integer> hashmap = new HashMap<>();
		for(int i = 0; i < s.length() ; i++)
		{
			char current = s.charAt(i);
			if(!hashmap.containsKey(current)) {
				hashmap.put(current, i);
			} else
			{
				hashmap.put(current, -1);
			}
		}
		int min = Integer.MAX_VALUE;
		for(char c: hashmap.keySet()) {
			if(hashmap.get(c) > -1 && hashmap.get(c)<min) {
				min = hashmap.get(c);
			}
		}
		return min == Integer.MAX_VALUE? -1 : min;
	} 
	
	public static void main(String[] args) {
		System.out.println(firstUniqueChar("feelf"));
	}

}
