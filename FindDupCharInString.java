package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDupCharInString {
	public static void findDupCharInString(String str)
	{
		if(str.length() == 1) {
			System.out.println("No Dups" + str);
		}
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		Set<Character> set = map.keySet();
		for(Character ch : set) {
			if(map.get(ch)>1) {
				System.out.println("Dup char in a string" + map.get(ch));
			}
		}
		
	}
	

}
