package katas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MexicanWaveTest {

    @Test
    public void basicTest1() {
        String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals(result, MexicanWave.wave("hello"));
    }
    
   @Test
    public void basicTest2() {
        String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
        assertArrayEquals(result, MexicanWave.wave("codewars"));
    }
    
    @Test
    public void basicTest3() {
        String[] result = new String[] { };
        assertArrayEquals(result, MexicanWave.wave(""));
    }
    
    @Test
    public void basicTest4() {
        String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        assertArrayEquals(result, MexicanWave.wave("two words"));
    }
    
    @Test
    public void basicTest5() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals(result, MexicanWave.wave(" gap "));
    }
    
    @Test
    public void basicOptimalTest1() {
        String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals(result, MexicanWave.waveOptimal("hello"));
    }
    
   @Test
    public void basicOptimalTest2() {
        String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
        assertArrayEquals(result, MexicanWave.waveOptimal("codewars"));
    }
    
    @Test
    public void basicOptimalTest3() {
        String[] result = new String[] { };
        assertArrayEquals(result, MexicanWave.waveOptimal(""));
    }
    
    @Test
    public void basicOptimalTest4() {
        String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        assertArrayEquals(result, MexicanWave.waveOptimal("two words"));
    }
    
    @Test
    public void basicOptimalTest5() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals(result, MexicanWave.waveOptimal(" gap "));
    }
    
    
    
    
}
