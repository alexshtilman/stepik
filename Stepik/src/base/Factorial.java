package base;

import java.math.BigInteger;

public class Factorial {
	/**
	 * Calculates factorial of given <code>value</code>.
	 *
	 * @param value positive number
	 * @return factorial of <code>value</code>
	 */
	public static BigInteger Factorial(int value) {
		return  value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(Factorial (value-1));
	}
}
