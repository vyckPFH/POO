# Associações em POO - Guia Rápido com UML e Java

##  O que são Associações?

Relacionamentos entre classes em Programação Orientada a Objetos.

### 1. Associação Simples

Principal característica: Relacionamento básico onde as classes existem independentemente.

```mermaid
classDiagram
    Curso "1" --> "1" Professor : ministrado por
    Curso "1" --> "0..*" Aluno : matriculados em
    
    class Professor {
        -String nome
        +ensinar()
    }
    
    class Aluno {
        -String nome
        -int matricula
        +estudar()
    }
    
    class Curso {
        -String nome
        +adicionarAluno()
    }
```
