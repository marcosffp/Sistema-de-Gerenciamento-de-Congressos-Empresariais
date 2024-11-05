
# Especificação do Projeto: Sistema de Gerenciamento de Congressos Empresariais

## 1. Objetivo do Sistema
O sistema de gerenciamento de congressos empresariais destina-se a facilitar a organização e a execução de eventos corporativos, como conferências, convenções e workshops. Ele oferece suporte para personalizar cada congresso de acordo com as necessidades dos clientes, permitindo um controle abrangente das atividades, da equipe e dos fornecedores. A proposta é oferecer uma plataforma onde a equipe de coordenação possa gerenciar clientes, fornecedores, programação de atividades e controle financeiro de maneira integrada e flexível.

## 2. Requisitos Funcionais

### 2.1. Cadastro da Empresa
**Descrição**: Permitir que a empresa de eventos registre suas informações corporativas essenciais.
- **Atributos**:
  - `nome`: Nome da empresa.
  - `CNPJ`: Cadastro Nacional da Pessoa Jurídica.
  - `endereço`: Localização da empresa.
- **Funcionalidades**:
  - Criar, editar e visualizar informações da empresa.
  - Validar o CNPJ durante o cadastro.

### 2.2. Gerenciamento de Clientes
**Descrição**: Gerenciar dados e preferências dos clientes empresariais, bem como histórico de interações.
- **Atributos**:
  - `nome`: Nome da organização cliente.
  - `setor`: Setor de atuação.
  - `contato`: Nome e informações de contato do responsável.
  - `valorContratado`: Valor acordado para o congresso.
- **Funcionalidades**:
  - Cadastrar, editar e visualizar informações dos clientes.
  - Gerar relatórios com histórico e perfil dos clientes.

### 2.3. Cadastro e Gerenciamento de Congressos
**Descrição**: Registrar e gerenciar informações dos congressos empresariais.
- **Atributos**:
  - `cliente`: Referência ao cliente associado.
  - `data`: Data do evento.
  - `local`: Local onde o congresso será realizado.
  - `atividades`: Lista de atividades programadas para o congresso.
  - `valorContratado`: Valor acordado para o evento.
- **Funcionalidades**:
  - Criar, editar e visualizar congressos.
  - Associar congressos a clientes e atividades.

### 2.4. Gerenciamento das Atividades do Congresso
**Descrição**: Gerenciar atividades como palestras, painéis, sessões de networking e workshops.
- **Atributos**:
  - `data`: Data da atividade.
  - `descricao`: Descrição da atividade.
  - `local`: Local da atividade.
  - `numParticipantes`: Número esperado de participantes.
  - `duracao`: Duração estimada.
- **Funcionalidades**:
  - Adicionar, editar e remover atividades.
  - Associar atividades a profissionais da equipe responsáveis.

### 2.5. Gerenciamento da Equipe de Coordenação
**Descrição**: Gerenciar dados dos profissionais responsáveis pela execução das atividades.
- **Atributos**:
  - `nome`: Nome do profissional.
  - `contato`: Informações de contato.
  - `funcao`: Cargo ou função desempenhada (e.g., Produtor, Coordenador Técnico).
  - `remuneracao`: Valor de remuneração.
- **Funcionalidades**:
  - Cadastrar, editar e visualizar dados dos membros da equipe.
  - Designar tarefas e registrar horas trabalhadas.

### 2.6. Cadastro e Gerenciamento de Fornecedores
**Descrição**: Controlar dados dos fornecedores de serviços como catering, audiovisual e segurança.
- **Atributos**:
  - `nome`: Nome do fornecedor.
  - `CNPJ`: Cadastro do fornecedor.
  - `endereco`: Localização do fornecedor.
  - `historicoColaboracao`: Histórico de interações e avaliações.
- **Funcionalidades**:
  - Cadastrar, editar e visualizar fornecedores.
  - Avaliar desempenho dos fornecedores com base em feedbacks e histórico.

### 2.7. Gerenciamento de Pacotes de Serviços
**Descrição**: Criar pacotes de serviços personalizados para cada congresso.
- **Atributos**:
  - `nomePacote`: Nome do pacote de serviços.
  - `descricao`: Descrição detalhada do pacote.
  - `itensServico`: Lista de itens inclusos.
  - `custoPorUnidade`: Preço do pacote por pessoa ou unidade.
- **Funcionalidades**:
  - Criar, editar e visualizar pacotes de serviços.
  - Associar pacotes de serviços a clientes e congressos.

### 2.8. Gerenciamento de Itens de Serviço
**Descrição**: Controlar itens específicos que compõem pacotes de serviços.
- **Atributos**:
  - `descricao`: Descrição do item.
  - `categoria`: Tipo (e.g., Alimentação, Equipamento).
  - `custo`: Valor do item.
- **Funcionalidades**:
  - Cadastrar, editar e visualizar itens de serviço.
  - Associar itens a pacotes.

## 3. Requisitos Não Funcionais
- **Escalabilidade**: Permitir adição de novos módulos e funcionalidades.
- **Segurança**: Implementar autenticação e controle de acessos.

## 4. Modelo de Dados
### Classes Principais
- **Empresa**
- **Cliente**
- **Congresso**
- **Atividade**
- **Profissional**
- **Fornecedor**
- **PacoteServico**
- **ItemServico**

## 5. Interações entre Classes
- Um **Cliente** pode contratar vários **Congressos**.
- Um **Congresso** inclui várias **Atividades**.
- Um **Profissional** pode ser designado para múltiplas **Atividades**.
- Um **Fornecedor** pode fornecer vários **PacotesServico**, que incluem vários **ItensServico**.

## 6. Casos de Uso

### Caso de Uso 1: Cadastrar um novo congresso
**Ator**: Gerente de Eventos  
**Descrição**: O gerente insere informações do congresso e associa ao cliente.

### Caso de Uso 2: Adicionar uma nova atividade a um congresso
**Ator**: Gerente de Eventos  
**Descrição**: O gerente seleciona um congresso e adiciona uma atividade.

### Caso de Uso 3: Designar um membro da equipe para uma atividade específica
**Ator**: Gerente de Eventos  
**Descrição**: O gerente designa um profissional para uma tarefa específica.

### Caso de Uso 4: Criar um novo pacote de serviços a partir de itens disponíveis
**Ator**: Gerente de Fornecedores  
**Descrição**: O gerente cria um pacote combinando itens de serviço.

## 7. Métricas de Avaliação
- **Precisão**: Medir a taxa de erros em cadastros e relatórios.
- **Desempenho**: Avaliar a eficiência no processamento de dados de congressos grandes.
