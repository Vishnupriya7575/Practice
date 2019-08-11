package Programs;

public class ValidateIPAdd {

	public static void main(String[] args) {
		ValidateIPAdd("108.34.22.4");
	}

	public static boolean ValidateIPAdd(String ip) {
		try {
			if (ip == null || ip.isEmpty()) {
				return false;
			}

			String[] parts = ip.split("\\.");
			if (parts.length != 4) {
				return false;
			}

			for (String s : parts) {
				int i = Integer.parseInt(s);
				if ((i < 0) || (i > 255)) {
					return false;
				}
			}
			if (ip.endsWith(".")) {
				return false;
			}
			System.out.println("Valid IP address");
			return true;

		} catch (NumberFormatException nfe) {
			System.out.println("InValid IP address");
			return false;
		}
	}
}
