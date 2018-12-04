

public class Euclid {
	/**
	 * Implementation requirement: must do recursively, as given in the spec.
	 * @param a First integer
	 * @param b Second integer
	 * @return The greatest common divisor of a and b using Euclid's recursive algorithm. 
	 */
	public static long gcd(long a, long b) {
		long min = Math.min(a, b);
		long max = Math.max(a, b);
		return (min == 0 || max == 0) ? min + max : gcd(min, max - min);
	}

}
