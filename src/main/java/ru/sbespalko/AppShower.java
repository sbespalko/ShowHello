package ru.sbespalko;

import java.util.LinkedHashMap;

/**
 * @author bespalko
 * @since 18.12.2017
 */
public class AppShower {
  public void showNumber() {
    System.out.printf("Random number: %2.2f", Math.random()*100);
  }
  public static void main(String[] args) {
    System.out.println("Hello " + AppShower.class);
    new AppShower().showNumber();
    System.out.println("exit from" + AppShower.class);
    System.out.println("dirty?");
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    map.put("1", 1);
    map.put("2", 2);
    map.put("3", 3);
    map.put("2", 10);
    map.remove("2");
    map.put("2", 20);
    map.replace("3", 30);
    System.out.println(map.toString());
  }
}
