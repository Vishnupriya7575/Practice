/*Problem Description: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
1. Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true*/


package Programs;
import java.util.Stack;

public class ValidParanthesis {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (ch == ']' && !stack.isEmpty() && stack.peek() == ']') {
				stack.pop();
			}
			else {
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		ValidParanthesis vp = new ValidParanthesis();
		System.out.println(vp.isValid("({})"));
	}

}
