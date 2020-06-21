package katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitMachine {
	public static int fruit(final String[][] reels, final int[] spins) {
		String firstItem = reels[0][spins[0]];
		String secondItem = reels[1][spins[1]];
		String thirdItem = reels[2][spins[2]];
		int points = 0;
	
		boolean isFirstEqualSecond = firstItem.equals(secondItem);
		boolean isFirstEqualThird = firstItem.equals(thirdItem);

		if (isFirstEqualSecond && isFirstEqualThird) {
			return 10 *  getScore(firstItem);
		}

		if (isFirstEqualSecond) {
			points = getScore(firstItem) * doubleForWild(thirdItem);
		}

		if (isFirstEqualThird) {
			points =  getScore(firstItem) * doubleForWild(secondItem);
		}

		if (thirdItem.equals(secondItem)) {
			points =  getScore(thirdItem) * doubleForWild(firstItem);
		}

		return points;
	}
	
	public static int getScore(String item) {
		List<String> images = Arrays.asList(new String[] { "Jack", "Queen", "King", "Bar", "Cherry", "Seven", "Shell", "Bell", "Star", "Wild" });
		return images.indexOf(item) + 1;
	}
			
	public static int doubleForWild(String item) {
		return item.equals("Wild")? 2 : 1;
	}

	public static int fruitOptimal(final String[][] reels, final int[] spins) {
		String s1 = reels[0][spins[0]];
		String s2 = reels[1][spins[1]];
		String s3 = reels[2][spins[2]];

		if (s1.equals(s2) && s1.equals(s3)) {
			return getScoreOptimal(s1) * 10;
		}
		if (s1.equals(s2) || s1.equals(s3) || s2.equals(s3)) {
			String s = s1.equals(s2) ? s3 : s1.equals(s3) ? s2 : s1;
			return getScoreOptimal(s2.equals(s3) ? s2 : s1) * (s.equals("Wild") ? 2 : 1);
		}
		return 0;
	}

	private static int getScoreOptimal(String s) {
		switch (s) {
		case "Wild":
			return 10;
		case "Star":
			return 9;
		case "Bell":
			return 8;
		case "Shell":
			return 7;
		case "Seven":
			return 6;
		case "Cherry":
			return 5;
		case "Bar":
			return 4;
		case "King":
			return 3;
		case "Queen":
			return 2;
		case "Jack":
			return 1;
		}
		return 0;
	}

}
