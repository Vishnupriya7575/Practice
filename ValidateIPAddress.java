package Programs;
import org.apache.commons.validator.routines.InetAddressValidator;

// Java program to validate <tt>IPv4</tt> and <tt>IPv6</tt> address
class ValidateIPAddress
{
	// an IPv4 address
	private static final String INET4ADDRESS = "172.8.9.28";

	// an IPv6 address
	private static final String INET6ADDRESS = 
							"2001:0db8:85a3:0000:0000:8a2e:0370:7334";

	public static void main(String[] args)
	{
		
		InetAddressValidator validator = new InetAddressValidator();
		
		if(validator.isValid(INET4ADDRESS)) {
			System.out.println("The IP Address is" + INET4ADDRESS + "is valid");
		} else
		{
			System.out.println("The IP Address is" + INET4ADDRESS + "not valid");
		}
		
		if(validator.isValidInet4Address(INET6ADDRESS))
		{
			System.out.println("The IP Address is" + INET6ADDRESS + "is valid");
		} else
		{
			System.out.println("The IP Address is" + INET6ADDRESS + "is not valid");
		}
		
}
}