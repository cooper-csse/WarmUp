

/**
 * This utility class can test whether two strings are anagrams.
 *
 * @author Claude Anderson.
 */
public class Anagram {

	/**
	 * We say that two strings are anagrams if one can be transformed into the
	 * other by permuting the characters (and ignoring case).
	 * 
	 * For example, "Data Structure" and "Saturated Curt" are anagrams,
	 * as are "Elvis" and "Lives".
	 * 
	 * @param s1
	 *            first string
	 * @param s2
	 *            second string
	 * @return true iff s1 is an anagram of s2
	 */
	public static boolean isAnagram(String s1, String s2) {
		String string1 = s1.toLowerCase();
		String string2 = s2.toLowerCase();
		if (string1.length() == string2.length()) {
			for (int i = 0; i < string1.length(); i++) {
				string2 = string2.replaceFirst(String.valueOf(string1.charAt(i)), "");
			}
		}
		return string2.length() == 0;
	}
}
