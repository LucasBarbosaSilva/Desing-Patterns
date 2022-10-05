package singleton;

public class ClassLazy {
  
  private static ClassLazy instance;

  private ClassLazy(){
  }

  public static ClassLazy getInstance(){
    if(instance == null){
      instance = new ClassLazy();
    }
    return instance;
  }

  public String convertString(int op){
    switch(op){
      case 1:
        return "Um";
      case 2:
        return "Dois";
      default:
        return "Outro";
    }
  }
}
