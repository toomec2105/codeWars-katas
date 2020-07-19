package important.recursion;

import java.math.BigInteger;

public class Fibbonacci {
	public static int fibbonaci(int index) {

		if (index == 0 || index == 1) {
			return index;
		}
		
		return fibbonaci(index - 1) + fibbonaci(index - 2);

	}
	public static BigInteger fibbonaciBigInteger(BigInteger index) {

		/*
		 * if (index.equals(new BigInteger("0")) || index.equals(new BigInteger("1"))) {
		 * return index; }
		 * 
		 * return fibbonaciBigInteger(index.add(new
		 * BigInteger("-1"))).add(fibbonaciBigInteger(index.add(new BigInteger("-2"))));
		 */
		if (index.equals(BigInteger.ZERO) || index.equals(BigInteger.ONE)) {
			return index;
		}
		
		return fibbonaciBigInteger(index.subtract(BigInteger.ONE)).add(fibbonaciBigInteger(index.subtract(new BigInteger("2"))));
	}
}
