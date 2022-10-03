package template_method;

public class PagadorCredito extends ProcessadorPagamento{
  @Override
  public void debita() {
    System.out.println("Debitando");
  }

  @Override
  public void notificaAdicional(){
    System.out.println("Notificações opcionais....");
  }
}

