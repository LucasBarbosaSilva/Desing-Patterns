# Adapter (Wrapper)

Simples:

- Classe aberta: que você pode alterar
- Classe fechada: uma SDK que você não consegue modificar
- Classe Adpter: é uma adaptadora, converte um em outro.

Conceitos:

- Client (Quem usa o adaptador)
- Adapter (Quem embrulha a classe externa)
- Adaptee (Classe externa que será embrulhada)

Utilizando composição:

- Adiciona uma interface que define como vai ser minha classe adaptadora.
- Geralmente mais utilizado com framworks e bibliotecas, pois estrutura melhor o projeto de software.
- Interface: Target (Alvo)

Posso utilizar como herança:

- Ao invés de utilizar o objeto, utilizo o super.

Vantagens da herança:

- Não tenho duas instâncias;
- Implementação de mão dupla: não só adapta, como **É** a sdk que ele adapta.

Vantagens da composição:

- Deixa mais flexível, posso adaptar vários objetos.

Desvantagens:

- Deixa maior, mais classes, mais coisas que podem quebrar.