package adapter;

import java.math.BigDecimal;

public interface IPagador {
  void debita(BigDecimal valor);

  void credita(BigDecimal valor);
}
