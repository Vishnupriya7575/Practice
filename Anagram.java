/*Problem description: Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.
*/

package Programs;

public class Anagram {
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] counts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			counts[s.charAt(i) - 'a']++;
			counts[t.charAt(i) - 'a']--;
		}
		for (int i : counts) {
			if (i != 0) {
				return false;
			}
		}
		return true; 
	}

	public static void main(String[] args) {
		String s = "abcd";
		String t = "dcabe";
		System.out.println(isAnagram(s, t));
	}

}
