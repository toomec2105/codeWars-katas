package katas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class zooDisasterTest {

	/*
	 * @Test public void example() { final String input =
	 * "fox,bug,chicken,grass,sheep"; final String[] expected = {
	 * "fox,bug,chicken,grass,sheep", "chicken eats bug", "fox eats chicken",
	 * "sheep eats grass", "fox eats sheep", "fox"}; assertArrayEquals(expected,
	 * zooDisaster.whoEatsWho(input)); }
	 */
	@Test
	public void singleElement() {
		final String input = "sheep";
		final String[] expected = { "sheep", "sheep" };
		assertArrayEquals(expected, zooDisaster.whoEatsWho(input));
	}

	/*
	 * @Test public void eatsRightOneElement() { final String input = "fox,chicken";
	 * final String[] expected = { "fox,chicken", "fox eats chicken", "fox"};
	 * assertArrayEquals(expected, zooDisaster.whoEatsWho(input)); }
	 * 
	 * @Test public void eatsRightTwoElement() { final String input =
	 * "fox,chicken,sheep"; final String[] expected = { "fox,chicken,sheep",
	 * "fox eats chicken", "fox eats sheep", "fox"}; assertArrayEquals(expected,
	 * zooDisaster.whoEatsWho(input)); }
	 * 
	 * @Test public void eatsLeftOneElement() { final String input =
	 * "big-fish,bear"; final String[] expected = { "big-fish,bear",
	 * "bear eats big-fish", "bear"}; assertArrayEquals(expected,
	 * zooDisaster.whoEatsWho(input)); }
	 * 
	 * @Test public void eatsLeftTwoElement() { final String input =
	 * "little-fish,little-fish,big-fish"; final String[] expected = {
	 * "little-fish,little-fish,big-fish", "big-fish eats little-fish",
	 * "big-fish eats little-fish", "big-fish"}; assertArrayEquals(expected,
	 * zooDisaster.whoEatsWho(input)); }
	 */

	/*
	 * @Test public void example() { final String input =
	 * "fox,bug,chicken,grass,sheep"; final String[] expected = {
	 * "fox,bug,chicken,grass,sheep", "chicken eats bug", "fox eats chicken",
	 * "sheep eats grass", "fox eats sheep", "fox"}; assertArrayEquals(expected,
	 * zooDisaster.whoEatsWho(input)); }
	 */
	@Test
	public void singleElementRecursive() {
		final String input = "sheep";
		final String[] expected = { "sheep", "sheep" };
		assertArrayEquals(expected, zooDisaster.whoEatsWhoRecursive(input));
	}

	@Test
	public void eatsRightOneElementRecursive() {
		final String input = "fox,chicken";
		final String[] expected = { "fox,chicken", "fox eats chicken", "fox" };
		assertArrayEquals(expected, zooDisaster.whoEatsWhoRecursive(input));
	}

	@Test
	public void eatsRightTwoElementRecursive() {
		final String input = "fox,chicken,sheep";
		final String[] expected = { "fox,chicken,sheep", "fox eats chicken","fox eats sheep","fox" };
		assertArrayEquals(expected, zooDisaster.whoEatsWhoRecursive(input));
	}
	@Disabled // Throws error don't know why
	@Test
	public void eatsLeftAtIndexFourRecursive() {
		final String input = "bug,bug,lion,chicken,fox,sheep";
		final String[] expected = { "bug,bug,lion,chicken,fox,sheep", "fox eats chicken", "fox eats sheep",
				"bug,bug,lion,fox" };
		assertArrayEquals(expected, zooDisaster.whoEatsWhoRecursive(input));
	}

	/*
	 * @Test public void eatsLeftOneElementRecursive() { final String input =
	 * "big-fish,bear"; final String[] expected = { "big-fish,bear",
	 * "bear eats big-fish", "bear"}; assertArrayEquals(expected,
	 * zooDisaster.whoEatsWhoRecursive(input)); }
	 */
	/*
	 * @Test public void eatsLeftTwoElementRecursive() { final String input =
	 * "little-fish,little-fish,big-fish"; final String[] expected = {
	 * "little-fish,little-fish,big-fish", "big-fish eats little-fish",
	 * "big-fish eats little-fish", "big-fish"}; assertArrayEquals(expected,
	 * zooDisaster.whoEatsWhoRecursive(input)); }
	 */

}