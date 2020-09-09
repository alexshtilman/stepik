package base;

public class IsPalindrome {
	/**
	 * Checks if given <code>text</code> is a palindrome.
	 *
	 * @param text any string
	 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
	 */
	public static boolean isPalindrome(String text) {
		//Madam, I'm Adam!  - true
		String replaced = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		StringBuilder textNew = new StringBuilder(replaced);	
	    return textNew.reverse().toString().equals(replaced);
	}
}
