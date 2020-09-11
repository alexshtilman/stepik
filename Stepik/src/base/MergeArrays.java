package base;


public class MergeArrays {
	/**
	 * Merges two given sorted arrays into one
	 *
	 * @param a1 first sorted array
	 * @param a2 second sorted array
	 * @return new array containing all elements from a1 and a2, sorted
	 */
	public static int[] mergeArrays(int[] a1, int[] a2) {
		if(a1.length==0)
			return a2;
		if(a2.length==0)
			return a1;
		int [] a3 =new int[a1.length + a2.length];;
		
		int i=0, j=0, k=0;
		while(i < a1.length && j < a2.length) {
		  a3[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
		}
		if(i< a1.length) {
			System.arraycopy(a1, i, a3, k, a1.length - i);
		} else if(j< a2.length) {
			System.arraycopy(a2, j, a3, k, a2.length - j);
		}
		return a3;
	}
}
