package ru.sbespalko;
/**
 * @author bespalko
 * @since 18.12.2017
 */
public class App {
  public void showNumber() {
    System.out.printf("Random number: %2.2f", Math.random()*100);
  }
  public static void main(String[] args) {
    System.out.println("Hello " + App.class);
    new App().showNumber();
  }
}
