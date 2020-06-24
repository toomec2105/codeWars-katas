package katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class zooDisasterTest {

  @Test
  public void example() {    
    final String input = "fox,bug,chicken,grass,sheep";
    final String[] expected = 	{
      "fox,bug,chicken,grass,sheep", 
      "chicken eats bug", 
      "fox eats chicken", 
      "sheep eats grass", 
      "fox eats sheep", 
      "fox"};
    assertArrayEquals(expected, zooDisaster.whoEatsWho(input));
  }

}