package br.edu.ifpr.agenda.view;

import br.edu.ifpr.agenda.controller.ContatoController;
import br.edu.ifpr.agenda.model.Contato;
import br.edu.ifpr.agenda.model.Endereco;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        ContatoController controller = new ContatoController();
        
        endereco.setRua("rua");
        endereco.setNumero("n");
        endereco.setCidade("cidade");
        endereco.setEstado("estado");
        contato.setEndereco(endereco);

        contato.setNome("nome");
        contato.setCelular("celular");
        contato.setEmail("email");

        controller.cadastrarContato(contato);
    }
}