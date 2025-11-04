package br.edu.ifpr.agenda.controller;

import java.util.ArrayList;

import br.edu.ifpr.agenda.model.*;
import br.edu.ifpr.agenda.model.dao.ContatoDAO;

public class ContatoController {
    private ContatoDAO dao;

    public ContatoController(){
        this.dao = new ContatoDAO();
    }

    public void cadastrarContato(Contato contato){
        if (contato.getNome() == null || contato.getNome().isEmpty()) {
            System.out.println("Nome não pode ser nulo/vazio");
            return;
        }
        dao.salvar(contato);
    }

    public void atualizarContato(Contato contato){
        if (contato.getNome() == null || contato.getNome().isEmpty()) {
            System.out.println("Nome não pode ser nulo/vazio");
            return;
        }
        if(contato.getId() <= 0){
            System.out.println("Id inválido");
            return;
        }

        dao.updateSemEndereco(contato);
    }
    //alterar dps
    public void deleteSemEndereco(Contato contato){
        if (contato.getId() <= 0) {
            System.out.println("Id inválido!");
            return;
        }

        dao.deletebyidSemEndereco(1);
    }

    public ArrayList<Contato> selectContato(){
       return dao.select();
        
    }
}
