# Exceções

#### É uma condição anormaç q altera ou interrompe o fluxo de execução ####

### Podem ser causadas por diversas condiçoes:
    + erros sérios de hardware
    + error simples de progamação
    + error de divisão por zero
    + valores fora de faixa
    +
    +

### **Exemplo**

```java
try{

    // Executa o código que pode disparar exceção

}catch(Exception e){

    // Erata o erro
}
finally{

    // esse bloco é sempre executado, independente de ocorrer exceção

}

```

### Tratamento de exceções em java/blibliotecas de tratamento de exceção:

### Exceções frequentes

### Testando e capturando exceções

+ se a exceção for disparada, o bloco try não sera mais executado a partir do ponto onde a esceçao ocorreu
+ o fluxo de execução muda para a captura do catch
+ o bloco FINALLY é opcional


### exemplo
```java

int x = 0;

try{
    int y = 100/x;
    sout("Resultado: " + y);
}

catch (ArithmeticException e){
    sout("Operação invalida!");
    sout("\n Detalhes do erro: " + e.getMessage());
}

```

### Diferença entre: *Checked* & *unchecked*

**CHECKED:**

    throws 
    try catch

```java

package excecao;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
```
```java
package excecao;

public class AppMain {
    public static void main(String[] args) {
        Conta conta = new Conta();
        try {
            conta.saque(200);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
```


**UNchecked:**

    RuntimeException

```java
package excecao;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
```
```java
package excecao;

public class AppMain {
    public static void main(String[] args) {
        Conta conta = new Conta();        
        conta.saque(200);        
    }
}
```
