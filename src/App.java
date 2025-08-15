public class App {
    public static void main(String[] args) {
      Endereco endereco = new Endereco();

      endereco.setRua("rua tal");
      endereco.setNumero("123");

      Pessoa pessoa = new Pessoa();

      pessoa.setNome("nome");
      pessoa.setEmail("email@email");
      pessoa.setEndereco(endereco);

      pessoa.getEndereco().getRua();
    }
}
