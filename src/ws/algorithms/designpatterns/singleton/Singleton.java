package ws.algorithms.designpatterns.singleton;

/**
 * https://algorithms.ws/Singleton_Pattern
 */
public class Singleton {
  private static Singleton singleton = new Singleton();

  public static Singleton getInstance() {
    return singleton;
  }

  private Singleton() {}
}
