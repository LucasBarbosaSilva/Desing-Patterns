package adapter;

import java.math.BigDecimal;

public class SdkExterna {
  void autoriza(BigDecimal valor){
    System.out.println("Autorizando "+valor);
  }

  void captura(BigDecimal valor){
    System.out.println("Capturando "+valor);
  }
  
  void credita(BigDecimal valor){
    System.out.println("Credita "+valor);
  }
}
