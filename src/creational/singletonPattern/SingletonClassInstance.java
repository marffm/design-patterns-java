package creational.singletonPattern;

public class SingletonClassInstance {

  private static SingletonClassInstance singletonClassInstance;

  private SingletonClassInstance(){}

  public static SingletonClassInstance getInstance(){
    if (singletonClassInstance == null)
      synchronized (SingletonClassInstance.class) {
        if (singletonClassInstance == null)
          singletonClassInstance = new SingletonClassInstance();
      }

    return singletonClassInstance;
  }
}
