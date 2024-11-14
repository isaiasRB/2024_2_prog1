# Caso de Uso: Gerenciamento de Procedimentos

- **Ator Principal**: Administrador da Barbearia
- **Objetivo**: Permitir que o administrador gerencie os procedimentos oferecidos pela barbearia, incluindo cadastro, edição, visualização e exclusão, com informações sobre o percentual de cobrança dos profissionais e o status de disponibilidade dos procedimentos.

## Fluxo Principal

1. O ator acessa o módulo de Gerenciamento de Procedimentos no sistema.
2. O sistema exibe uma lista dos procedimentos cadastrados com opções para **adicionar**, **editar**, **remover** e **visualizar** detalhes de cada procedimento.

### 2.1. Adicionar Procedimento

- a. O ator seleciona a opção de adicionar um novo procedimento.
- b. O sistema exibe um formulário para o preenchimento dos dados do procedimento.
- c. O ator insere:
  - **Nome do procedimento**: Nome do procedimento que os clientes costuma solicitar. Ex.: Corte de cabelo com máquina, Corte com tesoura, Aparar barba.
  - **Percentual de cobrança**: O percentual do valor que é retido do valor pago pelo cliente para o profissional.
  - **Descrição**: uma breve descrição do procedimento que é realizado.
  - **Status do procedimento**: com as opções: ativo, suspenso ou inativo.
- d. O sistema valida os dados fornecidos.
- e. Após a validação, o ator confirma o registro do procedimento.
- f. O sistema armazena as informações no banco de dados e exibe uma mensagem de sucesso indicando que o procedimento foi cadastrado.

### 2.2. Editar Procedimento

- a. O ator seleciona um procedimento existente na lista para edição.
- b. O sistema exibe um formulário com os dados atuais do procedimento.
- c. O ator altera o **nome**, **descrição**, **percentual de cobrança** ou **status** conforme necessário.
- d. O sistema valida as alterações.
- e. O ator confirma a edição.
- f. O sistema atualiza as informações no banco de dados e exibe uma mensagem de sucesso indicando que o procedimento foi atualizado.

### 2.3. Visualizar Procedimento

- a. O ator seleciona um procedimento para visualizar detalhes.
- b. O sistema exibe os detalhes do procedimento, incluindo o **nome**, **descrição**, **percentual de cobrança**, e o **status**.
- c. O ator pode optar por voltar à lista de procedimentos ou selecionar uma ação de edição ou exclusão.

### 2.4. Remover Procedimento

- a. O ator seleciona um procedimento para remover.
- b. O sistema solicita uma confirmação de remoção.
- c. O ator confirma a remoção.
- d. O sistema exclui o procedimento do banco de dados e exibe uma mensagem de sucesso.

## Fluxos Alternativos

- **2.1.d / 2.2.d. Dados inválidos**:
   - Se algum dado fornecido for inválido (por exemplo, um valor incorreto para o percentual de cobrança), o sistema informa o erro ao ator e solicita a correção antes de permitir o cadastro ou edição.

- **2.4.b Cancelar remoção**:
   - O ator opta por cancelar a remoção do procedimento.
   - O sistema retorna à lista de procedimentos sem realizar nenhuma alteração.

## Pré-condições

- O ator deve estar autenticado e autorizado no sistema para acessar o módulo de Gerenciamento de Procedimentos.

## Pós-condições

- As informações dos procedimentos são adicionadas, atualizadas ou removidas do banco de dados conforme a ação realizada, permitindo o gerenciamento eficaz dos procedimentos disponíveis e a respectiva cobrança dos profissionais.
