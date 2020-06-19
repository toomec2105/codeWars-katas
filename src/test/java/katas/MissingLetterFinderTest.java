package katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingLetterFinderTest {

	@Test
    public void exampleTests() {
        assertEquals('e', MissingLetterFinder.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', MissingLetterFinder.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

}
