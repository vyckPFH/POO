# POO


# UML = linguagem de modelagem unificada / unified modeling linguage 

![image](https://upload.wikimedia.org/wikipedia/commons/f/f0/Diagrama_de_Classes_com_duas_classes.png)

_Artigo de diagrama de classes:_
[artigo](https://www.devmedia.com.br/orientacoes-basicas-na-elaboracao-de-um-diagrama-de-classes/37224)

Modificadores de acesso de membro
Todas as classes têm diferentes níveis de acesso, dependendo do modificador de acesso (visibilidade). Veja os níveis de acesso com seus símbolos correspondentes:

* Público (+)
* Privado (-)
* Protegido (#)
* Pacote (~)
* Derivado (/)
* Estático (sublinhado)

#### Componentes adicionais de diagramas de classes
Dependendo do contexto, as classes em um diagrama de classes podem representar os principais objetos, interações no aplicativo ou classes a serem programadas. Para responder à pergunta “o que é um diagrama de classes em UML?”, você deve primeiro entender sua composição básica.

**Classes:** um template para a criação de objetos e implementação de comportamento em um sistema. Em UML, uma classe representa um objeto ou um conjunto de objetos que compartilham uma estrutura e comportamento comum. São representadas por um retângulo que inclui linhas do nome da classe, seus atributos e suas operações. Ao desenhar uma classe em um diagrama de classes, somente a primeira linha deve ser preenchida — as outras são opcionais caso queira fornecer mais detalhes.

**Nome:** a primeira linha em uma forma de classe.

**Atributos:** a segunda linha em uma forma de classe. Cada atributo da classe é exibido em uma linha separada.

**Métodos:** a terceira linha em uma forma de classe. Também conhecidos como operações, métodos são exibidos em formato de lista, com cada operação representada em sua própria linha.

**Sinais:** símbolos que representam comunicações unidirecionais e assíncronas entre objetos ativos.

**Tipos de dados:**  classificadores que definem valores de dados. Os tipos de dados podem modelar tipos primitivos e também enumerações.

**Pacotes:** formas projetadas para organizar classificadores relacionados em um diagrama. São simbolizados por uma grande forma de retângulo com abas.

**Interfaces:** uma coleção de assinaturas de operações e/ou definições de atributos que definem um conjunto coeso de comportamentos. Interfaces são semelhantes às classes, exceto que uma classe pode ter uma instância de seu tipo, e uma interface deve ter pelo menos uma classe para implementá-la.

**Enumerações:** representações de tipos de dados definidos pelo usuário. Uma enumeração inclui grupos de identificadores que representam os valores da enumeração.

**Objetos:** instâncias de uma classe ou classes. Objetos podem ser adicionados a um diagrama de classes para representar instâncias concretas ou prototípicas.

**Artefatos:** elementos de modelo que representam as entidades concretas em um sistema de software, tais como documentos, bancos de dados, arquivos executáveis, componentes de software etc.


# O que define se uma linguagem é OO? (orientada a objetos)?

- Encapsulamento/Ocultamento da informação
- Herança
- Polimorfismo
- Todo os tipos pré-definidos são objetos
- Todas as operaçoes realizadas enviam mensagens a objetos
- todos os tipos definidos pelo usuario são objetos


+ __Linguagens que suportam OO__: ADA, Java, C#, C++, Object Pascal, PHP - orientada a classes, Python, Lua, Dart, Ruby,etc.

+ javaScript é especial/diferente.



# 4 pilars da orientação a objetos:

[Artigo de orientação a objetos](https://www.devmedia.com.br/abstracao-encapsulamento-e-heranca-pilares-da-poo-em-java/26366)

### ->  Encapsulamento: ###

Combina dados e os métodos que operam sobre esses dados dentro de uma única unidade (o objeto), protegendo-os de acesso externo direto e não autorizado. O objetivo é ocultar os detalhes internos de implementação e expor apenas a interface necessária para interagir com o objeto, usando principalmente atributos privados e métodos públicos (getters e setters) para controlar o acesso. Isso promove modularidade, segurança, flexibilidade e facilita a manutenção do código. 

proteção da bliblioteca, qualquer um pode ver e usar mas ninguem alem de quem fez pode editar

____________________________________________________________

### -> Herança: 

Em POO, a herança é um mecanismo que permite que uma classe (derivada ou filha) herde atributos e métodos de outra classe (base ou mãe), promovendo a reutilização de código e a organização em hierarquias. Essa relação possibilita criar classes mais específicas que se baseiam em modelos mais genéricos, como um Funcionário que herda características de Pessoa, facilitando a manutenção e tornando o código mais limpo. 

__ex🥖
aluno: | [cpf ; nomee ; email ; dataNasc] | = +Pessoa
Historico ; curso

professor: | [cpf ; nome ; email ; dataNasc] | = +Pessoa
titulação ; area 

tecnico: | [cpf ; nome ; email ; dataNasc] | = +Pessoa
setor


### -> Polimorfismo:
 é um conceito com significados distintos em várias áreas, referindo-se à capacidade de algo ter múltiplas formas. Significa a habilidade de objetos de diferentes classes responderem a uma mesma mensagem de maneiras distintas (metodos com mesmo nome mesma assinatura mas com) implementação diferente. 



### -> Abstração: 
 é o processo de identificar e modelar as características e comportamentos essenciais de um objeto ou sistema, ignorando os detalhes complexos e irrelevantes para o contexto em questão, criando assim uma representação simplificada do mundo real. Ao criar modelos simplificados (classes), a abstração foca nos aspectos importantes, tornando o código mais organizado, fácil de entender, e permitindo a criação de hierarquias de classes reutilizáveis. 

 pensar na coisa na vida real como uma classe ou objeto, no geral representar um elemento na aplicação

- processo de representar um grupo de entidades através de seus atributos comuns;
- Foco em aspectos ssenciais de uma aplicação enquanto ignora os detalhes;
- construção de um modelo para representação da realidade;

___________________________________________________________

# Objetos e classes
+ Um comportamento representa uma ação ou resposta de um objeto a uma ação do mundo real;
+ Atributos são as caracteristicas da coisa

# Questão de responsabilidade 

em OO: responsabilidade concentrada, polimorfismo.(pra validar um cpf, é uma classe só pra isso, separar as responsabilidades).

# Encapsulamento #

### -> Visibilidade ###



* public: todo mundo acessa
* Private: outras classes não acessam
* protected: apenas classes do pacote acessam
* se for declaração sem, é protected automaticamente

### -> Métodos de acesso ### 

_Ler/get atributo:_ 

```java
public String getCategoria(){
return this.categoria;
}
```
_Por/set atributo:_

```java 
public void setCategoria(){
    this.categoria = categoria;
}
```

# Abstação #

* Classe
* associação
* mensagem
* multiplicidade 0,1,0..1,*,0..*,1..*
  - *: muitos;
* Classes Conceituais
* $Sobrecarga:$ metodos com mesmo nome mas com assinatura diferente (é possivel)
onde assinatura do metodo é:
> public Diretor() {
}

**Exemplo:**

```java
public Diretor(int a, String paisOrigem){
    this.paisOrigem = paisOrigem;
}

public Diretor(String nome) {
    this.nome = nome;
}

public Diretor() {
}
```

