# Template Method

Duas classes: abstrata e a concreta

Na classe abstrata tem um método público que estrutura um processo que chama outros métodos da classe.

Dentre esses métodos podem haver métodos concretos, métodos abstratos e métodos concretos protected.

*Diferença para o Strategy:* o Strategy utiliza composição, polimorfismo, entre outros. O Template usa exclusivamente herança.

*Exemplo de uso dentro da JDK:* InputStream na JDK.

Vantagens:

- Conseguir sobrescrever pedaços do algoritmo.

Desvantagens:

- A herança pode gerar um acoplamento muito grande e gerar uma hierarquia grande de classes. O que pode engessar as classes.

Só utilizar, quando realmente for necessário, ou seja, quando tiver várias classes que vão implementar aquele método abstrato.