package katas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class zooDisaster {

  public static String[] whoEatsWho(final String zoo) {
    ArrayList<String> output = new ArrayList<String>();
    output.add(zoo);
    LinkedList<String> animals = new LinkedList<String>(Arrays.asList(zoo.split(",")));
   
      
    
    
    for(int i = 0; i < animals.size(); i++){
    if(i < 0){
      continue;
    }
    
      String predator = animals.get(i);
      int previousAnimal = i - 1; 
      if(i > 0 && isEatable(predator, animals.get(previousAnimal))){
      
        output.add(predator + " eats " + animals.get(previousAnimal));
        animals.remove(previousAnimal);
        i = i - 3;
        
        continue;
      }
      
      int nextAnimal = i + 1;
      
      if(i < animals.size() - 1 && isEatable(predator, animals.get(nextAnimal))){
      
        output.add(predator + " eats " + animals.get(nextAnimal));
        animals.remove(nextAnimal);
        i = i - 1;
      }
      
    }
    output.add(createFinalZoo(animals));
    
    return output.toArray(new String[] {});
  }
  public static String createFinalZoo(LinkedList<String> animals) {
    String finalZoo = "";
    
      for(int i = 0; i < animals.size(); i++){
        finalZoo += animals.get(i);
        finalZoo += i == animals.size()-1 ? "" : ",";
      
      }
    return finalZoo;
  }
  public static boolean isEatable(String predator, String victim) {
    HashMap<String, HashSet<String>> animalFoodsMap = new HashMap<String, HashSet<String>>(); 
    
    animalFoodsMap.put("antelope", new HashSet<>(Arrays.asList(new String[] {"grass"})));
    animalFoodsMap.put("big-fish", new HashSet<>(Arrays.asList(new String[] {"little-fish"})));
    animalFoodsMap.put("bug", new HashSet<>(Arrays.asList(new String[] {"leaves"})));
    animalFoodsMap.put("bear", new HashSet<>(Arrays.asList(new String[] {"bug", "big-fish", "chicken", "cow", "leaves", "sheep"})));
    animalFoodsMap.put("chicken", new HashSet<>(Arrays.asList(new String[] {"bug"})));
    animalFoodsMap.put("cow", new HashSet<>(Arrays.asList(new String[] {"grass"})));
    animalFoodsMap.put("fox", new HashSet<>(Arrays.asList(new String[] {"chicken", "sheep"})));
    animalFoodsMap.put("giraffe", new HashSet<>(Arrays.asList(new String[] {"leaves"})));
    animalFoodsMap.put("lion", new HashSet<>(Arrays.asList(new String[] {"antelope", "cow"})));
    animalFoodsMap.put("panda", new HashSet<>(Arrays.asList(new String[] {"leaves"})));
    animalFoodsMap.put("sheep", new HashSet<>(Arrays.asList(new String[] {"grass"})));
    
    Set<String> foods = animalFoodsMap.get(predator);
    if(foods != null){
      return foods.contains(victim);
    }
    
    return false;
  }
  
}