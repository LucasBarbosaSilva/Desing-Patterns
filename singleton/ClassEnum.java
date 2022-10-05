package singleton;

public enum ClassEnum {
  INSTANCE;

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
