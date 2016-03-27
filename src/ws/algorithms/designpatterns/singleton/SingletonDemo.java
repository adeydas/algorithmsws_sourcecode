package ws.algorithms.designpatterns.singleton;

/**
 * https://algorithms.ws/Singleton_Pattern
 */
public class SingletonDemo {
  public static void main(String... args) {
    System.out.println("Got a singleton: " + Singleton.getInstance().getClass().getName());
  }
}
