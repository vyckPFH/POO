package excecao;

public class Conta {
    private float saldo = 100;
    private int tempo = 0;

    public Conta() {

    }

    public void deposito(float valor) throws MyExceptions {
        if (valor < 0) {
            throw new MyExceptions("valor errado seu animal");
        }
        this.saldo += valor;
    }

    public void saque(float valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("vc n tem tudo isso não seu POBRE");
        }
        this.saldo -= valor;
    }

    public float media() throws Exception{
        if(tempo == 0){
            throw new Exception("Tempo não pode ser zero");
        }
        float resp = this.saldo / this.tempo;
        return resp;
    }




    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    

}