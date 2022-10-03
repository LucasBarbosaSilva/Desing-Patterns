package adapter;

import java.math.BigDecimal;

public class Adapater {
  public static void main(String[] args) {
    MeuPagador debito = new MeuPagador();
    debito.debita(new BigDecimal("100"));
    MeuPagador credito = new MeuPagador();
    credito.credita(new BigDecimal("100"));
  }
}
