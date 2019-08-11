package Programs;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {

		List<String> result = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("Fizz Buzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(Integer.toString(i));
			}
		}
		for (int j = 0; j < result.size(); j++) {
			System.out.println(result.get(j));
		}
		return result;
	}

	public static void main(String[] args) {
		fizzBuzz(5);

	}
}