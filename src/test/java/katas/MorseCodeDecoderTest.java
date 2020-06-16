package katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
@Disabled
public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
      assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), ("HEY JUDE"));
    }
}