package Programs;

import java.util.Scanner;

public class ReverseString {

	/*
	 * public static void main(String[] args) {
	 * System.out.println("Emnter a string to reverse"); Scanner sc = new
	 * Scanner(System.in); String str = sc.nextLine(); String reverse = ""; for (int
	 * i = str.length() - 1; i >= 0; i--) { reverse = reverse + str.charAt(i); }
	 * System.out.println("Reversed String is"); System.out.println(reverse); }
	 */
	
	/* ********* Using String Builder ************** */
	public static void main(String[] args) {
		System.out.println("Enter a string to get reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i++)
		{
			sb.append(str.charAt(i));
		}
		System.out.println("Reverse string is");
		System.out.println(sb.toString());
		
	}
}
