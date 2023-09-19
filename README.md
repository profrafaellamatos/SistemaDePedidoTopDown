# Sistema de Pedidos de Restaurante

Este é um projeto de sistema simples de pedidos de restaurante que permite aos usuários fazer pedidos de itens do menu. O sistema é composto por três classes principais: `Pedidos`, `ItemDoPedido` e `ItemDoMenu`.
Este exemplo foi criado para ser utilizado na aula de Teste de Software para tratar de testes de integração com a abordagem Top Down.

## Estrutura do Projeto

- **Pedidos**: A classe `Pedidos` representa um pedido feito por um cliente. Ela contém informações sobre os itens do pedido, e funcionalidades para adicionar um novo item no pedido e calcular o total do pedido.

- **ItemDoPedido**: A classe `ItemDoPedido` representa um item específico em um pedido. Ela armazena informações sobre o nome do item, a quantidade e o preço por item em função da quantidade.

- **ItemDoMenu**: A classe `ItemDoMenu` representa um item disponível no menu do restaurante. Ela inclui informações sobre o nome do item e o preço unitário.

## Testes de Integração

Este projeto utiliza a abordagem Big Bang para testes de integração, o que significa que os testes são realizados de maneira abrangente após a implementação de todas as classes principais.

Para realizar testes de integração, siga os passos abaixo:

1. Certifique-se de que todas as classes (`Pedidos`, `ItemDoPedido` e `ItemDoMenu`) estão implementadas e funcionando corretamente.

2. Crie instâncias de `ItemDoMenu` para representar os itens disponíveis no menu do restaurante.

3. Crie instâncias de `Pedidos` e adicione `ItemDoPedido` a eles usando os itens do menu.

4. Verifique se os cálculos de preços totais estão corretos para os pedidos.

5. Execute uma série de testes abrangentes para garantir que todas as interações entre as classes estejam funcionando conforme o esperado.

## Como Usar

Para usar este sistema de pedidos de restaurante em seu próprio projeto, siga estas etapas:

1. Clone este repositório para o seu ambiente local.

2. Importe as classes `Pedidos`, `ItemDoPedido` e `ItemDoMenu` no seu projeto.

3. Crie instâncias dessas classes de acordo com as necessidades do seu restaurante.

4. Utilize as funções e métodos disponíveis nas classes para criar pedidos, adicionar itens do menu aos pedidos e calcular preços totais.

5. Implemente os testes de integração conforme necessário para garantir o funcionamento correto do sistema.

