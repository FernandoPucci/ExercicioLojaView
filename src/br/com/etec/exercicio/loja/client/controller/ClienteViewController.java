/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.exercicio.loja.client.controller;

import br.com.etec.exercicio.loja.client.constantes.ConstantesNomenclaturas;
import br.com.etec.exercicio.loja.client.constantes.clientes.ConstantesBotoesClientesView;
import br.com.etec.exercicio.loja.client.controller.business.ClienteBusinessController;
import br.com.etec.exercicio.loja.client.threads.ClienteThreads;
import br.com.etec.exercicio.loja.client.view.clientes.CadastrarClienteView;
import br.com.etec.exercicio.loja.exceptions.NegocioException;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando-pucci
 */
public class ClienteViewController extends ClienteThreads {

    private final CadastrarClienteView cadastrarClienteView;
    private ClienteBusinessController clienteBusinessController;

    public ClienteViewController(CadastrarClienteView cadastrarClienteView) {

        this.cadastrarClienteView = cadastrarClienteView;

        if (this.clienteBusinessController == null) {

            this.clienteBusinessController = new ClienteBusinessController();

        }

    }

    public void acaoPressedController(AbstractButton botao) {

        if (botao.isEnabled()) {
            acao(botao.getName());
        }
    }

    public void acao(String botao) {

        //nothing to do yet
    }

    public void acaoRelease(AbstractButton botao) {

        if (botao.isEnabled()) {
            acaoRelease(botao.getName());
        }
    }

    public void acaoRelease(String botao) {

        //nothing to do yet
    }

    public void acaoClickController(AbstractButton botao) {

        if (botao.isEnabled()) {
            acaoController(botao.getName());
        }
    }

    //trata ações dos botoes clicados
    private void acaoController(String botao) {

        //TEST:
        System.out.println(botao);

        switch (botao) {

            case ConstantesBotoesClientesView.BUTTON_PESQUISAR_CLIENTE_MAIN:
                getThreadNotImplementYetMessage().start();
                break;
            case ConstantesBotoesClientesView.BUTTON_LIMPAR_CLIENTE_MAIN:
                getThreadNotImplementYetMessage().start();
                break;
            case ConstantesBotoesClientesView.BUTTON_SALVAR_CLIENTE_MAIN:
                getThreadCadastrarClienteView().start();
                break;

        }

    }

    //threads de cadastro
    private Thread getThreadCadastrarClienteView() {

        return new Thread() {

            public void run() {
                cadastrarClienteView();
            }

        };

    }

    //metodos
    public void cadastrarClienteView() {

        try {

            clienteBusinessController.cadastrarClienteBusiness(cadastrarClienteView.getNome(), cadastrarClienteView.getSobreNome(), null, null, null, null);

        } catch (NegocioException ne) {

            JOptionPane.showMessageDialog(cadastrarClienteView, ConstantesNomenclaturas.MENU_CLIENTE_TITLE_MESSAGE, ne.getMessage(), JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(cadastrarClienteView, ConstantesNomenclaturas.MENU_CLIENTE_TITLE_MESSAGE, ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

    }

}
