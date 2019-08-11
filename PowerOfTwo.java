package Programs;

public class PowerOfTwo {

	public static boolean powerOfTwo(int n) {
		int i = 1;
		while (i < n) {
			i *= 2;
		}
		return i == n;
	}
	public static void main(String[] args) {
		System.out.println(powerOfTwo(5));
	}
}
