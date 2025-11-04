package br.edu.ifpr.agenda.view;

import java.util.ArrayList;

import br.edu.ifpr.agenda.controller.ContatoController;
import br.edu.ifpr.agenda.model.Contato;
import br.edu.ifpr.agenda.model.Endereco;

public class Main {
    public static void main(String[] args) {
        // Contato contato = new Contato();
        // Endereco endereco = new Endereco();
        ContatoController controller = new ContatoController();

        // endereco.setRua("rua");
        // endereco.setNumero("n");
        // endereco.setCidade("cidade");
        // endereco.setEstado("estado");
        // contato.setEndereco(endereco);

        // contato.setNome("nome");
        // contato.setCelular("celular");
        // contato.setEmail("email");

        // controller.cadastrarContato(contato);

        ArrayList<Contato> contatos = controller.selectContato();
        for (Contato contatoX : contatos) {

            System.out.println("Contato ID: " + contatoX.getId());
            System.out.println("Contato nome:" + contatoX.getNome());
            System.out.println("Contato telefone: " + contatoX.getCelular());
            System.out.println("Contato e-mail: " + contatoX.getEmail());
            System.out.println();
            // System.out.println("contato endereço id:" + contatoX.getEndereco().getId());
            // System.out.println(
            //         "Contato endereço: " + contatoX.getEndereco().getRua() + " " + contatoX.getEndereco().getNumero()
            //             + " " + contatoX.getEndereco().getCidade() + "/" + contatoX.getEndereco().getEstado()+ ";");

            // System.out.println("G" + contatoX.getEndereco().getNumero());
            // System.out.println("h" + contatoX.getEndereco().getCidade());
            // System.out.println("i" + contatoX.getEndereco().getEstado());
        
        }

        // Contato contatoUpdate = new Contato();
        // contatoUpdate.setId(1);
        // contatoUpdate.setNome("nomeAtualizado");
        // contatoUpdate.setCelular("celularUpdated");
        // contatoUpdate.setEmail("emailUpdated");

        // controller.atualizarContato(contatoUpdate);

        // controller.deleteSemEndereco(contatoUpdate);
    }
}