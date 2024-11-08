## Especificação do Projeto

### Sistema de Gerenciamento de Congressos Empresariais

#### Introdução

##### Contextualização do Problema

Empresas que organizam congressos, conferências e outros eventos corporativos enfrentam desafios complexos na gestão desses eventos. A coordenação de múltiplos aspectos, como clientes, fornecedores, programação de atividades e equipes de apoio, exige uma organização detalhada e eficiente. A falta de um sistema centralizado e integrado pode resultar em erros logísticos, perda de informações e insatisfação dos clientes, afetando a qualidade e a reputação das empresas de eventos. Este projeto visa abordar esses desafios, oferecendo uma solução que facilite e otimize o processo de gestão de congressos empresariais.

#### Objetivo do Projeto

Desenvolver um sistema de gerenciamento de congressos empresariais que permita que empresas organizadoras administrem, de forma integrada e flexível, as diversas etapas de planejamento e execução de eventos corporativos. O objetivo principal é criar uma plataforma completa que abranja o cadastro de clientes, fornecedores, programação de atividades, gestão de equipe e controle financeiro, com funcionalidades que possibilitem personalização e eficiência no gerenciamento dos congressos.

### Análise do Problema

Atualmente, a gestão de congressos empresariais enfrenta desafios na organização e integração de informações sobre clientes, eventos, atividades, equipe de coordenação, fornecedores e serviços contratados. Esses dados são frequentemente dispersos ou manipulados manualmente, dificultando o gerenciamento eficiente e aumentando o risco de inconsistências e perda de informações importantes. O objetivo do sistema é centralizar e automatizar o gerenciamento de congressos para melhorar a produtividade e o controle das operações.

### Requisitos do Sistema

1. O sistema deve permitir o registro e a atualização de dados referentes a congressos, clientes, atividades, fornecedores e pacotes de serviços.
2. Deve gerenciar informações de forma modular, possibilitando a inclusão, edição e visualização de cada entidade, como `Congresso` e `Atividade`.
3. O sistema precisa incluir uma funcionalidade para associar congressos a seus participantes, atividades e fornecedores.
4. A interface do sistema deve ser amigável e intuitiva, facilitando a navegação para usuários com diferentes níveis de conhecimento técnico.
5. A arquitetura do sistema deve ser flexível, permitindo futuras expansões, como a adição de novos tipos de atividades ou entidades, sem necessitar de grandes alterações no código.

### Requisitos do Software

#### Requisitos Funcionais

1. **Cadastro de Congresso**
   - O sistema deve permitir o cadastro de informações sobre o congresso, incluindo setor, valor contratado e especificações.

2. **Gerenciamento de Atividades**
   - O sistema deve permitir filtrar e ordenar atividades relacionadas ao congresso.

3. **Cadastro de Atividades**
   - O sistema deve permitir o cadastro de atividades, incluindo tipo, data, local e quantidade de participantes.

4. **Gerenciamento de Atribuições**
   - O sistema deve gerenciar atribuições para profissionais, incluindo data da atribuição e carga horária.

5. **Cadastro de Profissionais**
   - O sistema deve permitir o cadastro de profissionais, incluindo nome, papel e alocação de tempo.

6. **Cadastro de Fornecedores**
   - O sistema deve permitir o cadastro de fornecedores, incluindo nome e tipo de serviço.

7. **Cadastro de Pacotes de Serviço**
   - O sistema deve permitir o cadastro de pacotes de serviços, incluindo nome e descrição, e gerenciar itens de serviço associados.

8. **Cálculo de Custo**
   - O sistema deve permitir o cálculo do custo total dos pacotes de serviço.

#### Requisitos Não Funcionais

1. **Escalabilidade**
   - O sistema deve ter uma arquitetura modular que permita a adição de novas funcionalidades.

2. **Manutenibilidade**
   - O sistema deve ser estruturado para facilitar a manutenção e evolução ao longo do tempo.

### Modelagem do Sistema: Gestão de Eventos Corporativos

#### Diagrama de Classes

![Diagram 2024-11-05 20-04-22](https://github.com/user-attachments/assets/f491b427-0e5c-4ed8-8d5b-4ee9e012f1a2)

---

### Descrição das Classes

### Descrição das Classes

#### Classe Congresso
- **Atributos:**
  - `setor: String`: Representa o setor ao qual o congresso pertence.
  - `valorContratado: float`: Valor total contratado para a realização do congresso.
  - `especificacoes: String`: Especificações adicionais sobre o congresso.

- **Métodos:**
  - `filtrarAtividadesPorData(data: String): List<Atividade>`: Filtra as atividades do congresso por data.
  - `ordenarProfissionaisPorPapel(): List<Profissional>`: Ordena os profissionais associados ao congresso por papel.

#### Classe Atividade
- **Atributos:**
  - `tipo: String`: Tipo da atividade (palestra, workshop, etc.).
  - `data: String`: Data em que a atividade será realizada.
  - `local: String`: Local onde a atividade ocorrerá.
  - `qtdParticipantes: int`: Número esperado de participantes na atividade.

- **Métodos:**
  - `filtrarProfissionaisPorPapel(papel: String): List<Profissional>`: Filtra profissionais por seu papel específico.
  - `ordenarProfissionaisPorAlocacaoTempo(): List<Profissional>`: Ordena os profissionais com base em sua alocação de tempo.

#### Classe Atribuicao
- **Atributos:**
  - `dataAtribuicao: LocalDate`: Data em que a atribuição foi feita.
  - `cargaHoraria: int`: Carga horária da atribuição.

#### Classe Profissional
- **Atributos:**
  - `nome: String`: Nome do profissional.
  - `papel: String`: Papel do profissional (ex: palestrante, coordenador).
  - `alocacaoTempo: String`: Tempo alocado para o profissional.

#### Classe Pessoa (abstrata)
- **Atributos:**
  - `nome: String`: Nome da pessoa.

#### Classe Fornecedor
- **Atributos:**
  - `nome: String`: Nome do fornecedor.
  - `tipoServico: String`: Tipo de serviço fornecido (ex: catering, segurança).

#### Classe PacoteServico (abstrata)
- **Atributos:**
  - `nome: String`: Nome do pacote de serviços.
  - `descricao: String`: Descrição do pacote de serviços.

- **Métodos:**
  - `calcularCustoTotal(): float`: Calcula o custo total do pacote de serviços.
  - `ordenarItensPorCusto(): List<ItemServico>`: Ordena os itens do pacote com base no custo.
  - `filtrarItensPorTipo(tipo: String): List<ItemServico>`: Filtra itens do pacote por tipo.

#### Classe ItemAudiovisual
- **Atributos:**
  - `equipamento: String`: Tipo de equipamento audiovisual.
  - `precoUnitario: float`: Preço por unidade do equipamento.

- **Métodos:**
  - `calcularCustoTotal(): float`: Calcula o custo total do item audiovisual.

#### Classe ItemCatering
- **Atributos:**
  - `tipoAlimento: String`: Tipo de alimento fornecido.
  - `precoPorPessoa: float`: Preço por pessoa para o serviço de catering.

- **Métodos:**
  - `calcularCustoTotal(): float`: Calcula o custo total do item de catering.

#### Classe ItemServico
- **Atributos:**
  - `tipo: String`: Tipo de serviço.
  - `custo: float`: Custo do serviço.
  - `quantidade: int`: Quantidade do serviço.
  - `descricao: String`: Descrição do serviço.

- **Métodos:**
  - `calcularCustoTotal(): float`: Calcula o custo total do item de serviço.

#### Interface CalculadoraDeCusto
- **Métodos:**
  - `calcularCusto(pacotesServico: List<PacoteServico>): float`: Método que recebe uma lista de pacotes de serviço e retorna o custo total.

#### Classe ImplCalculadoraDeCusto
- **Métodos:**
  - `calcularCusto(pacotesServico: List<PacoteServico>): float`: Implementa o método da interface para calcular o custo total dos pacotes de serviço. 


## Modelagem do Sistema: Gestão de Eventos Corporativos

#### **Inter-relações entre Classes**
As classes do sistema interagem de maneira a formar um fluxo coerente de dados e operações:
### Inter-relações entre Classes

#### Congresso
- **Atividades**: Um `Congresso` possui uma lista de `Atividade`. Cada `Atividade` está associada a um ou mais `Profissionais` e pode ter múltiplas `Atribuicao`.
- **Profissionais**: Um `Congresso` pode associar vários `Profissionais` a diferentes `Atividades`.

#### Atividade
- **Atribuição**: Cada `Atividade` pode ter uma ou mais instâncias de `Atribuicao`, que registram a alocação de tempo dos `Profissionais` para essa atividade.
- **Profissionais**: As atividades filtram e organizam os `Profissionais` envolvidos, podendo ser consultadas por seus papéis e alocações de tempo.

#### Atribuicao
- **Profissional**: Cada `Atribuicao` está ligada a um `Profissional`, que executa atividades específicas em determinadas datas e com carga horária definida.

#### Profissional
- **Pessoa**: A classe `Profissional` herda de `Pessoa`, representando um tipo específico de pessoa que tem um papel e alocação de tempo definidos.
- **Fornecedor**: A relação entre `Fornecedor` e `Profissional` é que ambos podem ser tipos de `Pessoa`, mas com diferentes especializações e funções dentro do contexto do congresso.

#### Pessoa
- **Profissional e Fornecedor**: A classe `Pessoa` serve como uma classe base abstrata, a partir da qual são derivadas as classes `Profissional` e `Fornecedor`, permitindo uma hierarquia que compartilha atributos comuns, como `nome`.

#### PacoteServico
- **ItemServico**: Cada `PacoteServico` contém uma lista de `ItemServico`, que pode incluir subclasses como `ItemAudiovisual` e `ItemCatering`. 
- **CalculadoraDeCusto**: A interface `CalculadoraDeCusto` é utilizada para calcular o custo total dos `PacoteServico`, permitindo que as classes implementadoras utilizem diferentes métodos de cálculo.

#### ItemServico
- **PacoteServico**: `ItemServico` é uma classe base para diferentes tipos de serviços que podem ser agrupados em um `PacoteServico`, contribuindo para o cálculo do custo total do pacote.

#### CalculadoraDeCusto
- **PacoteServico**: A interface `CalculadoraDeCusto` é implementada pela classe `ImplCalculadoraDeCusto`, que realiza operações sobre uma lista de `PacoteServico` para calcular o custo total.



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

### Casos de Uso

#### 1. Cadastro de Congresso
**Ator**: Administrador  
**Descrição**: O administrador cadastra um novo congresso, incluindo setor, valor contratado e especificações.  
**Pré-condições**: O administrador deve estar autenticado no sistema.  
**Pós-condições**: O novo congresso é adicionado ao sistema.  

#### 2. Cadastro de Atividade
**Ator**: Administrador  
**Descrição**: O administrador cadastra uma nova atividade para um congresso, definindo tipo, data, local e quantidade de participantes.  
**Pré-condições**: O congresso deve existir.  
**Pós-condições**: A nova atividade é vinculada ao congresso.  

#### 3. Atribuição de Profissionais
**Ator**: Administrador  
**Descrição**: O administrador atribui profissionais a uma atividade específica, definindo a data de atribuição e carga horária.  
**Pré-condições**: A atividade e os profissionais devem estar cadastrados.  
**Pós-condições**: As atribuições são registradas, vinculando profissionais a atividades.  

#### 4. Filtrar Atividades por Data
**Ator**: Administrador  
**Descrição**: O administrador filtra atividades de um congresso com base em uma data específica.  
**Pré-condições**: O congresso e suas atividades devem existir.  
**Pós-condições**: Uma lista de atividades que ocorrem na data informada é exibida.  

#### 5. Ordenar Profissionais por Papel
**Ator**: Administrador  
**Descrição**: O administrador solicita a lista de profissionais organizados por seu papel.  
**Pré-condições**: Os profissionais devem estar cadastrados.  
**Pós-condições**: A lista de profissionais é exibida, organizada por papel.  

#### 6. Cadastro de Profissional
**Ator**: Administrador  
**Descrição**: O administrador cadastra um novo profissional, informando nome, papel e alocação de tempo.  
**Pré-condições**: O administrador deve estar autenticado no sistema.  
**Pós-condições**: O novo profissional é adicionado ao sistema.  

#### 7. Cadastro de Fornecedor
**Ator**: Administrador  
**Descrição**: O administrador cadastra um novo fornecedor, informando nome e tipo de serviço.  
**Pré-condições**: O administrador deve estar autenticado no sistema.  
**Pós-condições**: O novo fornecedor é adicionado ao sistema.  

#### 8. Cadastro de Pacote de Serviço
**Ator**: Administrador  
**Descrição**: O administrador cadastra um novo pacote de serviço, incluindo nome e descrição, e pode associar itens de serviço.  
**Pré-condições**: O administrador deve estar autenticado no sistema.  
**Pós-condições**: O novo pacote de serviço é adicionado ao sistema.  

#### 9. Calcular Custo Total do Pacote de Serviço
**Ator**: Administrador  
**Descrição**: O administrador solicita o cálculo do custo total de um pacote de serviço.  
**Pré-condições**: O pacote de serviço e seus itens devem estar cadastrados.  
**Pós-condições**: O custo total do pacote é exibido.  

#### 10. Ordenar Itens de Serviço por Custo
**Ator**: Administrador  
**Descrição**: O administrador solicita a lista de itens de serviço de um pacote ordenados por custo.  
**Pré-condições**: O pacote de serviço e seus itens devem estar cadastrados.  
**Pós-condições**: A lista de itens de serviço é exibida, organizada por custo.  

#### 11. Filtrar Itens de Serviço por Tipo
**Ator**: Administrador  
**Descrição**: O administrador filtra os itens de serviço de um pacote com base em um tipo específico.  
**Pré-condições**: O pacote de serviço e seus itens devem estar cadastrados.  
**Pós-condições**: A lista de itens de serviço filtrados é exibida.  



#### 7. Geração de Código com LLMs
   - **Escolha do LLM**: Justificar a escolha do LLM que será utilizado para a geração de código, considerando fatores como tamanho do modelo e capacidade de geração de código.
   - **Engenharia de Prompts**: Elaborar prompts detalhados que guiarão o LLM na geração do código. Os prompts devem incluir:
     - Descrição clara do problema
     - Especificação das classes e seus atributos
     - Relações entre as classes
     - Métodos e funcionalidades de cada classe
   - **Iteração e Refinamento**: Descrever o processo de iteração e refinamento dos prompts, incluindo exemplos de feedback fornecido ao LLM.

#### 8. Avaliação do Código Gerado
   - **Adesão aos Princípios da POO**: Avaliar o código gerado em relação aos princípios da POO, como encapsulamento, herança, polimorfismo, coesão e acoplamento.
   - **Qualidade do Código**: Avaliar a legibilidade, eficiência e manutenibilidade do código gerado.
   - **Comparação com Código Humano**: Propor alterações no código gerado para que se adequem aos princípios da POO, utilizando as diretrizes SOLID e padrões de design.

#### 9. Análise dos Resultados
   - **Identificação de Limitações**: Discutir as limitações observadas na geração de código OOP pelos LLMs, como dificuldades em lidar com complexidade e ambiguidades.
   - **Propostas de Melhoria**: Sugerir melhorias para aumentar a capacidade dos LLMs em gerar código OOP de alta qualidade, como:
     - Uso de técnicas de aprendizado de máquina mais avançadas
     - Criação de bases de dados de código mais específicas
     - Desenvolvimento de ferramentas para auxiliar na avaliação e refinamento do código gerado

#### 10. Conclusão
   - **Resumo dos Resultados**: Resumir os principais resultados obtidos com o projeto e a geração de código.
   - **Considerações Finais**: Refletir sobre a importância do projeto e as contribuições para a área de POO e geração de código.

#### 11. Referências
   - Listar todas as referências utilizadas, incluindo o artigo científico e outras fontes relevantes.

