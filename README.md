#### Problema com a Estrutura Original

A interface monolítica `GerenciadorDeClientes` combina responsabilidades distintas (cadastro, comunicação e fidelidade/VIP) em uma única interface. Isso força todas as classes que a implementam a dependerem de métodos que podem ser irrelevantes para suas responsabilidades. Essa abordagem viola o **Princípio da Segregação de Interfaces (ISP)**, que recomenda que as interfaces sejam específicas para o uso de seus clientes.

**Exemplo de Problema:**
- A classe `ClienteComumService` é obrigada a implementar os métodos `enviarNotificacao` e `aplicarDescontoVIP`, que não fazem sentido para clientes comuns. Isso resulta em:
    - Métodos que lançam exceções (`UnsupportedOperationException`) ou ficam vazios, o que é um sinal claro de violação do ISP.
    - Código desnecessário, aumentando a complexidade e dificultando a manutenção.

#### Resolução na Estrutura Atual

A solução foi dividir a interface monolítica em interfaces menores e mais específicas, cada uma representando uma responsabilidade única. Assim, as classes implementam apenas os métodos relevantes às suas funções.

**Mudanças Realizadas:**
1. **Segregação de Interfaces**:
    - A interface `GerenciadorDeClientes` foi dividida em interfaces menores, como `Cadastro`, `Notificador` e `Fidelidade`.
    - Cada classe implementa apenas as interfaces necessárias.

2. **Exemplo de Aplicação**:
    - `ClienteVIPService` implementa todas as interfaces, pois utiliza todas as funcionalidades.
    - `ClienteComumService` implementa apenas a interface de cadastro, eliminando métodos irrelevantes.

#### Benefícios da Nova Estrutura

1. **Aderência ao ISP**: As classes não são mais forçadas a implementar métodos que não utilizam.
2. **Modularidade**: Interfaces menores tornam o código mais coeso e fácil de entender.
3. **Facilidade de Manutenção**: Alterações em uma funcionalidade específica não afetam classes que não a utilizam.
4. **Extensibilidade**: Novos serviços podem ser adicionados sem impactar as classes existentes.