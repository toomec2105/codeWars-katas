package katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingLetterFinderTest {

	@Test
    public void testLetterFinder() {
        assertEquals('e', MissingLetterFinder.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', MissingLetterFinder.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
	@Test
    public void testLetterFinderOptimal() {
        assertEquals('e', MissingLetterFinder.findMissingLetterOptimal(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', MissingLetterFinder.findMissingLetterOptimal(new char[] { 'O','Q','R','S' }));
    }
}
