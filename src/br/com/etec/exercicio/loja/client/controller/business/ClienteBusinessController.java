/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.exercicio.loja.client.controller.business;

import br.com.etec.exercicio.loja.controller.ClienteController;
import br.com.etec.exercicio.loja.exceptions.NegocioException;

/**
 *
 * @author fernando-pucci
 */
public class ClienteBusinessController {

    private ClienteController clienteController;

    public ClienteBusinessController() {

        if (clienteController == null) {

            clienteController = new ClienteController();

        }

    }

    public void cadastrarClienteBusiness(String nome, String sobrenome, String cpf, String endereco, String cidade, String estado) throws NegocioException, Exception {
            
        clienteController.cadastrarClienteController(nome, sobrenome, cpf, endereco, cidade, estado);
        
    }

}
