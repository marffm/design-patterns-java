package creational.singletonPattern;

public class SingletonApplication {

  public static void main(String[] args) {
    SingletonClassInstance singletonClassInstance1 = SingletonClassInstance.getInstance();

    System.out.println(singletonClassInstance1);

    SingletonClassInstance singletonClassInstance2 = SingletonClassInstance.getInstance();

    System.out.println(singletonClassInstance2);
  }

}
