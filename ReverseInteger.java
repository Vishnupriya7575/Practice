package Programs;

public class ReverseInteger {
	public static int Reverse(int num)
	{
		int rev = 0;
		boolean negative = false;
		if(num < 0)
		{
			negative = true;
			num *= -1;
		}
		
		while(num > 0)
		{
			rev = (rev * 10) + (rev %10);
			num /= 10;
		}
		
		if(rev > Integer.MAX_VALUE) {
			return 0;
		}
		
		return negative ? (int)(-1 * rev) : (int)rev;
	}
	
	public static void main(String[] args) {
		System.out.println(Reverse(-123));
	}

}
