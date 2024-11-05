**Especificação do Projeto**

**Sistema de Gerenciamento de Congressos Empresariais**

**Introdução**

**Contextualização do Problema**

No contexto atual, empresas que organizam congressos, conferências e outros eventos corporativos enfrentam desafios complexos na gestão desses eventos. A coordenação de múltiplos aspectos como clientes, fornecedores, programação de atividades e equipes de apoio exige uma organização detalhada e eficiente. A falta de um sistema centralizado e integrado pode levar a erros na logística, perda de informações e insatisfação dos clientes, afetando a qualidade e a reputação das empresas de eventos. Esse projeto visa abordar esses desafios, oferecendo uma solução que facilite e otimize o processo de gestão de congressos empresariais.

**Objetivo do Projeto**

Desenvolver um sistema de gerenciamento de congressos empresariais para permitir que empresas organizadoras administrem de forma integrada e flexível as diversas etapas de planejamento e execução de eventos corporativos. O objetivo principal é criar uma plataforma completa que abranja o cadastro de clientes, fornecedores, programação de atividades, gestão de equipe e controle financeiro, com funcionalidades que permitam personalização e eficiência no gerenciamento dos congressos.

Com base nas discussões do grupo e na estrutura planejada para o sistema, aqui está uma análise do problema, as exigências do sistema e os requisitos funcionais e não funcionais:

### Descrição do Problema

Atualmente, a gestão de congressos empresariais enfrenta desafios na organização e integração de informações sobre clientes, eventos, atividades, equipe de coordenação, fornecedores e serviços contratados. Esses dados frequentemente são dispersos ou manipulados manualmente, dificultando o gerenciamento eficiente e aumentando o risco de inconsistências e perda de informações importantes. O objetivo do sistema é centralizar e automatizar o gerenciamento de congressos para melhorar a produtividade e o controle das operações.

### Análise do Problema

Os principais desafios do problema incluem:
- **Fragmentação de Informações**: Dados sobre clientes, atividades e fornecedores estão frequentemente distribuídos em sistemas distintos ou planilhas, dificultando a acessibilidade e integridade.
- **Dificuldade na Coordenação de Eventos**: Falta de uma estrutura unificada para associar atividades, participantes e profissionais responsáveis, o que pode gerar confusões e duplicidade de trabalho.
- **Inconsistências e Falta de Histórico**: Ausência de controle histórico detalhado sobre interações com clientes, atividades realizadas e desempenho de fornecedores, o que dificulta decisões estratégicas para eventos futuros.

Essas dificuldades resultam em menor eficiência organizacional, dificuldade de adaptação a mudanças nas atividades e complexidade na gestão de múltiplos eventos simultâneos.

### Exigências do Sistema

1. O sistema deve permitir o cadastro e a atualização de informações sobre congressos, clientes, atividades, fornecedores e pacotes de serviços.
2. O sistema deve gerenciar os dados de forma modular, permitindo a inclusão, edição e visualização de cada entidade (como `Cliente`, `Congresso`, `Atividade`, etc.).
3. Deve haver uma funcionalidade de associação entre congressos e seus participantes, atividades e fornecedores.
4. O sistema deve fornecer relatórios detalhados sobre o histórico de interações com clientes, desempenho de fornecedores e dados do evento para auxiliar na tomada de decisões.
5. A interface do sistema deve ser intuitiva para facilitar a navegação e a utilização por usuários com diferentes níveis de habilidade técnica.
6. A estrutura do sistema deve permitir expansões futuras, incluindo novos tipos de atividades ou entidades, sem necessidade de grandes modificações no código.

### Requisitos do Software

#### Requisitos Funcionais

1. **Cadastro da Empresa**
   - Permitir que a empresa de eventos registre informações corporativas essenciais, como nome, CNPJ e endereço.
   - Validação automática do CNPJ ao inserir os dados.

2. **Gerenciamento de Clientes**
   - Permitir o cadastro, edição e visualização de dados dos clientes empresariais.
   - Armazenar informações de contato, setor de atuação e histórico de interações.

3. **Cadastro e Gerenciamento de Congressos**
   - Criar, editar e gerenciar informações sobre os congressos empresariais, incluindo data, local e valor contratado.
   - Associar cada congresso a clientes e atividades específicas.

4. **Gerenciamento das Atividades do Congresso**
   - Adicionar, editar e remover atividades (palestras, workshops, etc.) dentro de um congresso.
   - Designar responsáveis por cada atividade e informar o número esperado de participantes.

5. **Gerenciamento da Equipe de Coordenação**
   - Cadastro e visualização de dados dos membros da equipe, como nome, função e remuneração.
   - Atribuir tarefas específicas aos profissionais da equipe de coordenação.

6. **Cadastro e Gerenciamento de Fornecedores**
   - Controlar informações de fornecedores de serviços, como catering e segurança, incluindo CNPJ e histórico de colaboração.
   - Avaliação de desempenho dos fornecedores com base em feedback e histórico.

7. **Gerenciamento de Pacotes de Serviços**
   - Criar pacotes de serviços personalizados, associando-os a congressos específicos e listando os itens inclusos em cada pacote.
   - Definir preços e personalizar pacotes conforme a necessidade dos clientes.

8. **Gerenciamento de Itens de Serviço**
   - Cadastro e gerenciamento de itens específicos que compõem os pacotes de serviços.
   - Associar itens a categorias específicas, como Alimentação ou Equipamento.

#### Requisitos Não Funcionais
1. **Escalabilidade**: Arquitetura modular para suportar a adição de novos tipos de eventos ou funcionalidades sem grandes mudanças na estrutura.
2. **Usabilidade**: Interface amigável e acessível, possibilitando que os usuários interajam com o sistema sem necessidade de treinamento técnico extenso.

Essa abordagem modular permitirá uma implementação mais eficiente e organizada do sistema, com flexibilidade para expansão e manutenção futuras. Os componentes principais foram desenhados para maximizar a reutilização de código e simplificar a adição de novas funcionalidades conforme necessário.

### Modelagem do Sistema: Gestão de Eventos Corporativos

#### Diagrama de Classes
![Diagrama de Classes](https://via.placeholder.com/800x600?text=Diagrama+de+Classes)  
*(Este é um espaço reservado. Você pode usar ferramentas como UMLet, Lucidchart ou Draw.io para criar o diagrama com as classes e suas interações.)*

---

### Descrição das Classes

#### **Classe 1: Empresa**
- **Atributos:**
  - `String nome`
  - `String cnpj`
  - `String endereco`
- **Métodos:**
  - `void cadastrarCliente(Cliente cliente)`
  - `void atualizarDados(String novoEndereco)`
  - `void listarClientes()`
- **Responsabilidades:** Gerencia os dados da empresa, incluindo o cadastro de clientes e a atualização de informações.

#### **Classe 2: Cliente**
- **Atributos:**
  - `String nome`
  - `String contato`
  - `String email`
- **Métodos:**
  - `void atualizarContato(String novoContato)`
  - `void visualizarEventos()`
- **Responsabilidades:** Representa um cliente que participa dos eventos, permitindo a atualização de suas informações e o acesso a eventos relacionados.

#### **Classe 3: ICongresso (Interface)**
- **Atributos:** Nenhum (interfaces não possuem atributos)
- **Métodos:**
  - `void cadastrarCongresso(Congresso congresso)`
  - `void atualizarCongresso(Congresso congresso)`
  - `void vincularAtividade(Atividade atividade)`
  - `void gerenciarParticipantes(Participante participante)`
- **Responsabilidades:** Define as operações essenciais para a gestão de congressos, permitindo que classes concretas como *Congresso* implementem funcionalidades específicas.

#### **Classe 4: Congresso**
- **Atributos:**
  - `String data`
  - `String local`
  - `Cliente clienteAssociado`
- **Métodos:**
  - `void adicionarAtividade(Atividade atividade)`
  - `void removerAtividade(Atividade atividade)`
  - `void listarAtividades()`
- **Responsabilidades:** Implementa a interface *ICongresso*, gerenciando informações sobre o congresso, atividades e participantes.

#### **Classe 5: IAtividade (Interface)**
- **Atributos:** Nenhum
- **Métodos:**
  - `void adicionarParticipante(Participante participante)`
  - `void removerParticipante(Participante participante)`
  - `void associarProfissional(Profissional profissional)`
- **Responsabilidades:** Define operações gerais para o gerenciamento de atividades, oferecendo flexibilidade para criar tipos variados de atividades (como palestra, workshop).

#### **Classe 6: Atividade (Classe Abstrata)**
- **Atributos:**
  - `String nome`
  - `String tipo  (ex: Palestra, Workshop)`
  - `String data`
  - `String duracao`
- **Métodos:**
  - `void executarAtividade()`
  - `void adicionarParticipante(Participante participante)`
  - `void removerParticipante(Participante participante)`
- **Responsabilidades:** Representa uma atividade dentro de um congresso, podendo ser uma palestra, workshop, entre outros, e gerencia os participantes.

#### **Classe 7: Profissional**
- **Atributos:**
  - `String nome`
  - `String especialidade`
  - `String contato`
- **Métodos:**
  - `void atualizarEspecialidade(String novaEspecialidade)`
  - `void associarAtividade(Atividade atividade)`
- **Responsabilidades:** Representa profissionais que atuam em atividades dentro dos congressos, como palestrantes ou facilitadores.

#### **Classe 8: Fornecedor**
- **Atributos:**
  - `String nome`
  - `String contato`
  - `String tipoServico`
- **Métodos:**
  - `void cadastrarServico(Servico servico)`
  - `void atualizarContato(String novoContato)`
- **Responsabilidades:** Representa fornecedores que oferecem serviços e produtos para os eventos, gerenciando suas informações e serviços associados.

#### **Classe 9: PacoteServico**
- **Atributos:**
  - `String descricao`
  - `double preco`
  - `List<ItemServico> itens`
- **Métodos:**
  - `void adicionarItem(ItemServico item)`
  - `void removerItem(ItemServico item)`
  - `double calcularPrecoTotal()`
- **Responsabilidades:** Agrupa itens de serviços em pacotes, permitindo a gestão de preços e serviços oferecidos de forma conjunta.

#### **Classe 10: ItemServico**
- **Atributos:**
  - `String nome`
  - `double custo`
  - `String descricao`
- **Métodos:**
  - `void atualizarCusto(double novoCusto)`
  - `String getDetalhes()`
- **Responsabilidades:** Representa itens individuais de serviços, podendo ser usados em pacotes de serviços e oferecendo detalhes sobre cada item.

#### **Classe 11: Servico**
- **Atributos:**
  - `String descricao`
  - `double custo`
- **Métodos:**
  - `double calcularCustoTotal(int quantidade)`
- **Responsabilidades:** Representa serviços gerais oferecidos em congressos, permitindo parametrização para diferentes tipos de serviços.

#### **Classe 12: Pessoa (Classe Abstrata)**
- **Atributos:**
  - `String nome`
  - `String contato`
- **Métodos:**
  - `void atualizarContato(String novoContato)`
- **Responsabilidades:** Fornece uma estrutura comum para diferentes tipos de participantes (Cliente, Profissional, Fornecedor), facilitando a reutilização de informações.

#### **Classe 13: Item (Classe Concreta)**
- **Atributos:**
  - `String descricao`
  - `double custo`
- **Métodos:**
  - `void associarPacote(PacoteServico pacote)`
- **Responsabilidades:** Define atributos e métodos específicos para itens de serviço individuais, que podem ser associados a pacotes de serviços personalizados.

## Modelagem do Sistema: Gestão de Eventos Corporativos

#### **Inter-relações entre Classes**
As classes do sistema interagem de maneira a formar um fluxo coerente de dados e operações:

1. **Empresa e Cliente:**
   - A classe **Empresa** gerencia uma lista de **Cliente**s. 
   - O método `cadastrarCliente(Cliente cliente)` é chamado para adicionar um novo cliente ao sistema. 
   - **Cliente** pode chamar `visualizarEventos()` para obter uma lista dos eventos disponíveis.

2. **ICongresso e Congresso:**
   - A interface **ICongresso** define métodos que a classe **Congresso** deve implementar.
   - Por exemplo, ao chamar `cadastrarCongresso(Congresso congresso)` na interface, a implementação em **Congresso** pode armazenar informações do congresso.

3. **Atividade e IAtividade:**
   - A classe **Atividade**, que é uma classe abstrata, implementa a interface **IAtividade**.
   - Isso permite que diferentes tipos de atividades (ex: palestra, workshop) compartilhem métodos comuns, como `adicionarParticipante(Participante participante)`.

4. **Participante e Profissional:**
   - A classe **Profissional** pode se associar a atividades específicas, chamando `associarAtividade(Atividade atividade)`.

5. **PacoteServico e ItemServico:**
   - **PacoteServico** agrega **ItemServico**s. 
   - O método `adicionarItem(ItemServico item)` permite compor um pacote, enquanto `calcularPrecoTotal()` calcula o custo total.


### Interfaces e Classes Abstratas

#### **Interfaces:**
- **ICongresso** e **IAtividade** são interfaces que definem métodos essenciais para a gestão de congressos e atividades, respectivamente. 
- Elas promovem a reutilização de código, pois qualquer classe que implemente essas interfaces deve fornecer implementações específicas, permitindo a troca e a expansão sem alterar o código que utiliza essas interfaces.

#### **Classes Abstratas:**
- **Atividade** e **Pessoa** são classes abstratas que estabelecem uma base comum para suas subclasses.
- **Atividade** pode ser estendida para criar classes concretas como **Palestra** ou **Workshop**, enquanto **Pessoa** pode ser estendida para **Cliente**, **Profissional**, e **Fornecedor**, garantindo que todos compartilhem métodos e atributos comuns.


### Metodologia de Desenvolvimento

#### **Abordagem de Programação**
- A metodologia de desenvolvimento adotada será **Agile**, com sprints curtos para entregas frequentes e feedback contínuo. Isso permitirá adaptações rápidas às necessidades do cliente e melhorias constantes no sistema.

#### **Ferramentas e Tecnologias**
- **VSCode**: Ambiente de desenvolvimento integrado (IDE) para o código.
- **GitHub**: Para controle de versão e colaboração no desenvolvimento do código.
- **Java**: Linguagem de programação principal para o desenvolvimento do sistema.
- **Maven**: Gerenciador de dependências e construção do projeto.
- **JFreeChart**: Biblioteca para geração de gráficos, útil para visualização de dados de eventos.
- **JUnit**: Para testes automatizados, assegurando a qualidade do código.

#### 6. Casos de Uso

**Caso de Uso 1: Cadastrar um novo congresso**
- **Ator:** Gerente de Eventos
- **Descrição:** O gerente insere informações do congresso e associa ao cliente.

**Caso de Uso 2: Adicionar uma nova atividade a um congresso**
- **Ator:** Gerente de Eventos
- **Descrição:** O gerente seleciona um congresso e adiciona uma atividade.

**Caso de Uso 3: Designar um membro da equipe para uma atividade específica**
- **Ator:** Gerente de Eventos
- **Descrição:** O gerente designa um profissional para uma tarefa específica.

**Caso de Uso 4: Criar um novo pacote de serviços a partir de itens disponíveis**
- **Ator:** Gerente de Fornecedores
- **Descrição:** O gerente cria um pacote combinando itens de serviço.

#### 7. Métricas de Avaliação
- **Precisão:** Medir a taxa de erros em cadastros e relatórios.
- **Desempenho:** Avaliar a eficiência no processamento de dados de congressos grandes.

### 8. Estrutura de Classes e Interfaces

- **ICongresso (Interface):** Define as operações essenciais para a gestão de congressos. Classes como `Congresso`, que implementam essa interface, devem fornecer implementações para os métodos definidos.
  
- **Congresso (Classe Concreta):** Implementa a interface `ICongresso` e possui atributos específicos do congresso, além de métodos para gerenciar congressos e suas atividades.

- **IAtividade (Interface):** Define operações gerais para gerenciar participantes em atividades, a serem implementadas por classes que representam diferentes tipos de atividades.

- **Atividade (Classe Abstrata):** Extende a interface `IAtividade` e pode ser subclassificada em atividades específicas, como `Palestra` e `Workshop`.

- **Pessoa (Classe Abstrata):** Serve como base para as classes `Cliente`, `Profissional` e `Fornecedor`, promovendo a reutilização de atributos comuns, como nome e contato.

- **Servico (Classe Genérica):** Representa serviços com métodos que permitem calcular custos, sendo aplicável a diversos contextos no sistema.

- **Item (Classe Concreta):** Define itens de serviço individuais que podem ser associados a pacotes de serviços, cada um com seus próprios atributos como descrição e custo.
