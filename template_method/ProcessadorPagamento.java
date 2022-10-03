package template_method;

abstract class ProcessadorPagamento{
  public void processaPagamento(){
    prepara();
    valida();
    debita();
    notifica();
    notificaAdicional();
    finaliza();
    finalizaAdicional();
  }

  private void prepara(){
    System.out.println("Preparando...");
  }

  private void valida(){
    System.out.println("Validando...");
  }

  abstract protected void debita();

  protected void notifica(){
    System.out.println("Notificando...");
  }
  
  protected void notificaAdicional(){
  }

  protected void finaliza(){
    System.out.println("Finaliza...");
  }

  protected void finalizaAdicional(){
  }
}