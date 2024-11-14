# Caso de Uso: Gerenciamento de Clientes

- **Ator Principal**: Funcionário da Barbearia
- **Objetivo**: Permitir que o funcionário gerencie o cadastro de clientes, incluindo operações de registro, edição, visualização e exclusão, com dados essenciais para futuros agendamentos e contatos.

## Fluxo Principal

1. O ator acessa o módulo de Gerenciamento de Clientes no sistema.
2. O sistema exibe uma lista dos clientes cadastrados com opções para **adicionar**, **editar** e **remover** clientes, além da **visualização** dos dados detalhados de cada cliente.

### 2.1. Adicionar Cliente
   - a. O ator seleciona a opção de adicionar um novo cliente.
   - b. O sistema exibe um formulário para o preenchimento dos dados do cliente.
   - c. O ator insere o **nome**, **e-mail** e **telefone** do cliente.
   - d. O sistema valida os dados fornecidos:
       - Verifica se o e-mail está no formato correto.
       - Verifica se o telefone possui o número de dígitos esperado.
   - e. Após a validação, o ator confirma o registro.
   - f. O sistema armazena as informações no banco de dados e exibe uma mensagem de sucesso indicando que o cliente foi registrado.

### 2.2. Editar Cliente
   - a. O ator seleciona um cliente existente na lista para edição.
   - b. O sistema exibe um formulário com os dados atuais do cliente.
   - c. O ator altera o **nome**, **e-mail** ou **telefone**, conforme necessário.
   - d. O sistema valida as alterações.
   - e. O ator confirma a edição.
   - f. O sistema atualiza as informações no banco de dados e exibe uma mensagem de sucesso indicando que os dados do cliente foram atualizados.

### 2.3. Visualizar Cliente
   - a. O ator seleciona um cliente na lista para visualizar.
   - b. O sistema exibe os detalhes do cliente, incluindo **nome**, **e-mail**, **telefone** e o **histórico de agendamentos** (caso disponível).
   - c. O ator pode optar por voltar à lista de clientes ou selecionar uma ação de edição ou exclusão.

### 2.4. Remover Cliente
   - a. O ator seleciona um cliente para remover.
   - b. O sistema solicita uma confirmação de remoção.
   - c. O ator confirma a remoção.
   - d. O sistema exclui o cliente do banco de dados e exibe uma mensagem de sucesso.

## Fluxos Alternativos

- **2.1.d / 2.2.d. Dados inválidos**:
   - Se algum dado fornecido for inválido, o sistema informa o erro ao ator e solicita a correção antes de permitir o cadastro ou edição.

- **2.4.b Cancelar remoção**:
   - O ator opta por cancelar a remoção do cliente.
   - O sistema retorna à lista de clientes sem realizar nenhuma alteração.

## Pré-condições

- O ator deve estar autenticado no sistema para acessar o módulo de Gerenciamento de Clientes.

## Pós-condições

- As informações dos clientes são adicionadas, atualizadas ou removidas do banco de dados conforme a ação realizada, permitindo o gerenciamento eficaz dos dados para contato e agendamentos futuros.
