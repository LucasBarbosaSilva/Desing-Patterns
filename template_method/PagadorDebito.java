package template_method;

public class PagadorDebito extends ProcessadorPagamento{
  @Override
  protected void debita() {
    System.out.println("Debitando na conta....");
  }
}
