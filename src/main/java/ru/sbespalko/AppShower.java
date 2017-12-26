package ru.sbespalko;
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
  }
}
