package katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExtendedFormTest {
    @Test
    public void testExtendedForm() {
        assertEquals("10 + 2", WriteNumberInExtendedForm.expandedForm(12)); 
        assertEquals("40 + 2", WriteNumberInExtendedForm.expandedForm(42)); 
        assertEquals("70000 + 300 + 4", WriteNumberInExtendedForm.expandedForm(70304)); 
     }
    
    @Test
    public void testOptimalExtendedForm() {
        assertEquals("10 + 2", WriteNumberInExtendedForm.expandedFormOptimal(12)); 
        assertEquals("40 + 2", WriteNumberInExtendedForm.expandedFormOptimal(42)); 
        assertEquals("70000 + 300 + 4", WriteNumberInExtendedForm.expandedFormOptimal(70304)); 
     }
}