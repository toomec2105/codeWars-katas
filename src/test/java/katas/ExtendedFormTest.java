package katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExtendedFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", WriteNumberInExtendedForm.expandedForm(12)); 
        assertEquals("40 + 2", WriteNumberInExtendedForm.expandedForm(42)); 
        assertEquals("70000 + 300 + 4", WriteNumberInExtendedForm.expandedForm(70304)); 
     }
}