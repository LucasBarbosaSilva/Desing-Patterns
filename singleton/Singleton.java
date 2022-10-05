package singleton;

/**
 * Singleton
 */
public class Singleton {
  public static void main(String[] args) {
    System.out.println(ClassEnum.INSTANCE.convertString(1));
    System.out.println(ClassLazy.getInstance().convertString(0));
  }
  
}