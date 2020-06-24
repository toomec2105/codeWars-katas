package katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DuplicateEncoderTest {
    @Test
    public void test() {
      assertEquals(")()())()(()()(",
            DuplicateEncoder.encode("Prespecialized"));
      assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
    
    @Test
    public void testOptimalEncoder() {
      assertEquals(")()())()(()()(",
            DuplicateEncoder.encodeOptimal("Prespecialized"));
      assertEquals("))))())))",DuplicateEncoder.encodeOptimal("   ()(   "));
    }
}