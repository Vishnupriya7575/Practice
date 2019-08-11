package Programs;

/* ************Question********************
Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address,
mail sent there will be forwarded to the same address without dots in the local name.  
For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  
(Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. 
This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  
(Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? */


/* ************Solution********************
Intuition behind solution: Create a set. Iterate through all emails in the given array. 
For each email build its corresponding unique address ignoring periods and character that occur 
after a plus sign and come before the @ sign. Once you have created the unique email address, 
add it to the set. Once you have iterated through all emails that you're given, return the sets size.
*/

import java.util.HashSet;

public class UniqueEmailAddress {

	public static int numUniqueEmails(String[] emails) {
		HashSet<String> set = new HashSet<>();
		for (String email : emails) {
			StringBuilder address = new StringBuilder();
			for (int i = 0; i < email.length(); i++) {
				char c = email.charAt(i);
				if (c == '.') {
					continue;
				} else if (c == '+') {
					while (email.charAt(i) != '@') {
						i++;
					}
					address.append(email.substring(i + 1));
				} else {
					address.append(c);
				}
			}
			set.add(address.toString());
		}
		return set.size();
	}

	public static void main(String[] args) {
		String[] emails = { "abc@with.com", "dfg@with.com", "ade.sf@em.com", "an+d@wd.com", "abc@with.com" };
		System.out.println(numUniqueEmails(emails));
	}
}
