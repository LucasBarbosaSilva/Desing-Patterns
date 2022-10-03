package adapter;

import java.math.BigDecimal;

public class MeuPagador implements IPagador {
  SdkExterna sdk = new SdkExterna();
  public void debita(BigDecimal valor){
    sdk.autoriza(valor);
    sdk.captura(valor);
  }

  public void credita(BigDecimal valor){
    sdk.credita(valor);
  }
}
