package template_method;

public class Main {
  public static void main(String[] args) {
    PagadorCredito pagador = new PagadorCredito();
    pagador.processaPagamento();
    System.out.println("--------------------------------");
    PagadorDebito pagadorDebito = new PagadorDebito();
    pagadorDebito.processaPagamento();
  }
}
