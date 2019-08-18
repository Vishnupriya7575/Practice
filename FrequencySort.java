/*Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 */

package Programs;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {

	public static String freqSort(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.get(ch));
		}

		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		maxHeap.addAll(map.keySet());

		StringBuilder sb = new StringBuilder();
		while (!maxHeap.isEmpty()) {
			char current = maxHeap.remove();
			for (int i = 0; i < map.get(current); i++) {
				sb.append(current);
				System.out.println(sb);
			}
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		System.out.println(freqSort("Tree"));
	}
}
