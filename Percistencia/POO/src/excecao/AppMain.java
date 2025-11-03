package excecao;

public class AppMain {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println("Gerencia de conta");
        System.out.println();

        // try{

        // System.out.println(conta.media());

        // }catch (Exception e){
        // System.out.println(e.getMessage());
        // }

        // try {
        // conta.deposito(-56);
        // } catch (MyExceptions e) {
        // e.printStackTrace();
        // }

        try {
            conta.saque(200);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
