package katas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zooDisaster {

	public static String[] whoEatsWho(final String zoo) {
		ArrayList<String> output = new ArrayList<String>();
		output.add(zoo);
		LinkedList<String> animals = new LinkedList<String>(Arrays.asList(zoo.split(",")));

		for (int i = 0; i < animals.size(); i++) {
			if (i < 0) {
				continue;
			}

			String predator = animals.get(i);
			int previousAnimal = i - 1;
			if (i > 0 && isEatable(predator, animals.get(previousAnimal))) {

				output.add(predator + " eats " + animals.get(previousAnimal));
				animals.remove(previousAnimal);
				i = i - 3;

				continue;
			}

			int nextAnimal = i + 1;

			if (i < animals.size() - 1 && isEatable(predator, animals.get(nextAnimal))) {

				output.add(predator + " eats " + animals.get(nextAnimal));
				animals.remove(nextAnimal);
				i = i - 1;
			}

		}
		output.add(String.join(",", animals));

		return output.toArray(new String[] {});
	}

	public static boolean isEatable(String predator, String victim) {
		HashMap<String, HashSet<String>> animalFoodsMap = new HashMap<String, HashSet<String>>();

		animalFoodsMap.put("antelope", new HashSet<>(Arrays.asList(new String[] { "grass" })));
		animalFoodsMap.put("big-fish", new HashSet<>(Arrays.asList(new String[] { "little-fish" })));
		animalFoodsMap.put("bug", new HashSet<>(Arrays.asList(new String[] { "leaves" })));
		animalFoodsMap.put("bear",
				new HashSet<>(Arrays.asList(new String[] { "bug", "big-fish", "chicken", "cow", "leaves", "sheep" })));
		animalFoodsMap.put("chicken", new HashSet<>(Arrays.asList(new String[] { "bug" })));
		animalFoodsMap.put("cow", new HashSet<>(Arrays.asList(new String[] { "grass" })));
		animalFoodsMap.put("fox", new HashSet<>(Arrays.asList(new String[] { "chicken", "sheep" })));
		animalFoodsMap.put("giraffe", new HashSet<>(Arrays.asList(new String[] { "leaves" })));
		animalFoodsMap.put("lion", new HashSet<>(Arrays.asList(new String[] { "antelope", "cow" })));
		animalFoodsMap.put("panda", new HashSet<>(Arrays.asList(new String[] { "leaves" })));
		animalFoodsMap.put("sheep", new HashSet<>(Arrays.asList(new String[] { "grass" })));

		Set<String> foods = animalFoodsMap.get(predator);
		if (foods != null) {
			return foods.contains(victim);
		}

		return false;
	}

	public static String[] whoEatsWhoRecursive(final String zoo) {
		List<String> output = new LinkedList<String>(); 
		output.add(zoo);
		
		LinkedList<String> animals = new LinkedList<String>(Arrays.asList(zoo.split(",")));

		List<String> zooEvents = whoEatsWhoRecursiveInternal(animals, 0, new LinkedList<String>());
		output.addAll(zooEvents);
		return output.toArray(new String[] {});
	}

	private static List<String> whoEatsWhoRecursiveInternal(final List<String> animals, final int curIndex, final List<String> output) {
		
		System.out.println("----------------------------Enter recursive internal");
		System.out.println("animals: " + animals.toString());
		System.out.println( " output: " + output);
		// stop condition(when to return)
		int nextAnimal = curIndex + 1;
		
		if (curIndex >= animals.size() || animals.size() == 1 || nextAnimal >= animals.size()) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!! Entered the Stop condition");
			output.add(String.join(",", animals));
			return output;
		}
		// logic which will call whoEatsWhoRecursiveInternal
		//whoEatsWhoRecursiveInternal(animals, curIndex + 1, output);
				
		int newIndex = curIndex;
		
		// eats to the left
		int previousAnimal = curIndex - 1;
		/*
		 * if(previousAnimal < 0) { whoEatsWhoRecursiveInternal(animals, curIndex + 1,
		 * output); }
		 */
		String predator = animals.get(curIndex);
		if(previousAnimal >= 0 && isEatable(predator, animals.get(previousAnimal))) {			
			System.out.println("<<<<<<<<  Entered eatLeft condition");
			output.add(predator + " eats " + animals.get(previousAnimal));
			animals.remove(previousAnimal);
			newIndex = curIndex -2;
		}
		
		// eats to the right without eating to the left
		if(nextAnimal < animals.size() && isEatable(predator, animals.get(nextAnimal))) {		
			System.out.println("<<<<<<<<  Entered eatRight condition");
			output.add(predator + " eats " + animals.get(nextAnimal));
			animals.remove(nextAnimal);
			newIndex = curIndex;
		}
		
		System.out.println("<><><><><><><><><><><>  Doesn;t eat left or right");
		whoEatsWhoRecursiveInternal(animals, newIndex, output);
		return output;
	}

}