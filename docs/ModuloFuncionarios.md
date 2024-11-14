# Caso de Uso: Gerenciamento de Funcionários

- **Ator Principal**: Administrador da Barbearia
- **Objetivo**: Permitir que o ator cadastre, visualize, edite ou remova funcionários, armazenando as informações necessárias para organizar a equipe e seus papéis.

## Fluxo Principal

1. O ator acessa o módulo de Gerenciamento de Funcionários no sistema.
2. O sistema exibe a lista de funcionários cadastrados com opções de **adicionar**, **editar** e **remover** funcionários.

### 2.1. Adicionar Funcionário

1. O ator seleciona a opção de adicionar um novo funcionário.
1. O sistema apresenta um formulário para o preenchimento dos dados do funcionário.
1. O ator insere o **nome**, **cargo**, uma **breve descrição** das responsabilidades ou especialidades do funcionário, e o **status** (com opções: ativo, férias, afastado, inativo).
1. O sistema valida os dados fornecidos e, em seguida, o ator confirma o cadastro.
1. O sistema armazena as informações no banco de dados e exibe uma mensagem de sucesso indicando que o funcionário foi cadastrado.

### 2.2. Editar Funcionário

1. O ator seleciona um funcionário existente na lista.
1. O sistema exibe um formulário com os dados atuais do funcionário.
1. O ator altera o **nome**, **cargo**, **descrição** ou **status**, conforme necessário.
1. O sistema valida as alterações e o ator confirma a edição.
1. O sistema atualiza as informações no banco de dados e exibe uma mensagem de sucesso indicando que os dados do funcionário foram atualizados.

### 2.3. Remover Funcionário

1. . O ator seleciona um funcionário para remover.
1. . O sistema solicita uma confirmação de remoção.
1. . O ator confirma a remoção.
1. . O sistema exclui o funcionário do banco de dados e exibe uma mensagem de sucesso.

## Fluxo Alternativo

- **2.1.4 / 2.2.4 Dados inválidos**:
   - Se algum dado fornecido for inválido, o sistema informa o erro ao ator e solicita a correção antes de permitir o cadastro ou a edição.

## Pré-condições

- O ator deve estar autenticado no sistema para acessar o módulo de Gerenciamento de Funcionários.

## Pós-condições

- As informações do funcionário, incluindo o status, são adicionadas, atualizadas ou removidas do banco de dados conforme a ação realizada.
