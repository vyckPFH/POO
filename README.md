# POO


# UML = linguagem de modelagem unificada / unified modeling linguage

# O que define se uma linguagem é OO? (orientada a objetos)?

- Encapsulamento/Ocultamento da informação
- Herança
- Polimorfismo
- Todo os tipos pré-definidos são objetos
- Todas as operaçoes realizadas enviam mensagens a objetos
- todos os tipos definidos pelo usuario são objetos

____________________________________________________________

+ Linguagens que suportam OO: ADA, Java, C#, C++, Object Pascal, PHP - orientada a classes, Python, Lua, Dart, Ruby,etc.

+ javaScript é especial/diferente.

____________________________________________________________

# 4 pilars da orientação a objetos:
# (https://www.devmedia.com.br/abstracao-encapsulamento-e-heranca-pilares-da-poo-em-java/26366)

+ Encapsulamento:

Combina dados e os métodos que operam sobre esses dados dentro de uma única unidade (o objeto), protegendo-os de acesso externo direto e não autorizado. O objetivo é ocultar os detalhes internos de implementação e expor apenas a interface necessária para interagir com o objeto, usando principalmente atributos privados e métodos públicos (getters e setters) para controlar o acesso. Isso promove modularidade, segurança, flexibilidade e facilita a manutenção do código. 

proteção da bliblioteca, qualquer um pode ver e usar mas ninguem alem de quem fez pode editar

____________________________________________________________

+ Herança: 

Em POO, a herança é um mecanismo que permite que uma classe (derivada ou filha) herde atributos e métodos de outra classe (base ou mãe), promovendo a reutilização de código e a organização em hierarquias. Essa relação possibilita criar classes mais específicas que se baseiam em modelos mais genéricos, como um Funcionário que herda características de Pessoa, facilitando a manutenção e tornando o código mais limpo. 

ex:
aluno: | [cpf ; nomee ; email ; dataNasc] | = +Pessoa
Historico ; curso

professor: | [cpf ; nome ; email ; dataNasc] | = +Pessoa
titulação ; area 

tecnico: | [cpf ; nome ; email ; dataNasc] | = +Pessoa
setor

____________________________________________________________

+ Polimorfismo:
 é um conceito com significados distintos em várias áreas, referindo-se à capacidade de algo ter múltiplas formas. Significa a habilidade de objetos de diferentes classes responderem a uma mesma mensagem de maneiras distintas (metodos com mesmo nome mesma assinatura mas com) implementação diferente. 

____________________________________________________________

+ Abstração: 
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


# Visibilidade

+ public: todo mundo acessa
- Private: outras classes não acessam
- ' ': apenas classes do pacote acessam
