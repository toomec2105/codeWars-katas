package important.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import katas.CountingDuplicates;

class FibbonacciTest {
	
	  @Test public void fibbonacciAt0() { assertEquals(0, Fibbonacci.fibbonaci(0));
	  }
	  
	  @Test public void fibbonacciAt1() { assertEquals(1, Fibbonacci.fibbonaci(1));
	  }
	  
	  @Test public void fibbonacciAt2() { assertEquals(1, Fibbonacci.fibbonaci(2));
	  }
	  
	  @Test public void fibbonacciAt6() { assertEquals(8, Fibbonacci.fibbonaci(6));
	  }
	  
	  @Test public void fibbonacciAt13() { assertEquals(233,
	  Fibbonacci.fibbonaci(13)); 
	  }
	  
	  @Test public void fibbonacciBigIntegerAt0() { assertEquals(new BigInteger("0"), Fibbonacci.fibbonaciBigInteger( new BigInteger("0")));
	  }
	  
	  @Test public void fibbonacciBigIntegerAt1() { assertEquals(new BigInteger("1"), Fibbonacci.fibbonaciBigInteger(new BigInteger("1")));
	  }
	  
	  @Test public void fibbonacciBigIntegerAt2() { assertEquals(new BigInteger("1"), Fibbonacci.fibbonaciBigInteger(new BigInteger("2")));
	  }
	  
	  @Test public void fibbonacciBigIntegerAt6() { assertEquals(new BigInteger("8"), Fibbonacci.fibbonaciBigInteger(new BigInteger("6")));
	  }
	  
	  @Test public void fibbonacciBigIntegerAt13() { assertEquals(new BigInteger("233"), Fibbonacci.fibbonaciBigInteger(new BigInteger("13"))); 
	  }
	@Test
	public void fibbonacciAt20() {
		long start = System.currentTimeMillis();
		assertEquals(6765, Fibbonacci.fibbonaci(20));
		long end = System.currentTimeMillis();
		//System.out.println("20: " + (end - start));
		
		
		/*
		 * start = System.currentTimeMillis(); assertEquals(75025,
		 * Fibbonacci.fibbonaci(25)); end = System.currentTimeMillis();
		 * System.out.println("25: " + (end - start));
		 * 
		 * start = System.currentTimeMillis(); assertEquals(9227465,
		 * Fibbonacci.fibbonaci(35)); end = System.currentTimeMillis();
		 * System.out.println("35: " + (end - start));
		 * 
		 * start = System.currentTimeMillis(); assertEquals(14930352,
		 * Fibbonacci.fibbonaci(36)); end = System.currentTimeMillis();
		 * System.out.println("36: " + (end - start));
		 * 
		 * start = System.currentTimeMillis(); assertEquals(24157817,
		 * Fibbonacci.fibbonaci(37)); end = System.currentTimeMillis();
		 * System.out.println("37: " + (end - start));
		 * 
		 * start = System.currentTimeMillis(); assertEquals(39088169,
		 * Fibbonacci.fibbonaci(38)); end = System.currentTimeMillis();
		 * System.out.println("38: " + (end - start));
		 * 
		 * start = System.currentTimeMillis(); assertEquals(63245986,
		 * Fibbonacci.fibbonaci(39)); end = System.currentTimeMillis();
		 * System.out.println("39: " + (end - start));
		 * 
		 * start = System.currentTimeMillis(); assertEquals(102334155,
		 * Fibbonacci.fibbonaci(40)); end = System.currentTimeMillis();
		 * System.out.println("40: " + (end - start));
		 */
	}
}
