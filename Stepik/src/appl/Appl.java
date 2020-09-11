package appl;

import static base.FlipBit.*;
import static base.IsPowerOfTwo.*;
import static base.Factorial.*;
import static base.MergeArrays.*;;

public class Appl {

	public static void main(String[] args) {
		// System.out.println(flipBit(0, 1));
		// isPowerOfTwo(8);
		// System.out.println(factorial(3));
		int[] a1 = { 0, 2, 2, 10, 10, 20 };
		int[] a2 = { 1, 3, 5, 7, 8, 10, 10 };

		mergeArrays(a1, a2);
	}

}
