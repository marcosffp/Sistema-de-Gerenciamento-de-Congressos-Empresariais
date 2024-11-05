### Especificação do Projeto: Sistema de Gerenciamento de Congressos Empresariais

#### 1. **Objetivo do Sistema**
Sistema voltado para o gerenciamento de congressos empresariais, que visa facilitar a organização, o planejamento e a execução do evento corporativo. A proposta é oferecer uma plataforma, onde a equipe responsável por eventos consiga, entre outras coisa, cadastrar clientes e fornecedores, organizar a programação das atividades e manter o controle financeiro dos congressos.

#### 2. **Requisitos Funcionais**

##### 2.1. **Cadastro da Empresa**
- **Descrição**: Permitir que a empresa registre suas informações básicas.
- **Atributos**:
  - `nome`: Nome da empresa.
  - `CNPJ`: Cadastro Nacional da Pessoa Jurídica.
  - `endereço`: Localização da empresa.
- **Funcionalidades**:
  - Criar, editar e visualizar informações da empresa.
  - Validar o CNPJ durante o cadastro.

##### 2.2. **Gerenciamento de Clientes**
- **Descrição**: Gerenciar informações dos clientes que contratam os serviços de congresso.
- **Atributos**:
  - `nome`: Nome da organização cliente.
  - `setor`: Área de atuação da organização.
  - `contato`: Nome e informações de contato do responsável.
  - `especificações de pagamento`: Detalhes sobre o contrato e pagamentos.
- **Funcionalidades**:
  - Cadastrar, editar e visualizar informações dos clientes.
  - Gerar relatórios de clientes e suas interações.

##### 2.3. **Cadastro de Congressos**
- **Descrição**: Permitir o registro e gerenciamento de congressos.
- **Atributos**:
  - `cliente`: Referência ao cliente associado.
  - `data`: Data do evento.
  - `local`: Local onde o congresso será realizado.
  - `lista de atividades`: Atividades programadas para o congresso.
  - `informações de pagamento`: Detalhes financeiros do congresso.
- **Funcionalidades**:
  - Criar, editar e visualizar congressos.
  - Associar congressos a clientes e atividades.

##### 2.4. **Atividades do Congresso**
- **Descrição**: Gerenciar as atividades que ocorrerão durante o congresso.
- **Atributos**:
  - `data`: Data da atividade.
  - `descrição`: Descrição da atividade.
  - `local`: Local da atividade.
  - `número esperado de participantes`: Estimativa de público.
  - `duração prevista`: Tempo estimado para a atividade.
- **Funcionalidades**:
  - Adicionar, editar e remover atividades de um congresso.
  - Associar atividades a membros da equipe responsáveis.

##### 2.5. **Gerenciamento da Equipe**
- **Descrição**: Controlar as informações dos membros da equipe que organizam o congresso.
- **Atributos**:
  - `nome`: Nome do membro da equipe.
  - `contato`: Informações de contato.
  - `função`: Cargo ou função desempenhada.
  - `remuneração`: Salário ou pagamento acordado.
- **Funcionalidades**:
  - Cadastrar, editar e visualizar membros da equipe.
  - Designar tarefas e registrar horas trabalhadas.

##### 2.6. **Cadastro de Fornecedores**
- **Descrição**: Gerenciar informações sobre fornecedores que prestam serviços para os congressos.
- **Atributos**:
  - `nome`: Nome do fornecedor.
  - `CNPJ`: Cadastro do fornecedor.
  - `endereço`: Localização do fornecedor.
  - `histórico de colaboração`: Registro de interações anteriores.
- **Funcionalidades**:
  - Cadastrar, editar e visualizar fornecedores.
  - Avaliar o desempenho dos fornecedores com base em feedbacks.

##### 2.7. **Pacotes de Serviços**
- **Descrição**: Criar pacotes de serviços que podem ser oferecidos aos clientes.
- **Atributos**:
  - `nome do pacote`: Nome do pacote de serviços.
  - `descrição`: Detalhes sobre o que está incluído no pacote.
  - `lista de itens`: Serviços que compõem o pacote.
  - `custo por pessoa/unidade`: Preço do pacote.
- **Funcionalidades**:
  - Criar, editar e visualizar pacotes de serviços.
  - Associar pacotes a congressos e clientes.

##### 2.8. **Itens de Serviço**
- **Descrição**: Gerenciar os itens individuais que compõem os pacotes de serviços.
- **Atributos**:
  - `descrição`: Descrição do item de serviço.
  - `categoria`: Tipo de serviço (Alimentação, Equipamento, Material Promocional).
  - `custo`: Preço do item.
- **Funcionalidades**:
  - Cadastrar, editar e visualizar itens de serviço.
  - Associar itens a pacotes de serviços.

#### 3. **Requisitos Não Funcionais**
- **Escalabilidade**: o sistema deve ser projetado para permitir a adição de novas funcionalidades e módulos no futuro.

#### 4. **Modelo de Dados**
- **Classes Principais**:
  - `Empresa`
  - `Cliente`
  - `Congresso`
  - `Atividade`
  - `MembroEquipe`
  - `Fornecedor`
  - `PacoteServico`
  - `ItemServico`

#### 5. **Interações entre Classes**
- Um `Cliente` pode estar associado a múltiplos `Congressos`.
- Um `Congresso` pode incluir várias `Atividades`.
- Um `MembroEquipe` pode ser designado para várias `Atividades` em diferentes `Congressos`.
- Um `Fornecedor` pode oferecer múltiplos `PacotesServico`, que por sua vez podem conter vários `ItemServico`.

#### 6. **Casos de Uso**
- **Caso de Uso 1**: Cadastrar um novo congresso.
  - **Ator**: Gerente de Eventos.
  - **Descrição**: O gerente insere as informações do congresso e associa ao cliente.
  
- **Caso de Uso 2**: Adicionar uma nova atividade a um congresso existente.
  - **Ator**: Gerente de Eventos.
  - **Descrição**: O gerente seleciona um congresso e adiciona uma nova atividade.

- **Caso de Uso 3**: Designar um membro da equipe para uma atividade específica.
  - **Ator**: Gerente de Eventos.
  - **Descrição**: O gerente atribui um membro da equipe a uma atividade.

- **Caso de Uso 4**: Criar um novo pacote de serviços a partir de itens de serviço disponíveis.
  - **Ator**: Gerente de Fornecedores.
  - **Descrição**: O gerente cria um pacote combinando diferentes itens de serviço.

#### 7. **Métricas de Avaliação**
- O sistema deve ser avaliado com base em:
  - **Precisão**: Taxa de erros em cadastros e relatórios gerados.
