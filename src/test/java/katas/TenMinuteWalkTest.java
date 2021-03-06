package katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TenMinuteWalkTest {

	@Test
	  public void tenMinuteWalk() {
	    assertEquals(true, TenMinuteWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
	    assertEquals(false, TenMinuteWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
	    assertEquals(false, TenMinuteWalk.isValid(new char[] {'w'}));
	    assertEquals(false, TenMinuteWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
	  }
	
	@Test
	  public void tenMinuteWalkOptimal() {
	    assertEquals(true, TenMinuteWalk.isValidOptimal(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
	    assertEquals(false, TenMinuteWalk.isValidOptimal(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
	    assertEquals(false, TenMinuteWalk.isValidOptimal(new char[] {'w'}));
	    assertEquals(false, TenMinuteWalk.isValidOptimal(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
	  }
}
